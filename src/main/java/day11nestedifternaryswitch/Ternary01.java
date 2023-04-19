package day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    /*
    Kullanıcıdan alınan iki sayıdan küçük olanını ekrana yazdırın
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter two integers ");
        int first= input.nextInt();
        int second= input.nextInt();

        //1.Yol Use if else
        if(first<second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
        //2.Yol Use Ternary

        int result= first<second ? first : second;
        System.out.println("2.Way : " +result);







    }
}
