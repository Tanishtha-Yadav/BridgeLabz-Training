package com.day10.ecommerceinventory;

//Node of the BST
public class BSTNode {
 Product product;
 BSTNode left, right;

 public BSTNode(Product product) {
     this.product = product;
     this.left = this.right = null;
 }
}
