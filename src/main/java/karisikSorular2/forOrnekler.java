package karisikSorular2;

public class forOrnekler {
    public static void main(String[] args) {

        /*
        Dik açılı üçgen gibi, bir sayıyı arka arkaya tekrar edecek bir
         sayı içeren bir desen yapmak için Java'da bir program yazın.
          Model aşağıdaki gibidir:
                    1
                    22
                    333
                    4444
         */

        int n1= 4;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++)
            System.out.print(i);
            System.out.println("");

        }





    }
}
