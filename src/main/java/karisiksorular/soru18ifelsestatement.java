package karisiksorular;

import java.util.Scanner;

public class soru18ifelsestatement {
    public static void main(String[] args) {
        /*
        Kullanıcıya yaşını sorun eğer yas 65 den küçükse "emekli olamasın, çalışmalısın"
        eğer yas 65e eşit veya büyükse "emekli olabilirsin" yazdır
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age, please...");
        byte age =input.nextByte();

        if(age>=65){
            System.out.println("You could retired");
        }else {
            System.out.println("You cannot retired, you have to work");
        }









    }
}
