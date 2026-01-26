package com.day10.ecommerceinventory;

import java.util.Scanner;

//Main class for demonstration
public class ECommerceInventory {

 public static void main(String[] args) {
     ProductBST bst = new ProductBST();
     Scanner sc = new Scanner(System.in);
     int choice;

     do {
         System.out.println("\n1. Add Product");
         System.out.println("2. Lookup Product by SKU");
         System.out.println("3. Update Product Price");
         System.out.println("4. Display All Products");
         System.out.println("0. Exit");
         System.out.print("Enter choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter SKU: ");
                 int sku = sc.nextInt();
                 sc.nextLine(); // consume newline
                 System.out.print("Enter Product Name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter Price: ");
                 double price = sc.nextDouble();
                 bst.insert(new Product(sku, name, price));
                 break;
             case 2:
                 System.out.print("Enter SKU to lookup: ");
                 int lookupSKU = sc.nextInt();
                 Product p = bst.lookup(lookupSKU);
                 if (p != null) System.out.println("Found: " + p);
                 else System.out.println("Product not found.");
                 break;
             case 3:
                 System.out.print("Enter SKU to update price: ");
                 int updateSKU = sc.nextInt();
                 System.out.print("Enter new price: ");
                 double newPrice = sc.nextDouble();
                 bst.updatePrice(updateSKU, newPrice);
                 break;
             case 4:
                 bst.displaySorted();
                 break;
             case 0:
                 System.out.println("Exiting...");
                 break;
             default:
                 System.out.println("Invalid choice!");
         }

     } while (choice != 0);

     sc.close();
 }
}

