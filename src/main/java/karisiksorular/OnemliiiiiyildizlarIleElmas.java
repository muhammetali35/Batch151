package karisiksorular;

import java.util.Scanner;

public class OnemliiiiiyildizlarIleElmas {
    public static void main(String[] args) {
        // Kullanıcıdan aldığınız sayıyla Yildizlar ile elmas yapınız
        Scanner input= new Scanner(System.in);
        System.out.println("Bir değer giriniz ");
        int n =input.nextInt();

        for(int i=1; i<=n; i++){// satır sayısı
            for(int j=1; j<=(n-i); j++ ){// satırdali bşluk sayısı
                System.out.print(" ");

            }
            //Yıldız sayısı
            for(int k=1; k<=(2*i)-1; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int x=n; x>=1; x--){//satır sayısı
            for(int y=1; y<=n-x; y++ ) {// boşluk sayısı
                System.out.print(" ");
            }
              //yıldız sayısı
            for(int z=1; z<=(2*x)-1 ; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
