package SSG;

public class MethodOverLoading {
    public static int toplama(int sayi1, int sayi2,int sayi3){
        int sonuc=sayi1+sayi2+sayi3;
        return sonuc;

    }

    public static int toplama(int sayi1, int sayi2){
        int sonuc=sayi1+sayi2;
        return sonuc;
    }
    public static double toplama(double sayi1, double sayi2){
        double sonuc=sayi1+sayi2;
        return sonuc;
    }

    public static void main(String[] args) {

        System.out.println(toplama(1,2,3));
        System.out.println(toplama(1,2));
        System.out.println(toplama(6.5,5.4));

    }
}
