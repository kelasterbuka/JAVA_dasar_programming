package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayAngka1 = {2,3,5,1,12,7,60,6,8,9};
        int[] arrayAngka2 = {0,4,3,2,1,5,9,8,7,4};

        // penjumlahan antara dua buah array

        int[] arrayHasil1 = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");

        // menggabungkan dua buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++){
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++){
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 2");

        // sorting reverse, mengurutkan tapi kebalik
        printArray(arrayAngka1, "array 1");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "reverse 1");

        printArray(arrayAngka2, "array 2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "reverse 2");

    }

    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2 ; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length ; i++){
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }

    private static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }


}
