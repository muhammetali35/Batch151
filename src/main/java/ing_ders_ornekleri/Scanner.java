package ing_ders_ornekleri;

public class Scanner {
    public static void main(String[] args) {
        /*
        Type a proğram which calculates the area and the perimeter of a circle
        whose radius is entered by user(use float)
        Hint 1: Take pi number as 3.14159
        Hint 2: Area of circle is  3.14159 x radius x radius
        Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
         */

        java.util.Scanner input= new java.util.Scanner(System.in);// ben karıştırıdm biraz
        System.out.println("Give me radius, please");
        float radius= input.nextFloat();
        float pi= 3.14159F;


        System.out.println("Area of circle: "+pi*radius*radius);
        System.out.println("Perimeter of a circle: "+2*(pi*radius));


    }
}
