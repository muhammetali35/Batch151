package karisikSorular2;

import java.util.Scanner;

public class basamakSayisiBulma {
    public static void main(String[] args) {
        /*
    Pozitif bir tamsayı okuyan ve sayının (on milyardan az) sahip olduğu basamak
    sayısını sayan bir Java programı yazın. editöre git

    Test Verileri
    On milyardan küçük bir tamsayı girin: 125463
    Beklenen Çıktı :

    Sayıdaki basamak sayısı: 6
         */

        Scanner input= new Scanner(System.in);
        System.out.println("On milyardan küçük bir tamsayı girin: ");
        long i=input.nextLong();


       if(i<1000000000*10 ){
            System.out.println((int )Math.log10(i)+1);
        }else {

           System.out.println("Sayı 10 milyardan küçük değil!!!");
       }



    }
}


