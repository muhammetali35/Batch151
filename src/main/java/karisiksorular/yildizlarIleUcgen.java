package karisiksorular;

import java.util.Scanner;

public class yildizlarIleUcgen {
    /*
    Proje Konusu

   #Java ile kullanıcı girdiği değer kadar yıldızlar ile eşkenar üçgen oluşturan programı yazın.

     */
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("Bir değer giriniz ");
        int n =input.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++ ){
                System.out.print(" ");

            }
            for(int k=1; k<=(2*i)-1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }












      /*  //Üçgenin satır sayısı bulma
        for(int i=1; i<=deger; i++){

        //boşlukları ekrana yazdırma
            for (int j=1; j<=deger-i; j++){
                System.out.print(" ");
            }
            //yıldızları ekrana yazdırma
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("*");
            }
            // her satırın sonunda alt satıra geçmek için
            System.out.println();
        }
*/

    }
}
