package karisiksorular;

import java.util.Scanner;

public class soru21ifElseifstatement {
    public static void main(String[] args) {
        /*
  Kullanıcıdan iki sayı isteyin, sayıların ikisi de pozitif ise sayıların toplamını yazdırın,
  sayıların ikisi de negative ise sayıların çarpımını yazdırın, sayıların ikisi farklı
  işaretlere sahipse "farklı işaretlerde sayılarla işlem yapamazsın" yazdırın
  sayılardan sıfıra eşit olan varsa "sifir çarpmaya göre yutan elemandır" yazdırın
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two number, please...");
        int num1 =input.nextInt();
        int num2 =input.nextInt();

        if(num1>0 && num2>0){
            System.out.println(num1+num2);
        }
        else if(num1<0 && num2<0){
            System.out.println(num1*num2);
        }
        else if(num1>0 && num2<0 || num1<0 && num2>0){
            System.out.println("You cannot handle numbers on different sing");
        }
        else if (num1==0 || num2==0){
            System.out.println("Sifir çarpmaya göre yutan elemandır");
        }







    }
}
