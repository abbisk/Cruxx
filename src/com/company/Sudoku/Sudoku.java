//package com.company.Sudoku;
//
//public class Sudoku {
//    public static void main(String[] args) {
//
//    }
//
//    public static void sudoku(int[][] board, int row , int col) {
//        if (row == board.length){
//            //display
//            return;;
//        }
//
//        if (col == board.length){
//            sudoku(board, row+1, 0);
//            return;
//        }
//        if (board[row][col] ==0){
//            for (int val = 0; val <9 ; val++) {
//                if(isSafe(board , row ,col , val)){
//                    board[row][col] = val;
//
//                }
//
//            }
//        }
//
//    }
//
//    private static boolean isSafe(int[][] board, int row, int col, int val) {
//        for (int r = 0; r <board.length ; r++) {
//            if (board[r][col] == val)
//
//        }
//    }
//}
