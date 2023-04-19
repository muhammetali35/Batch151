package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    /*
    Kullanicidan aldiginiz sayi cift ise yarisini ekrana yazdiriniz,
    tek ise "Bu sayi ikiye bolunmez" yazdiriniz
     */
    /*
    1) Ternary'de true ve false durumları için size verilen data type'ları farklı ise
    oluşturduğunuz container'in data tyoe'ini "Object" yapın.
    2)"Object" Java da bir class'dır.
      "Object" Java'daki butun class'ların "Parent"i dir. Yani babası Hz. Adem gibi
      "Object" Class'in "Parent"i yoktur.
      Java'da parent'i olmayan tek Class "Object Class" dir.

     */

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter an integer...");
        int num = input.nextInt();

        Object  result = num%2==0 ? num/2 : "Bu sayı ikiye bölünmez";

        System.out.println(result);



    }


}

