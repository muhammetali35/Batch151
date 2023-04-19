package day14Loops01;

import java.util.Scanner;

public class Loops01tekrar {
    public static void main(String[] args) {
        //Kullanicidan alinan bir tamsayinin tekrarsiz rakamlarinin toplamini bulunuz
        //1838 ==> 1 + 3 = 4

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        String sayi= input.next();

        int sum= 0;
        for (int i = 0; i < sayi.length() ; i++) {

            String d=sayi.substring(i,i+1);

            if(sayi.indexOf(d)!=sayi.lastIndexOf(d)) {

                sum=sum + Integer.valueOf(d);

            }

        }
        System.out.println(sum);


        //Bir String'deki tekrarli character'leri ekrana yazdiran kodu yaziniz
        //Alala ==> la


        String m= "Alala";
        String result = "";

        for(int i=0; i<m.length(); i++){

            char c=m.charAt(i);

            if(m.indexOf(c) != m.lastIndexOf(c) && !result.contains(""+c)){
                result=result+c;

            }
        }

        System.out.println(result);
    }
}
