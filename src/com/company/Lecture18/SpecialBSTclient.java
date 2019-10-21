package com.company.Lecture18;

public class SpecialBSTclient {
    public static void main(String[] args) {
        SpecialBST<Integer> tree = new SpecialBST<>();
        tree.add(8);
        tree.add(3);
        tree.add(1);
        tree.add(6);
        tree.add(4);
        tree.add(7);
        tree.add(10);
        tree.add(14);
        tree.add(13);
        System.out.println(tree.closestbigger(10));
        tree.display();

    }
}
