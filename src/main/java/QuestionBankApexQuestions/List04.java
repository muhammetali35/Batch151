package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List04 {
    /*
    4) Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
 (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
     */
    public static void main(String[] args) {

        List<String> mylist = new ArrayList<>();
        mylist.add("Yellow");
        mylist.add("Red");
        mylist.add("Green");
        mylist.add("Blue");

        List<String> mylist2 = new ArrayList<>();

        mylist2.addAll(mylist);
        Collections.sort(mylist2);
        System.out.println(mylist);
        System.out.println(mylist2);

        int size=mylist.size();
        int flag=0;

        for (int i=0; i<size; i++){
            if(mylist2.get(i).equals(mylist.get(size-1-i))){
                flag++;
            }
        }
        if(flag==size){
            System.out.println("Azalan sıradadır.");
        }else {
            System.out.println("Azalan sırada değildir.");
        }

    }
}
