package karisiksorular;

import java.util.Scanner;

public class soru22ifElseifstatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden notunu isteyin. Not'u harf sistemine çevirip
        50 den küçükse "D" 50-60 arası ise "C" 60-80 arası ise "B" 80 üzerinde ise "A" yazdırın

         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the your point, please...");
        byte po= input.nextByte();

        if(po<50){
            System.out.println("D");
        }
        else if (po<60){
            System.out.println("C");
        }
        else if (po<80){
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }

    }
}
