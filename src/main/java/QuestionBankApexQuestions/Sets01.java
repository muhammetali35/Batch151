package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets01 {
    /*
    Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
     */

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 31, 15,7, 15, 7, 7);

        Set<Integer> mySet = new HashSet<>(list);
        System.out.println(mySet.size());
    }
}
