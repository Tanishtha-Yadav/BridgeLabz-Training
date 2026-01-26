package com.day10.ecommerceinventory;

//BST implementation for Product Inventory
public class ProductBST {
 private BSTNode root;

 // Insert a product
 public void insert(Product product) {
     root = insertRec(root, product);
 }

 private BSTNode insertRec(BSTNode root, Product product) {
     if (root == null) return new BSTNode(product);

     if (product.sku < root.product.sku)
         root.left = insertRec(root.left, product);
     else if (product.sku > root.product.sku)
         root.right = insertRec(root.right, product);
     else
         System.out.println("SKU already exists!"); // duplicate SKUs not allowed

     return root;
 }

 // Lookup a product by SKU
 public Product lookup(int sku) {
     BSTNode node = searchRec(root, sku);
     return (node != null) ? node.product : null;
 }

 private BSTNode searchRec(BSTNode root, int sku) {
     if (root == null || root.product.sku == sku) return root;

     if (sku < root.product.sku)
         return searchRec(root.left, sku);
     else
         return searchRec(root.right, sku);
 }

 // Update product price by SKU
 public void updatePrice(int sku, double newPrice) {
     Product p = lookup(sku);
     if (p != null) {
         p.price = newPrice;
         System.out.println("Price updated successfully.");
     } else {
         System.out.println("Product not found!");
     }
 }

 // Display all products in sorted SKU order
 public void displaySorted() {
     System.out.println("--- Product Inventory (Sorted by SKU) ---");
     inorderRec(root);
     System.out.println("-----------------------------------------");
 }

 private void inorderRec(BSTNode root) {
     if (root != null) {
         inorderRec(root.left);
         System.out.println(root.product);
         inorderRec(root.right);
     }
 }
}

