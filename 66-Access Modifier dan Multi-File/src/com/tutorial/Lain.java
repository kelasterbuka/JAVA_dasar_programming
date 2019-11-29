package com.tutorial;

public class Lain {

    // bagian ini dapat diakses oleh siapa pun
    public static void methodPublic(){
        System.out.println("Lain:public");
    }

    // ini hanya dapat diakses oleh class yang bersangkutan
    private static void methodPrivate(){
        System.out.println("Lain:private");
    }

    // ini hanya dapat diakses oleh class dalam package yang sama
    static void methodDefault(){
        System.out.println("Lain:default");
    }

    // ini hanya dapat diaccess oleh class dalam package yang sama
    // dan subclassnya.
    protected static void methodProtected(){
        System.out.println("Lain:protected");
    }

}
