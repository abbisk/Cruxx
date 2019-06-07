package com.company.Lecture3;

public class question8 {
    public static void main(String[] args) {
        int n = 4;
        int row = 1;
        int count = 1;
        while (row<=n){
            int col =1;
            while(col<=row){
                System.out.print(count+" ");
                count = count+1;
                col = col+1;
            }
            row = row+1;
            System.out.println();
        }
    }
}
