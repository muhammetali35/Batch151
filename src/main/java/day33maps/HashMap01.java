package day33maps;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMap01 {
    public static void main(String[] args) {
        String s="Hello Henry!";
        System.out.println(getTheNumOfOccurenceOfLetter(s));

    }

    //Example 1:Verilen bir String'de hangi harfin kaç defa kullanıldığını veren method oluşturun.
    // "Hello Henry!"==> H=2, e=2, l=2 ,o=1, n=1, r=1, y=1

    public static TreeMap<String,Integer> getTheNumOfOccurenceOfLetter(String s){
        //String'deki harf dışı character'leri sil
        s=s.replaceAll("[^A-Za-z]","");

        //Görünüm sayılarını depolamak için Map oluştur.
        TreeMap<String,Integer> numOfOccurence=new TreeMap<>();

        //Harfleri al
        String letters[]=s.split("");

        //Loop oluştur
        for(String w : letters ){

            Integer numOfocc=numOfOccurence.get(w);
        if(numOfocc==null){
            numOfOccurence.put(w,1);
        }
        else {
            numOfOccurence.put(w,numOfocc+1);
        }
        }
        return numOfOccurence;


    }
}
