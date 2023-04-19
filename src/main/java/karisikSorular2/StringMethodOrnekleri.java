package karisikSorular2;

import java.util.Scanner;

public class StringMethodOrnekleri {
    //Örnek:Girilen stringi tersten yazdıran java örneği

    public static String tersCevir(String kelime){
        String sonuc="";
        for(int i=kelime.length()-1; i>=0; i--){
            sonuc += kelime.charAt(i);
        }
        return sonuc;

    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Kelime giriniz: ");
        String kelime=input.nextLine();

        System.out.println(tersCevir(kelime));
    }



}
