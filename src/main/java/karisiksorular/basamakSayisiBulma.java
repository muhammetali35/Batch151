package karisiksorular;

import java.util.Scanner;

public class basamakSayisiBulma {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number= input.nextInt();

        //1.Way
        int basamakSayisi=String.valueOf(number).length();
        System.out.println("1.Way : "+basamakSayisi);

        //2.Way
        int digitCount = (int) Math.log10(number)+1 ;
        System.out.println("2.Way: " + digitCount);

        //3.Way
        int count= 0 ;
        while (number!=0){
            number=number/10;
            count++;
        }
        System.out.println("3.Way : "+ count);


        do {
            number=number/10;
            basamakSayisi++;

        }while (number != 0);
        System.out.println("4.Way Do While "+(basamakSayisi-1));

    }
}
