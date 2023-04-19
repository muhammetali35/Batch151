package practices;

import java.util.Scanner;

public class C01_cdenOncekia {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen 'a' ve 'c' harflerini içeren bir kelime yazınız");
        String str=input.nextLine().toLowerCase();

        int count=0;

        for(int i=0; i<str.indexOf("c"); i++) {
            if(str.charAt(i)=='a') {
                count++;
            }
        }
        System.out.println(count);

        //2.Yol

        int sayac = 0;
        if (str.contains("c") && str.contains("a")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    sayac++;
                } else if (str.charAt(i) == 'c') {
                    break;
                }//else if

            }//for loop
            System.out.println("C'den onceki a sayisi " + sayac);

        } else {
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");


    }
}}
