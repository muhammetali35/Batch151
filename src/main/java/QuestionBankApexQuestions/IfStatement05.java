package QuestionBankApexQuestions;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        /*
        5) Type code to print
 a) "Isosceles Triangle" if two sides of a triangle are equal in length.
 b) "Equilateral Triangle" if all sides of a triangle are equal in length.
 c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the sides of the triangle, please ");

        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();

        if(side1==side2 && side3==side2){
            System.out.println("Equilateral Triangle");
        }else if((side1==side2 && side3!=side2) || (side2==side3 && side3!=side1)){
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Neither isosceles, nor equilateral");
        }




    }
}
