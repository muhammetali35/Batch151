package QuestionBankApexQuestions;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    /*
    2) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(14);
        myList.add(13);
        myList.add(2);
        myList.add(1);

        int sum=0;
        for(Integer w : myList) {
            if(w==13){

                break;
            }
            sum+=w;

        }
        System.out.println(sum);

    }
}
