package practices;

import java.util.Scanner;

public class C05_For {
    public static void main(String[] args) {
        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayilardan 5 ile 10 arasındakiler haric, digerlerinin toplamını bulunuz

      */

        Scanner scan= new Scanner(System.in);
        int sum=0;
        for(int i=0; i<5; i++) {
            System.out.println("Bir sayı giriniz");
            int sayi= scan.nextInt();
            if(sayi>5 && sayi<10){
                System.out.println("Girdiğiniz sayı 5 ile 10 arasında olduğu için işleme alınmayacaktır.");
            }else{
                sum+= sayi;

            }
        }
                 System.out.println("Toplam "+ sum);


    }
}
