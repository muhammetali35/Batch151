package QuestionBankApexQuestions;

import java.sql.DataTruncation;

public class Loops08 {
    /*
    8) 20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
bırakarak yazdırmak için gereken kodu yazınız.
     */
    public static void main(String[] args) {

        for(int i=20; i>2; i--) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }

        /*
        9) String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 'Ali Can?' ==> l*i*a*n*
         */

        String s="Ali Can?";

        System.out.println(s.replaceAll("[a-z]", "*"));

        /*
        10) Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
işaretiyle yazdırmak için gereken kodu yazınız.
Örneğin; 75.4238 ´ *4*2*3*8
         */

        double d=75.4238;

        String str=String.valueOf(d);

        int noktaIndex=str.indexOf(".");
        System.out.println(noktaIndex);

        String s1=str.substring(noktaIndex+1);
        System.out.println(s1);//4238
        String t="";
        for (int i=0; i<s1.length(); i++){
            String s2 = s1.substring(i,i+1);
            t=t+"*"+s2;

        }
        System.out.print(t);




    }
}
