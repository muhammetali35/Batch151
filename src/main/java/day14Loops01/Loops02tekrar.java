package day14Loops01;

import java.util.Scanner;

public class Loops02tekrar {
    public static void main(String[] args) {
        //3'den 8'e kadar tüm tamsayıları console'a yazdıran kodu yazınız.
        //for loop
        for(int i=3; i<9; i++){
            System.out.print(i);
        }
        System.out.println();
        //while loop
        int i=3;
            while(i<9){
                System.out.print(i);
                i++;
            }
        System.out.println();
  //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        //for loop
        for(int j=21; j<181; j++) {
            if(j%4==0 && j%6==0 ){
                System.out.print(j+" ");
            }
        }
        System.out.println();
        //while loop

        int j=21;
        while(j<181){
            if(j%4==0 && j%6==0)
                System.out.print(j+" ");
            j++;
        }
        System.out.println();

    //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
     //miami ==> MiAmI

        String s="miami";
        for(int f=0; f<s.length(); f++){

            String s2 = s.substring(f,f+1);

            if(f%2==0){
                System.out.print(s2.toUpperCase());
            }else {
                System.out.print(s2);
            }

        }
        System.out.println();

        String s3 = "Muhammet";

        int k=0;
        while(k<s3.length()) {

            String b=s3.substring(k, k+1);
            if(k%2==0) {
                System.out.print(b.toUpperCase());
            }else {
                System.out.print(b);
            }

        k++;
        }
        System.out.println();
        // Kullanıcıdan aldığınız sayı için çarpım taplosu oluşturan kodu yazınız
        // 3x1=3 3x2=6 3x3=9 ........3x10=30

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= input.nextInt();


        int y=1;
        while(y<11){
            System.out.println(sayi+" x "+y+" = "+(sayi*y));

            y++;
        }

        //Kullanıcıdan aldığınız String'deki sessiz harfleri console' a yazdırınız
        //Alabama ==> lbm

        Scanner input2= new Scanner(System.in);
        System.out.println("Lütfen string giriniz");
        String p= input2.nextLine();

        String result="";

        int u=0;

        while(u<p.length()) {
        char ch = p.charAt(u);
        boolean bl=ch=='a' || ch=='o' || ch=='u' || ch=='e' || ch=='ı'  || ch=='A' || ch=='E'
                || ch=='I'|| ch=='U'|| ch=='O';

        if(!bl){

            System.out.print(ch);
        }

            u++;
        }





    }
}
