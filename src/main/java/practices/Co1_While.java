package practices;

import java.util.Scanner;

public class Co1_While {
    //Kullanıcıdan sisteme bir rakam girmesini isteyiniz.
    //Kullanıcının girdiği rakamın while loop kullanrak faktöriyelini bulunuz.
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Bir rakam giriniz.");
        int rakam=input.nextInt();

        int num=1;

        int faktoriyel=1;

        while (num<=rakam){
            faktoriyel=faktoriyel*num;
            num++;

        }

        System.out.println(rakam+"! "+" = "+faktoriyel);


    }
}
