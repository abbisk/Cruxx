package com.company.Hackerblock.Array;

import java.util.Scanner;

public class farenheight_to_cels {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int minfh = s.nextInt();
        int maxfh = s.nextInt();
        int step = s.nextInt();
        while (minfh<=maxfh){
            long cels = Math.abs((minfh*5)-160)/9;
            System.out.println(minfh+" "+cels);
            minfh = minfh+step;
        }
    }
}
