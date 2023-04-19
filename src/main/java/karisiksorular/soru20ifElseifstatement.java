package karisiksorular;

import java.util.Scanner;

public class soru20ifElseifstatement {
    public static void main(String[] args) {
     /* Kullanıcıdan gun ismini isteyin. Girilen isim geçerli bir gun ise gun isminin1.,2. ve 3.
     harflerini ilk harf buyuk diğer ikisini kuçuk olarak yazdırın, gun ismi gecerli değilse
     "Geçerli gun ismi giriniz" yazdırın
      */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a day, please...");
        String day =input.nextLine().toLowerCase();

        if(day.equalsIgnoreCase("Pazar")){
            System.out.println("PAZ"+day.substring(3,5));
        }else {
            System.out.println("Enter a valid day, please...");
        }















    }
}
