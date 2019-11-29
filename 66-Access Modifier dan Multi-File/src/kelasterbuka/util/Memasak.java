package kelasterbuka.util;

public class Memasak {

    public static void dagingPublic(){
        System.out.println("Kelas terbuka: Memasak: public");
    }

    private static void dagingPrivate(){
        System.out.println("Kelas terbuka: Memasak: private");
    }

    static void dagingDefault(){
        System.out.println("Kelas terbuka: Memasak: default");
    }

    protected static void dagingProtected(){
        System.out.println("Kelas terbuka: Memasak: protected");
    }
}
