package SSG;

public class MethodHesapMakinesi {
    public static void toplama(int sayi1, int sayi2){
        int sonuc= sayi1+sayi2;
        System.out.println(sayi1+" + "+sayi2+" = "+sonuc);
    }
    public static void cikarma(int sayi1, int sayi2){
        int sonuc= sayi1-sayi2;
        System.out.println(sayi1+" - "+sayi2+" = "+sonuc);
    }
    public static void carpma(int sayi1, int sayi2){
        int sonuc= sayi1*sayi2;
        System.out.println(sayi1+" * "+sayi2+" = "+sonuc);
    }
    public static void bolme(int sayi1, int sayi2){
        int sonuc= sayi1/sayi2;
        System.out.println(sayi1+" / "+sayi2+" = "+sonuc);
    }

    public static void main(String[] args) {
        System.out.println("Toplama");
        toplama(24,4);
        System.out.println("Çıkarma");
        cikarma(24,4);
        System.out.println("Çarpma");
        carpma(24,4);
        System.out.println("Bölme");
        bolme(24,4);

    }
}
