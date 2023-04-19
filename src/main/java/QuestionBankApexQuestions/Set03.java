package QuestionBankApexQuestions;

import java.util.*;

public class Set03 {
    /*
    3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
Örnek: ‘Mississippi’ ´ Misp
     */
    public static void main(String[] args) {
        String s ="Mississippi";
        String [] arr= s.split("");

        List<String> character = Arrays.asList(arr);

        Set<String> mySet=new HashSet<>(character);
        System.out.println(mySet);

    }

}
