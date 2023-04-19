package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01tekrar {
    public static void main(String[] args) {
    // Kullanıcıdan çoklu data'yı bir array'e yerleştirebilmesi için gereken kodu yazınız.
    /*
    1)Kullanıcıdan data almak için Scanner object oluşturulur.
    2)Çoklu data'yi yerleştirmek için bir array oluşturalım
    3)Array oluşturabilmek için kullanıcıdan array'e kaç tane eleman koyacağını alalım
    4)loop oluşturup eleman ekleme işlemini tekrar tekrar yapabilmeyim

     */

        Scanner input = new Scanner(System.in);
        System.out.println("Eklemek istediğiniz eleman sayısını giriniz ? ");
        int numOfElements=input.nextInt();

        String stdNAmes[]= new String[numOfElements];
        System.out.println("Çıkmak için q'ya basınız");

     for(int i=0; i<stdNAmes.length; i++){

         System.out.println((i+1)+". öğrencinin ismini giriniz");

         String name=input.next();

         if(name.equals("q")){
             break;
         }else {
             stdNAmes[i]=name;
         }
         System.out.println(Arrays.toString(stdNAmes));


     }





    }
}
