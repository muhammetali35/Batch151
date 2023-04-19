package SSG;

import java.util.Arrays;

public class C02_Arrays {
    /*
    soru bir array oluşturun ve arraydeki sayilari kuçukten buyuğe sıralayın
     */
    public static void main(String[] args) {
        int sayilar[]= {3,5,7,11,9};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));//[3, 5, 7, 9, 11]


    }
}
