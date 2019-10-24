package com.example.myapplication;

import java.util.Scanner;

public class Array {
    static Scanner in = new Scanner(System.in);

    static void writeArray(int [][] a, int N, int M){
        for (int j = 0; j < M-1; j++) {
            for (int i = N; i >= 0; --i) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void takeArray(int[][] a, int M, int N){
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < M-1; j++) {
                a[i][j] = in.nextInt();
            }
        }

    }

    public static void main(String[] args) {
        int N = in.nextInt(), M = in.nextInt();
        int[][] a = new int[N][M];
        //takeArray(a, N, M);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println(M+" " + N);

        for (int j = 0; j < M; j++) {
            for (int i = N - 1; i >= 0; i--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
