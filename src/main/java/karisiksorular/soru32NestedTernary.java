package karisiksorular;

import java.util.Scanner;

public class soru32NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin uzunluğunu ve genişliğini alın, girilen değerlere göre
        dikdörtgenin kare olup olmadığını yazdırın
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the long side of the the rectangular, please...");
        int longSide= input.nextInt();

        System.out.println("Enter the short side of the the rectangular, please...");
        int shortSide= input.nextInt();


        String result= (longSide==shortSide)? "Square" : "Not Square";
        System.out.println(result);



    }
}
