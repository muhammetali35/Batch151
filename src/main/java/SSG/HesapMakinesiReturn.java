package SSG;

public class HesapMakinesiReturn {
    public static int toplama(int sayi1, int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;

    }
    public static int cikarma(int sayi1, int sayi2){
        int sonuc=sayi1-sayi2;
        return sonuc;

    }
    public static int carpma(int sayi1, int sayi2){
        int sonuc=sayi1*sayi2;
        return sonuc;

    }
    public static int bolme(int sayi1, int sayi2){
        int sonuc=sayi1/sayi2;
        return sonuc;

    }

    public static void main(String[] args) {

        System.out.println("Toplama Sonucu "+toplama(24,4));
        System.out.println("Çıkarma Sonucu "+cikarma(24,4));
        System.out.println("Çarpma Sonucu " + carpma(24,4));
        System.out.println("Bölme Sonucu "+bolme(24,4));
    }
}
