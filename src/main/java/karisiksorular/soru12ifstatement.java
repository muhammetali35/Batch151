package karisiksorular;

import java.util.Scanner;

public class soru12ifstatement {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı isteyin ve sayinin tek veya çift olduğunu yazdırın
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an ınteger, please...");
        int i= input.nextInt();
        if(i%2==0){
            System.out.println("The integer entered is couple.");
        }
        if (i%2!=0){
            System.out.println("The integer entered is single.");
        }
    }
}
