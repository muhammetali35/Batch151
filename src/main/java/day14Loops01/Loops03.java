package day14Loops01;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        int i=1;
        while(i<1){ //While loop'da loop body'si hiç çalışmaması mümkündür.(Zero execution is possible)
            System.out.println("While loop");
            i++;
        }
        //do-while loop
        int k=1;
        do{
            System.out.println("Do-while loop");
            k++;
        }while(k<1);

    //Kullanici bir sayi girsin sayi, 100'den kucuk ise kullanici "KAZANDINIZ" mesaji alsin
    //diger durumlarda "Kaybettiniz" mesaji alsin

        Scanner input= new Scanner(System.in);


        do{

            System.out.println("Please enter an integer");
            int n= input.nextInt();

            if(n<100){
                System.out.println("Won");

            } else{
                System.out.println("Lost");
                break;
            }
        }while(true);

        //Kullanıcıdan alınan  bir kelimenin büyük harfle başlayıp nokta ile bittiğini
        // kontrol eden kodu yazınız

        do{
            System.out.println("Please enter a word" );
            String s= input.next();
            input.nextLine();

            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your word is correct gramatically");
            }else{
                System.out.println("Your word has gramatical mistake");
                break;
            }

        }while(true);




    }
}
