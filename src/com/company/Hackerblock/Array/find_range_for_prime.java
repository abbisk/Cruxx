package com.company.Hackerblock.Array;

import java.util.Scanner;

public class find_range_for_prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        prime(s,T);
    }

    public static void prime(Scanner s,int T) {
        while (T>0){
            int N = s.nextInt();
            int c = 2;
            int prime = 0;
            int i =2;
            while (i>=0){
                if(c==2){
                    prime++;
                }
                if(c>2) {
                    int j = 2;
                    while (j < c) {
                        int p = 0;
                        if (c % j == 0) {
                            j += c - j;
                            p++;
                        }
                        j++;
                        if (p == 0 && j == c) {
                            prime++;
                        }
                    }
                }
                if(prime==N){
                    System.out.println(i);
                    break;
                }
                i++;
                c++;
                }
            }
            T--;
        }

    }
