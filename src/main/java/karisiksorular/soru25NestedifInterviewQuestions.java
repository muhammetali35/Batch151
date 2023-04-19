package karisiksorular;

import java.util.Scanner;

public class soru25NestedifInterviewQuestions {
    public static void main(String[] args) {
        /*
        Kullanıcıdan artık yıl olup olmadığı kontrol etmek için yıl girmesini isteyin
        Kural 1: 4 ile bölünemeyen yıllar artık yıl değildir.
        Kural 2. 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
        Kural 3: 4un katı olmasına rağmen 100 ile bölünebilen yıllardan
                sadece 400'un katı olan yıllar artık yıldır.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz");
        short year= input.nextShort();

       if(year%4!=0){
           System.out.println("4 e bölünmüyor, artık yıl değildir");
       }
       if(year%4==0){
           if(year%100!=0){
               System.out.println("4 bölünen ancak 100 e bölünmeyen artık yıl");
           }
       }
       if (year%4==0){
           if(year%100==0){
               if(year%400==0){
                   System.out.println("4, 100 ve 400 e bölünen artık yıl");
               }               }
           }
       }

    }

