package karisiksorular;

import java.util.Scanner;

public class soru28TernaryOperator {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alın ve sayının mutlak değerini yazdırın.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number, please...");
        int num= input.nextInt();

        int result= (num<0)? -num : num;
        System.out.println("Result = " + result);

        int abs= Math.abs(num);
        System.out.println("Math.abs() methodu kullanılarak yapılan : "+abs);


    }
}
