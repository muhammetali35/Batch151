package karisiksorular;

import java.util.Scanner;

public class soru23ifElseifstatement {
    public static void main(String[] args) {
        /*
        Kullnıcıdan maaş için bir teklif isteyin ve aşağıdaki değerlere göre cevap yazdırın
        teklif 80.000 in üzerinde ise "Kabul ediyorum"
        60-80.000 arasında ise "Konuşabiliriz"
        60.000 nin altında ise "Maalesef Kabul edemem" yazdırın
       */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an offer for the salary ");
        int salary= input.nextInt();

        if(salary>=80000){
            System.out.println("I accept it ");
        }
        else if(salary>=60000 && salary<80000 ){
            System.out.println("We can talk it ");
        }
        else if(salary<60000){
            System.out.println("Unfortunately, I cannot accept ");
        }

    }
}
