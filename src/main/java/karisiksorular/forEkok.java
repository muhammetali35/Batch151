package karisiksorular;

import java.util.Scanner;

public class forEkok {
    public static void main(String[] args) {

        //EKOK bulma
        Scanner input= new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz.");
        int sayi1= input.nextInt();

        System.out.println("İkinci sayıyı giriniz.");
        int sayi2= input.nextInt();
        int carpim=sayi1*sayi2;

        int ekok=1;

        for (int a=2; a<=carpim ; a++){
            if (sayi1%a== 0 && sayi2%a==0){
                ekok=ekok*a;
                sayi1=sayi1/a;
                sayi2=sayi2/a;
                a--;
            }
        }
        ekok= ekok*sayi1*sayi2;
        System.out.println("EKOK'u: "+ekok);

        String a= "Muhammet Yılmaz";
        System.out.println(a.substring(4,5));






    }
}
