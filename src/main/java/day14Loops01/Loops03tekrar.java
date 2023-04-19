package day14Loops01;

import java.util.Scanner;

public class Loops03tekrar {
    public static void main(String[] args) {
            //While loop
        int i=0;
        while (i<0){
            System.out.println("While loop");
            i++;

        }
        //Do while loop
        int i1=0;
        do{
            System.out.println("Do-while loop");
            i1++;
        }while (i1<0);


        //Kullanici bir sayi girsin sayi, 100'den kucuk ise kullanici "KAZANDINIZ" mesaji alsin
        //diger durumlarda "Kaybettiniz" mesaji alsin

        Scanner input= new Scanner(System.in);

        do{

            System.out.println("Bir sayı giriniz");
            int sayi= input.nextInt();

            if(sayi<100){
                System.out.println("Kazandınız!");
            }else{
                System.out.println("Kaybettiniz!!!");
                break;
            }

        }while (true);

        //Kullanıcıdan alınan  bir kelimenin büyük harfle başlayıp nokta ile bittiğini
        // kontrol eden kodu yazınız

        Scanner input1= new Scanner(System.in);

        do{
            System.out.println("Bir kelime giriniz ");
            String word = input1.next();

            if(word.endsWith(".") && word.charAt(0)>='A' && word.charAt(0)<='Z' ){
                System.out.println("Kelime büyük harfle başlıyor ve nokta ile bitiyor");
            }else{
                System.out.println("Kelime verilen kurallara uymuyor");
                break;
            }

        }while (true);





    }
}
