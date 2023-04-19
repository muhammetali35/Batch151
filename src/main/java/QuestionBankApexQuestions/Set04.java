package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set04 {
    /*
    4) Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
bir kod yazınız.
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(20);
        myList.add(35);
        myList.add(19);
        myList.add(87);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(35);
        mySet.add(19);
        mySet.add(23);
        mySet.add(7);
        mySet.add(12);

        mySet.removeAll(myList);
        System.out.println(mySet);


    }
}
