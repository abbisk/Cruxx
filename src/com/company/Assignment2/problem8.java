package com.company.Assignment2;

public class problem8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;

        while (row<=n){
            int col =1;
            while(col<=row){
                    System.out.println("1");

                if (col==1 || row == col){

                    System.out.print(row-1 + " ");

                }
                else{
                    System.out.print("0 ");

                }
                col = col+1;

            }
            row = row+1;

            System.out.println();

        }

    }
}
