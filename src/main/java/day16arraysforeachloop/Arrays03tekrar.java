package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03tekrar {
    public static void main(String[] args) {

  //Specific bir elemanın array'de olup olmadığını anlamak için gereken kodu yazınız

        String  names[] ={"K", "C", "R", "A", "S"};

        String el="A";
        int counter = 0;
        for(String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }

            if (counter > 0) {
                System.out.println(el + " arrayde var");

            } else {
                System.out.println(el + " arrayde yok");
            }

            //2.Way == binarySearch() (interview'de çıkabilir)

            Arrays.sort(names);
            int result= Arrays.binarySearch(names,el);
        System.out.println("binarySearch() ile " +result);//0 (indexini verir)

        if(result<0) {
            System.out.println(el + " array'de yok");
        }else{
            System.out.println(el + " array'de var");
        }




        }
}

