package pratice2;

import java.util.HashSet;
import java.util.Set;

public class Set_Soru {
    /*
    Verilen bir Array'deki tekrarlı elemanları silip, sadece unique değerlerden oluşan bir liste
    haline getiren bir proğram yazınız.
     */

    public static void main(String[] args) {
        int arr[]={2,5,3,4,2,1,5,4,6,3,2,1,5,4};

        Set<Integer> hs1=new HashSet<>();

        for(Integer w : arr) {
            hs1.add(w);
        }
        System.out.println(hs1);
    }
}
