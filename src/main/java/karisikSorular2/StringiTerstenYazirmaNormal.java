package karisikSorular2;

import java.util.Scanner;

public class StringiTerstenYazirmaNormal {
    public static void main(String[] args) {
     //Girilen stringi tersten yazdır
        Scanner input= new Scanner(System.in);
        System.out.println("Girilen stringi tersten yazdır");
        String str= input.nextLine();

        String tersHali="";
        for(int i=str.length()-1 ; i>=0 ; i--){
            tersHali += str.charAt(i);

        }
        System.out.println("Tersten yazılmış hali: " + tersHali);
    }
}
