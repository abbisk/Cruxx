package com.company.Lecture10;

import java.util.Scanner;

public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];
        ////////// boolean array initiliazed way
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board[i].length; j++) {
//                System.out.println();
//
//            }
//
//        }
        nquiz(board,0);

    }

    public static void nquiz(boolean board[][], int row) {
        if (row == board.length) {
            display(board);

        }
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                nquiz(board, row + 1);
                //// Now if false then check previous case and make that case also false because we made that true then we come upto this
                board[row][col] = false;

            }

        }

    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        /////////Horizontal
        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }

        }
        /////////left diagonal
        for (int i = 1; i <Math.min(row,col) ; i++) {
            if(board[row-i][col-1]){
                return false;
            }

        }
        //////////right diagonal
        for (int i = 1; i <Math.min(row,board.length-col-1) ; i++) {
            if(board[row-i][col+1]){
                return false;
            }

        }
        return true;

    }

    private static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
