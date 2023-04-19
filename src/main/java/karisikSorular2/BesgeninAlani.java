package karisikSorular2;

import java.util.Scanner;

public class BesgeninAlani {
    /*
    Bir beşgenin alanını oluşturmak için bir Java yöntemi yazın.

     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Düzgün olmayan Beşgenin Kenar uzunlukalarını giriniz ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();

        System.out.println(alanHesapla(a,b,c,d,e));

    }

    public static double alanHesapla(double a, double b, double c, double d, double e){

        double s=(a+b+c+d+e)/2;

        double alan=Math.sqrt((s-a)*(s-b)*(s-c)*(s-d)*(s-e));
        return alan;

    }
}
