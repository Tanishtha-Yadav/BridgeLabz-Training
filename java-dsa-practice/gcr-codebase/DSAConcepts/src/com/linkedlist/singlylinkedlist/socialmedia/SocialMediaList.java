package com.linkedlist.singlylinkedlist.socialmedia;

class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int id) {
        friendId = id;
        next = null;
    }
}

class UserNode {
    int userId, age;
    String name;
    FriendNode friends;
    UserNode next;

    UserNode(int id, String name, int age) {
        this.userId = id;
        this.name = name;
        this.age = age;
        friends = null;
        next = null;
    }
}

public class SocialMediaList {
    UserNode head;

    // Add user
    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Find user by ID
    UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    // Add friend connection
    void addFriend(int u1, int u2) {
        UserNode user1 = findUser(u1);
        UserNode user2 = findUser(u2);
        if (user1 == null || user2 == null) return;

        addFriendNode(user1, u2);
        addFriendNode(user2, u1);
    }

    void addFriendNode(UserNode user, int fid) {
        FriendNode f = new FriendNode(fid);
        f.next = user.friends;
        user.friends = f;
    }

    // Remove friend connection
    void removeFriend(int u1, int u2) {
        removeFriendNode(findUser(u1), u2);
        removeFriendNode(findUser(u2), u1);
    }

    void removeFriendNode(UserNode user, int fid) {
        if (user == null || user.friends == null) return;

        if (user.friends.friendId == fid) {
            user.friends = user.friends.next;
            return;
        }

        FriendNode temp = user.friends;
        while (temp.next != null && temp.next.friendId != fid)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Display friends of a user
    void displayFriends(int id) {
        UserNode user = findUser(id);
        if (user == null) return;

        System.out.print("Friends of " + user.name + ": ");
        FriendNode f = user.friends;
        while (f != null) {
            System.out.print(f.friendId + " ");
            f = f.next;
        }
        System.out.println();
    }

    // Mutual friends
    void mutualFriends(int u1, int u2) {
        UserNode user1 = findUser(u1);
        UserNode user2 = findUser(u2);
        if (user1 == null || user2 == null) return;

        System.out.print("Mutual Friends: ");
        for (FriendNode f1 = user1.friends; f1 != null; f1 = f1.next) {
            for (FriendNode f2 = user2.friends; f2 != null; f2 = f2.next) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
            }
        }
        System.out.println();
    }

    // Search user
    void searchUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                System.out.println("Found ID: " + temp.userId);
            temp = temp.next;
        }
    }

    // Count friends
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Amit", 20);
        sm.addUser(2, "Neha", 21);
        sm.addUser(3, "Ravi", 22);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);

        sm.displayFriends(1);
        sm.mutualFriends(1, 2);
        sm.countFriends();
    }
}
