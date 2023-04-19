package QuestionBankApexQuestions;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set02 {
    /*
    Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
     */
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(12);
        myList.add(8);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(12);
        mySet.add(23);
        mySet.add(20);
        mySet.add(8);
        mySet.add(37);

        mySet.retainAll(myList);
        System.out.println(mySet);

    }
}