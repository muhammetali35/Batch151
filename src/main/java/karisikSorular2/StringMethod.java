package karisikSorular2;

import java.util.Scanner;

public class StringMethod {
    //Verilen bir string’te harfler dışındaki rakam ve karakterleri bulan program..
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Karakterleri giriniz..");
        String str= input.next();

        System.out.println(str.replaceAll("[a-zA-Z0-9]",""));







    }
}
