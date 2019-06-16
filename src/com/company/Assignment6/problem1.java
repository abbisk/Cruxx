package com.company.Assignment6;

public class problem1 {
    public static void main(String[] args) {
        pattern1(4,0);

    }

    public static void pattern1(int row, int colum) {
        if (row==0){
            return;
        }
        if(colum==row){
            System.out.println();
            pattern1(row-1,0);
            return;
        }

    }
}
