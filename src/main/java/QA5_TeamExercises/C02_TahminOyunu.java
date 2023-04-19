package QA5_TeamExercises;

import java.util.Random;
import java.util.Scanner;

public class C02_TahminOyunu {

    public static void main(String[] args) {
         /*
            random olarak 1 ile 100 arasinda bir sayi olusturun
            kullanicidan bu sayiyi bilmesini isteyin
            kullanici her deger girdiginde
            tuttugumuz sayi ile karsilastirip tahminini buyut/kucult diyelim
            kullanici tuttugumuz sayiyi bildiginde
            tahmin sayisini ve
            - 3 veya daha az tahminde bildiyse "Vaowww"
            - 4-8 tahminde bildiyse "Aferin"
            - daha fazla tahminde bildiyse "basarisiz"
            yazdirin
         */
      Random rmd=new Random();
      int IjTuttuguSayi=rmd.nextInt(100);

       // int IjTuttuguSayi = (int) (Math.random()*100);



        int tahmin=0;
        int tahminSayisi=0;


        while(IjTuttuguSayi!=tahmin){
            Scanner scan= new Scanner(System.in);
            System.out.print("Bir tahminde bulunun :");
            tahmin=scan.nextInt();

            if(tahmin==IjTuttuguSayi){
                tahminSayisi++;

            }else if(tahmin < IjTuttuguSayi){
                System.out.println("Büyüt");
                tahminSayisi++;

            }else {
                System.out.println("Küçült");
                tahminSayisi++;

            }

        }
        if(tahminSayisi<=3){
            System.out.println("Waooow");

        } else if (tahminSayisi>=4 && tahminSayisi<=8) {
            System.out.println("Aferin" );
        }else {
            System.out.println("Başarısız");
        }
    }
}
