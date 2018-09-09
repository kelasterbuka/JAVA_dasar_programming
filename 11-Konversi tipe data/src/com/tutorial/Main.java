package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // program untuk konversi data

        int nilaiInt = 450; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        int a = 10;
        float b = 4;

        float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float)x / y;
        System.out.printf("%d / %d = %f \n",x,y,z);

    }
}
