package karisiksorular;

import java.util.Scanner;

public class soru27TernaryOperator {
    public static void main(String[] args) {
// Kullanıcıdan bir tamsayı alın ve sayının tek veya çift olduğunu yazdırın
        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer");
        int num= input.nextInt();

        String result= (num%2!=0)? "single number" : "Couple number";
        System.out.println("Result : " + result);



    }
}
