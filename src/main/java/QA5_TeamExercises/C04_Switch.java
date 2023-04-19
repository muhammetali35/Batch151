package QA5_TeamExercises;

import java.util.Scanner;

public class C04_Switch {
    public static void main(String[] args) {

        Scanner input= new  Scanner(System.in);
        System.out.println("Cinsiyet girniz");
        String gender=input.nextLine();


        switch (gender.toLowerCase()) {
            case "erkek":
                System.out.println("Erkek");
                break;
            case "kadin":
                System.out.println("Kız");
                break;
            default:
                System.out.println("Diğerleri ");
                break;

        }
    }
}