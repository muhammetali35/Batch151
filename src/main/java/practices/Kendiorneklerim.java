package practices;


import java.util.Scanner;

public class Kendiorneklerim {
    //Hipotenüs hesaplayan bir kod yazınız
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age...");
        double age= scan.nextDouble();

        System.out.println("Enter your height...");
        double height= scan.nextDouble();


        double sonuc= hipotenusHesapla(5,12);
        System.out.println(sonuc);

       // System.out.println(hipotenusHesapla(5,12));

    }

    public static double hipotenusHesapla(int dikKenar1, int dikKenar2) {
        double hipo= Math.sqrt(dikKenar1*dikKenar1+dikKenar2*dikKenar2);
        return hipo;
    }


}
