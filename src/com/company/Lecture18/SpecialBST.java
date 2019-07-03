package com.company.Lecture18;


import java.util.BitSet;

public class SpecialBST <T extends Comparable <T>> { // Here t is interface thats why it is extending T
    private Node root;

    public void add(T item){
        this.root = add(item, root);
    }

    private Node add(T item, Node node) {
        if(node == null){
            return new Node(item);
        }
        if(item.compareTo(node.value)<0){
            node.left = add(item,node.left);
        }
        if(item.compareTo(node.value)>0){
            node.right = add(item,node.right);
        }
        return node;
    }
    public void display(){
        display(root, "", "root");
    }


    private void display(Node node, String indent, String type) {
        if (node == null){
            return;
        }

        System.out.println(indent + node.value + " " + type); // Pre order if sout in middle then inorder if in last
        // then it will be post order
        display(node.left, indent + "\t", "left");
        display(node.right, indent + "\t", "right");
    }


    private void displayinrange(Node node, T start, T end) {
        if (node == null){
            return;
        }

        if(node.value.compareTo(start)>0){
            displayinrange(node.left,start,end);
        }
        if(node.value.compareTo(start)<0 && node.value.compareTo(end) <0){
            System.out.println(node.value);
        }
        if(node.value.compareTo(end)<0){
            displayinrange(node.right, start, end);
        }
    }
    private int closestbigger(T target){


    }

    public boolean find(T target){
        return find(root,target);
    }

    private boolean find(Node node, T target) {
        if (node == null){
            return false;
        }
        if (target.compareTo(node.value)==0){
            return true;
        }
        else if(target.compareTo(node.value)<0){
            return find(node.left,target);
        }
        else {
            return find(node.right,target);
        }
    }


    private class Node{
        T value;
        Node left;
        Node right;

        public  Node(T value){
            this.value = value;
        }
    }
}
