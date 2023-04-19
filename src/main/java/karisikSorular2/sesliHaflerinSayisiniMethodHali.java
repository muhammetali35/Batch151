package karisikSorular2;

import java.util.Scanner;

public class sesliHaflerinSayisiniMethodHali {
    //Bir dizideki tüm sesli harfleri saymak için bir Java yöntemi yazın.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an String, please ");
        String s = input.nextLine().toLowerCase();
        System.out.println(s + " Stringinin içindeki sesli harf sayısı: " + sesliHarfSayisi(s));
        System.out.println(s + " Stringinin içindeki sessiz harf sayısı: " + sessizHarflerinSayisi(s));
        System.out.println(s + " Stringinin içindeki rakam sayısı: " + rakamSayisi(s));


    }

    public static int sesliHarfSayisi(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'ı' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'ö' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'ü') {
                count++;
            }
        }



        return count;



}
            public static int sessizHarflerinSayisi(String s){

        int count =0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'ı' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'ö' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'ü'
 )) {

                count++;
            }
        }
        return count;


            }
            public static int rakamSayisi(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
             if(Character.isDigit(s.charAt(i))) {
                 count++;
             }
        }
            return count;

            }




}


