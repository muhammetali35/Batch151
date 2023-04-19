package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    /*
    3) Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
     */

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(17);
        myList.add(6);
        myList.add(1);
        myList.add(13);
        int carpim=1;
        for (Integer w : myList) {
                if(w%2==0){
                    carpim*=w;
                }

        }
        System.out.println(carpim);


    }
}
