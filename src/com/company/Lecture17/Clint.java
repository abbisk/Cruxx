package com.company.Lecture17;

import java.util.Scanner;

public class Clint {
    public static void main(String[] args) {
                GenericTree tree = new GenericTree();
                Scanner scanner = new Scanner("1 true 2 true 5 false true 6 false false true 3 true 7 false false true 4 false false");
                tree.populate(scanner);

                tree.display();

                System.out.println("-----");

                tree.preOrderItr();
            }
        }
