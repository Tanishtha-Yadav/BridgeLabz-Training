package com.day11.gamingapp;

//AVL Tree for Player Leaderboard
public class LeaderboardAVL {
 private AVLNode root;

 // Get height of a node
 private int height(AVLNode node) {
     return (node == null) ? 0 : node.height;
 }

 // Get balance factor
 private int getBalance(AVLNode node) {
     return (node == null) ? 0 : height(node.left) - height(node.right);
 }

 // Right rotate
 private AVLNode rightRotate(AVLNode y) {
     AVLNode x = y.left;
     AVLNode T2 = x.right;

     x.right = y;
     y.left = T2;

     y.height = Math.max(height(y.left), height(y.right)) + 1;
     x.height = Math.max(height(x.left), height(x.right)) + 1;

     return x;
 }

 // Left rotate
 private AVLNode leftRotate(AVLNode x) {
     AVLNode y = x.right;
     AVLNode T2 = y.left;

     y.left = x;
     x.right = T2;

     x.height = Math.max(height(x.left), height(x.right)) + 1;
     y.height = Math.max(height(y.left), height(y.right)) + 1;

     return y;
 }

 // Insert or Update player
 public void insertOrUpdate(Player player) {
     root = insertRec(root, player);
 }

 private AVLNode insertRec(AVLNode node, Player player) {
     if (node == null) return new AVLNode(player);

     // Insert based on points, higher points to left for descending order
     if (player.points > node.player.points) {
         node.left = insertRec(node.left, player);
     } else if (player.points < node.player.points) {
         node.right = insertRec(node.right, player);
     } else {
         // If points are equal, sort by username lexicographically
         if (player.username.compareTo(node.player.username) < 0) {
             node.left = insertRec(node.left, player);
         } else {
             node.right = insertRec(node.right, player);
         }
     }

     // Update height
     node.height = 1 + Math.max(height(node.left), height(node.right));

     int balance = getBalance(node);

     // Left Left
     if (balance > 1 && player.points > node.left.player.points)
         return rightRotate(node);

     // Right Right
     if (balance < -1 && player.points < node.right.player.points)
         return leftRotate(node);

     // Left Right
     if (balance > 1 && player.points < node.left.player.points) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     // Right Left
     if (balance < -1 && player.points > node.right.player.points) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 // In-order traversal to get players descending by points
 public void displayTopPlayers(int n) {
     System.out.println("--- Top " + n + " Players ---");
     int[] count = {0};
     inorderRec(root, count, n);
     System.out.println("---------------------------");
 }

 private void inorderRec(AVLNode node, int[] count, int n) {
     if (node != null && count[0] < n) {
         inorderRec(node.left, count, n);
         if (count[0] < n) {
             System.out.println(node.player);
             count[0]++;
         }
         inorderRec(node.right, count, n);
     }
 }

 // Remove player by username
 public void remove(String username) {
     root = removeRec(root, username);
 }

 private AVLNode removeRec(AVLNode node, String username) {
     if (node == null) return null;

     if (username.equals(node.player.username)) {
         // Node with only one child or no child
         if (node.left == null) return node.right;
         else if (node.right == null) return node.left;

         // Node with two children: Get inorder predecessor (max in left subtree)
         AVLNode pred = maxValueNode(node.left);
         node.player = pred.player;
         node.left = removeRec(node.left, pred.player.username);
     } else if (username.compareTo(node.player.username) < 0) {
         node.left = removeRec(node.left, username);
     } else {
         node.right = removeRec(node.right, username);
     }

     // Update height
     node.height = 1 + Math.max(height(node.left), height(node.right));

     int balance = getBalance(node);

     // Balancing rotations
     if (balance > 1 && getBalance(node.left) >= 0)
         return rightRotate(node);

     if (balance > 1 && getBalance(node.left) < 0) {
         node.left = leftRotate(node.left);
         return rightRotate(node);
     }

     if (balance < -1 && getBalance(node.right) <= 0)
         return leftRotate(node);

     if (balance < -1 && getBalance(node.right) > 0) {
         node.right = rightRotate(node.right);
         return leftRotate(node);
     }

     return node;
 }

 private AVLNode maxValueNode(AVLNode node) {
     AVLNode current = node;
     while (current.right != null)
         current = current.right;
     return current;
 }
}
