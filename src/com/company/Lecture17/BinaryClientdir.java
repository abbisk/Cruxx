package com.company.Lecture17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryClientdir {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/home/abhishek/Documents/folder");

        Scanner scanner = new Scanner(file);

        BinaryTree tree = new BinaryTree();

        file.listFiles();

        tree.display();

    }
}