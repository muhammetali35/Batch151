package karisiksorular;

import java.util.Scanner;

public class soru15ifstatement {
    public static void main(String[] args) {
        //Kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve dikdörtgenin kare olup
        // olmadığını yazdırın
        Scanner input= new Scanner(System.in);
        System.out.println("Enter long side of the retangle, please...");
        int longSide =input.nextInt();

        System.out.println("Enter short side of the retangle, please...");
        int shortSide =input.nextInt();

        if(shortSide==longSide){
            System.out.println("The regangle is square ");
        }
        if(shortSide!=longSide) {
            System.out.println("The regangle is not square ");
        }



    }
}
