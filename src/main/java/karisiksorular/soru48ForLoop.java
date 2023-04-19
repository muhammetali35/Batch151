package karisiksorular;

import java.util.Scanner;

public class soru48ForLoop {
    public static void main(String[] args) {
        //Interview Question
        //Kullanıcıdan bir String isteyin. Kullanıcının girdiği String'in palindrome olup
        //olmadığını kontrol eden bir proğram yazın

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ,please... ");
        String s = input.nextLine();


        String ters="";
        for(int i=s.length()-1; i>=0; i--){
            ters=ters+s.charAt(i);
        }
        if(ters.equals(s)){
            System.out.println(s+": Palindrome");
        }else {
            System.out.println(s+ ": Palindrome değil");
        }


    }
}
