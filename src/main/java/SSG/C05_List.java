package SSG;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    //Verilen list'te tekrar eden sayıları sadece 1 tane yapan bir method oluşturun
    //örnek [1,2,5,9,1,2,3] ==> [1,2,5,9,3]
    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(9);
        sayilar.add(9);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);


        tekrarsizListOlustur(sayilar);

    }

    public static void tekrarsizListOlustur(List<Integer> x) {
        List<Integer> tekrarsizList = new ArrayList<Integer>();
        for(int i=0; i<x.size(); i++){
            if(!tekrarsizList.contains(x.get(i))){
                tekrarsizList.add(x.get(i));
            }
        }
        System.out.println(tekrarsizList);
    }
}
