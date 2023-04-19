package karisiksorular;

import java.util.Scanner;

public class soru30NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir tamsayı alın ve sayı 10dan kuçukse "Rakam", 100 den kuçukse "iki
        basamaklı sayi" değilse "üç basamaklı veya büyük sayi" yazdırın
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number, please...");
        int num= input.nextInt();

        String result= (num<10)? "Rakam" : (num<100)? "iki basamaklı sayi" : "üç basamaklı veya büyük sayi";
        System.out.println("Result: "+ result);

    }
}
