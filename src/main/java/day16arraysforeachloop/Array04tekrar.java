package day16arraysforeachloop;

import java.util.Arrays;

public class Array04tekrar {
    public static void main(String[] args) {

 //Size verilen bir cumlede kaç kelime olduğunu gösteren kodu yazınız.

        String s="Java is easy. Learn Java earn money";

        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money]
        System.out.println(words.length);//7

 //Size verilen bir cümlede kaç harf olduğunu gösteren kodu yazınız.//İnterview sorusu olabilir

        String s2 ="Java is easy. Learn Java earn money";

      String letter[]= s2.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letter));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]
        System.out.println(letter.length);

       // String s3 ="Java is easy. Learn Java earn money";
       // int result= s3.replaceAll("[^a-zA-Z]", "").length();
       // System.out.println(result);//28






    }
}
