package engday07ifstatementternarystatement;

import java.net.Socket;

public class Ternary01 {
    public static void main(String[] args) {
  //Example 1: Type code to check if a number is even or not by using ternary

        int num=8;

        //1.Way: Use if-else
        if(num%2==0){System.out.println("Even");}else{System.out.println("Odd");}//Even

        //2.Way: Ternary
        //            Condition ? The code will be executed   :     The code will be executed
        //                               for true condition            for false condition
        String result= num%2==0 ?           "Even"            :            "Odd" ;
        System.out.println(result);//Even


        //Example 2: Type code to check if a number has 3 digits or not, use ternary

        int n=-143;

        n=Math.abs(n);//Absolute value

        String r= n>99 && n<1000 ? "It has 3 digits" : "It has no 3 digits";
        System.out.println(r); //It has 3 digits



    }
}
