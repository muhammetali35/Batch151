package karisiksorular;

import java.util.Scanner;

public class daireAlanVeCevreHesaplama {
    public static void main(String[] args) {
        /*
        Proje Konusu
#Java ile yarı çap değerini kullanıcıdan alınan dairenin alanını ve çevresini hesaplayan programı yazın.

Daire Alan Formülü : π * r * r
Daire Çevre Formülü : 2 * π * r

Bonus Geliştirme
Yarıçapı r, merkez açısının ölçüsü a olan daire diliminin alanı bulan programı yazınız.
π Sayısını = 3,14 alın.
Formül : (π  * (r*r) *a) / 360)
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the radius of the circle, please...");
        int r= input.nextInt();

        double pi=3.14;

        double lengthOfCircle= pi*r*r;
        double areaOfCircle=2*pi*r;

        System.out.println("The area of the circle: "+areaOfCircle);

        System.out.println("The length of the circle: "+lengthOfCircle);

        //Bonus
        int centralAngle=90;
        double areaOfSector= (pi * (r*r) * 90)/360;

        System.out.println("The area of the sector: "+areaOfSector);




    }
}
