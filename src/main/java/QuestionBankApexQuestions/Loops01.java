package QuestionBankApexQuestions;

public class Loops01 {
    /*
    1) Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
with a space between two consecutive integers
   1)120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız.
     */
    public static void main(String[] args) {
        //1.Way
     /*   for(int i=120; i>11; i--) {
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
        }
*/
        //2.Way

       /* int i=120;
        while (i>11){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
            i--;
        }*/

        //3.Way

        int i=120;
        do {
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }
            i--;

        }while (i>11);




    }
}
