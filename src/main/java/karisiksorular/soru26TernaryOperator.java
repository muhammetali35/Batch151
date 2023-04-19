package karisiksorular;

import java.util.Scanner;

public class soru26TernaryOperator {
    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alın ve buyuk olmayan sayıyı yazdırın.

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz...");
        int s1=input.nextInt();
        int s2=input.nextInt();

       String sonuc= (s1<s2)?"s1":"s2";
        System.out.println("sonuc = " + sonuc);


    }
}
