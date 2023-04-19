package day15loopsarrays;

import java.util.Arrays;

public class Arrays02tekrar {
    public static void main(String[] args) {

 //Example 1: grades array'indeki en küçük ve en buyuk grade'in toplamını ekrana yazdıran kodu yazınız.

        int grades []= {60,100,40,35,85};
        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//[35, 40, 60, 85, 100]

        System.out.println(grades[0]+ grades[grades.length-1]);//135

   //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character
   // icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w: stdNames  ){
            if(w.length()<5){
                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra
        // T ile baslayan kisilerden onceki isimleri console'a yazdiriniz

        String stdNames1[] = new String[5];
        stdNames1[0] = "Ajda";
        stdNames1[3] = "Cuneyt";
        stdNames1[2] = "Tom";
        stdNames1[1] = "Ayhan";
        stdNames1[4] = "Filiz";

        Arrays.sort(stdNames1);

        for(String w1: stdNames1){
            if(w1.startsWith("T")){
                break;
            }else {
                System.out.print(w1+" ");
            }
        }









    }
}
