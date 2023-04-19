package karisiksorular;

import java.util.Scanner;

public class soru37SwitchStatement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı girmesini isteyin
        Girilen sayı
        10 ise "İki basamaklı en küçük sayı"
        100 ise "Üç basamaklı en küçük sayı"
        1000 ise "Dört basamaklı en küçük sayı"
        diğer durumlarda "Gridiğin sayıyı değiştir" yazdırın

         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number,please... ");
        int num= input.nextInt();

        switch (num){

            case 10:
                System.out.println("Two-digit minimum number ");
                break;
            case 100:
                System.out.println("Three-digit minimum number ");
                break;
            case 1000:
                System.out.println("Four-digit minimum number ");
                break;
            default:
                System.out.println("Change the number you entered ");
                break;

        }

    }
}
