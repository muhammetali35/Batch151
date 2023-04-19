package practices;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Array {
      /*
        Hackerlar bazı harfleri sayılara cevirerek yazısabiliyorlar.
        Genellikle cevirdikleri harfler su sekilde:
        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0
        ornegin:
         java ile hersey guzel
         j4v4 1l3 h3r53y guz3l
        Kullanıcıdan bir cumle alınız, 'hacker'ların konusma diline cevireniz.
        */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir cümle giriniz ");
        String cumle=scan.nextLine();

        String arr[]=new String[cumle.length()];

        for (int i = 0; i < cumle.length(); i++) {

            arr[i]=cumle.substring(i,i+1);

            System.out.print(arr[i]);
        }


        System.out.println();


        for (int i = 0; i < arr.length ; i++) {

            if(arr[i].contains("s")){
                arr[i]="5";
            }
            if(arr[i].contains("a")){
                arr[i]="4";
            }
            if(arr[i].contains("e")){
                arr[i]="3";
            }
            if(arr[i].contains("i")){
                arr[i]="1";
            }
            if(arr[i].contains("o")){
                arr[i]="0";
            }
            System.out.print(arr[i]);



        }





    }
}
