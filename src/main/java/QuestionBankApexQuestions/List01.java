package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    /*
    1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(5);
        myList.add(3);
        myList.add(2);
        myList.add(1);

        int sum=0;
        for (Integer w : myList) {
            sum+=w;
        }
        System.out.println(sum);
    }
}
