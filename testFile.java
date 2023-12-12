package com.array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        System.out.println("\n=== array multi dimensi ===\n");

        // saya udah belajar array 1D, dengan contoh seperti di bawah
        int[] array1D = {1,2,3};
        System.out.println("Array 1D = " + Arrays.toString(array1D));

        // Array Multi Dimensi  |  cara penulisan nya = int[][] array2D = { {} , {} }; atau seperti di bawah
        int[][] array2D = {
                {1,2,3} ,
                {4,5,6}
        };
        // array 2D tidak bisa menggunakan .toString
        System.out.println("array 2D = "+Arrays.deepToString(array2D));

        System.out.println("\n======\n");

        // cara membuat array 2D dengan deklarasi
        // int[baris][kolom]
        int[][] arrayDeklarasi = new int[3][4];

        printArray(array2D);
        printArray2(array2D);
        printArray3(arrayDeklarasi);

        System.out.println("\n=== print memori arrayDeklarasi  ===");
        for (int i = 0 ; i < arrayDeklarasi.length ; i++)
            System.out.println(Arrays.toString(arrayDeklarasi[i]));

    }

    // fungsi print array untuk print mejadi ke bawah
    private static void printArray(int[][] dataArray){
        System.out.println("=== print array 1 ===");
        for (int i = 0 ; i < dataArray.length ; i++)
            System.out.println(Arrays.toString(dataArray[i]));
    }

    private static void printArray2(int[][] dataArray){
        System.out.println("=== print array 2 manual ===");
        for (int i = 0 ; i < dataArray.length ; i++){
            System.out.print("[");
            for (int j = 0 ; j < dataArray[i].length ; j++){
                System.out.print(dataArray[i][j] + ",");
            }
            System.out.print("]\n");
        }
    }

    // for each loop
    private static void printArray3(int[][] dataArray){
        System.out.println("=== print array 3 for each ===");
        for (int[] baris : dataArray) {
            System.out.print("[");
            for (int kolom : baris){
                System.out.print(kolom + ",");
            }
            System.out.println("]");
        }
    }
}
