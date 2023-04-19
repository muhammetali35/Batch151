package pratice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */
    public static void main(String[] args) {


    List<Integer> sayilar = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println(sayilar);
        for (int i = 0; i < sayilar.size() ; i++) {

            if(sayilar.get(i)>10){
                sayilar.set(i, sayilar.get(i)*2);

            }
        }
        System.out.println(sayilar);






    }
}
