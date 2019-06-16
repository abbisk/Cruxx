package com.company.Hackerblock.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quadretic_eqn {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            ArrayList<Integer> arr = new ArrayList<Integer>();
            while (s.hasNextInt()){
                arr.add(s.nextInt());
            }


            int a =arr.get(0) , b =arr.get(1) , c =arr.get(2) ;
            int root1, root2;

            int d = b * b - 4 * a * c;

            // condition for real and different roots
            if(d > 0) {
                root1 = (int) ((-b + Math.sqrt(d)) / (2 * a));
                root2 = (int) ((-b - Math.sqrt(d)) / (2 * a));

                System.out.print(root2 + " "+root1);
            }
            // Condition for real and equal roots
            else if(d == 0) {
                root1 = root2 = -b / (2 * a);

                System.out.print(root1+" "+root2);
            }
            // If roots are not real
            else {
                int realPart = -b / (2 *a);
                int imaginaryPart = (int) (Math.sqrt(d) / (2 * a));
                int rt = realPart-imaginaryPart;

                System.out.print(realPart+imaginaryPart+ " " +rt);
            }
        }
    }

