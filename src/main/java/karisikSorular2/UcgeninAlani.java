package karisikSorular2;

import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Scanner;

public class UcgeninAlani {
    /*
     Kullanıcıdan bir üçgenin alanını hesaplamak için Java yöntemlerini yazın.
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Üçgenin kenarlarını giriniz ");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        double alan= alanHesapla(a,b,c);

        System.out.println("Üçgenin alanı: "+alan);

    }

    public static double alanHesapla(double a, double b, double c) {

        double s=(a+ b+c)/2.0; //yarı çevre bul

        // alan hesapla

        double alan=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        return alan;

    }

}
