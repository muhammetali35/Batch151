package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        // Kullanıcıdan çoklu data'yı bir array'e yerleştirebilmesi için gereken kodu yazınız.
        /*
        1)Kullanıcıdan data almak için Scanner object oluşturulur.
        2) Çoklu data'yi yerleştirmek için bir array oluşturalım
        3)Array oluşturabilmek için kullanıcıdan array'e kaç tane eleman koyacağını alalım
        4) loop oluşturup eleman ekleme işlemini tekrar tekrar yapabilmeyim

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of elements you want to add");
        int numOfElements= input.nextInt();


        String stdNames[]= new String[numOfElements];
        System.out.println("To stop adding press 'q' ");

        for(int i=0; i<stdNames.length; i++){

            System.out.println("Enter the "+ (i+1) +". student name ");

            String name=input.next();

            if(name.equals("q")){
                break;
            }else{
                stdNames[i]=name;
            }
            System.out.println(Arrays.toString(stdNames));


        }






    }
}
