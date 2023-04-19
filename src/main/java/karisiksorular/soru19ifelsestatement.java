package karisiksorular;

import java.util.Scanner;

public class soru19ifelsestatement {
    public static void main(String[] args) {
/*
 Kullanıcıdan bir üçgenin uc kenar uzunluğunu alın eğer uc kenar uzunluğu eşitse "Eşkenar üçgen"
 yazdırın diğer durumlarda ekrana "Eşkenar üçgen değil " yazdırın

 */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter  three sides of the triangle , please...");
        int side1= input.nextInt();
        int side2= input.nextInt();
        int side3= input.nextInt();

        if(side1== side3 && side2==side1){
            System.out.println("The triangle is equilateral");
        }else{
            System.out.println("The triangle isn't equilateral");
        }








    }
}
