package karisikSorular2;

import java.util.Locale;

public class sesliHaflerinSayisini {
    public static void main(String[] args) {
        //Bir dizideki tüm ünlüleri saymak için bir Java yöntemi yazın.

        String s = "Muhammet yılmaz3535164?)(";
        String s1 = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'ı' || s.charAt(i) == 'i' ||
                    s.charAt(i) == 'o' || s.charAt(i) == 'ö' || s.charAt(i) == 'u' || s.charAt(i) == 'ü' ) {

                count++;
            }



        }
        System.out.println(count);
    }
}