package day12switchincrementdecrementloops;

public class IncrementDecrement {
    /*
           1) "Increment" artırmak demektir, "Decrement" azaltmak demektir.
           2) "Increment" toplama ve çarpma ile "Decrement" çıkarma ve bölme ile yapılmaktadır.
           3) "Increment" "Decrement" 3 yolla yapılır.
                 i) int i=12 ; ==> i= i+5;
                 ii) int i=12 ; ==> i +=5;
                 iii) int i=12 ; ==> i++;
                 Note: 3. yol sadece 1 artırmak için kullanılır.

                  i) int i=12 ; ==> i = i-5;
                  ii) int i=12 ; ==> i -=5;
                  iii) int i=12 ; ==> i--;
                  Note: 3. yol sadece 1 azaltmak için kullanılır.


     */
    public static void main(String[] args) {
        int age =12;

        //age =age++; //12 Post İncrement

        age=++age;//13  Pre İncrement

        System.out.println(age);

        int salary=40;
        salary=salary--;// Post Decrement
        System.out.println(salary);//40

        salary=--salary;//Pre Decrement
        System.out.println(salary);//39


    }


}
