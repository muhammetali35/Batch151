package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set05 {
        /*
        5) Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.
         */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(19);
        myList.add(35);
        myList.add(10);
        myList.add(10);
        myList.add(2);

        Set<Integer> mySet = new HashSet<>(myList);

        if(myList.size()>mySet.size()){
            System.out.println("List'te tekrarlı eleman var");
        }else {
            System.out.println("List'te tekrarlı eleman yok");
        }




    }

}
