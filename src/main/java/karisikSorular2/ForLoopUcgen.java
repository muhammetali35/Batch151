package karisikSorular2;

public class ForLoopUcgen {
    public static void main(String[] args) {


     /*
        Sayıları 1 artan dik açılı üçgen gibi bir kalıp yapmak için
        Java'da bir program yazın .
            1
            2 3
            4 5 6
            7 8 9 10

         */


            int a=5;

            for (int i=1; i<=a; i++){
        for (int j=1; j<=i; j++){

            System.out.print(j+" ");
        }
                System.out.println();

    }

    }
}
