package com.linkedlist.singlylinkedlist.inventorymanagement;

class ItemNode {
    int itemId, quantity;
    String itemName;
    double price;
    ItemNode next;

    ItemNode(int id, String name, int qty, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = price;
        this.next = null;
    }
}

public class Inventory {
    ItemNode head;

    // Add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;

        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove by Item ID
    void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Update quantity
    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by ID
    void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println(temp.itemName + " Qty:" + temp.quantity);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Name
    void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name))
                System.out.println(temp.itemId + " Price:" + temp.price);
            temp = temp.next;
        }
    }

    // Total inventory value
    void totalInventoryValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value = " + total);
    }

    // Sort by Item Name (Ascending)
    void sortByNameAsc() {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if (i.itemName.compareToIgnoreCase(j.itemName) > 0) {
                    swapData(i, j);
                }
            }
        }
    }

    // Sort by Price (Descending)
    void sortByPriceDesc() {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if (i.price < j.price) {
                    swapData(i, j);
                }
            }
        }
    }

    // Swap node data
    void swapData(ItemNode a, ItemNode b) {
        int id = a.itemId; a.itemId = b.itemId; b.itemId = id;
        String name = a.itemName; a.itemName = b.itemName; b.itemName = name;
        int qty = a.quantity; a.quantity = b.quantity; b.quantity = qty;
        double p = a.price; a.price = b.price; b.price = p;
    }

    // Display inventory
    void display() {
        ItemNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " " + temp.itemName +
                    " Qty:" + temp.quantity + " Price:" + temp.price);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addAtEnd(101, "Pen", 50, 10);
        inv.addAtEnd(102, "Notebook", 30, 50);
        inv.addAtBeginning(103, "Pencil", 100, 5);

        inv.display();
        inv.updateQuantity(101, 70);
        inv.searchByName("Pen");
        inv.totalInventoryValue();

        inv.sortByPriceDesc();
        System.out.println("After Sorting by Price:");
        inv.display();
    }
}

