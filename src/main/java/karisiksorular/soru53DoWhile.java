package karisiksorular;

public class soru53DoWhile {
    public static void main(String[] args) {

        // "m" harfinden başlayarak "c" harfine kadar tum harfleri yazdırın.


        char ch = 'm';
        do {
            System.out.print(ch + " ");
            ch--;
        } while(ch >= 'c');

       /*
       While ile
       char c = 'm';
        while(c >= 'c') {
            System.out.print(c + " ");
            c--;
        }
            */
    }
}
