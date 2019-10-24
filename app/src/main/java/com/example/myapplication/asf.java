package com.example.myapplication;

import java.util.Scanner;

public class asf {
    static Scanner in = new Scanner(System.in);

    static int length(int a){
        int i = 0;
        while (a > 0){
            a/=10;
            i++;
        }
        return i;
    }

    static void destroy(int a, int b[]){
        for (int i = 0; i < b.length; i++) {
            b[i] = a%10;
            a/=10;
        }
    }

    static void check(int b[], int count){
        int n = 1;
        for (int i = 0; i < b.length; i++) {
            for (int j = n; j < b.length; j++) {
                if (b[i] == b[j]){
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int a = in.nextInt(), a1 = a, count = 0;
        int b[] = new int[length(a)];
        destroy(a1, b);
        check(b, count);
        if (count > 0) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
