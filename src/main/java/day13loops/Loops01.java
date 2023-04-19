package day13loops;

public class Loops01 {
    public static void main(String[] args) {
        // 21 den 188 e kadar hem 4 hemde 6 ile bölünen tamsayıları console'a yazdıran kodu yazdırın
        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();


    //size verilen kuçuk harfle yazılmış String'in index'i çift sayı olan character'lerini buyuk harfe dönüştür.
    //miami ==> MiAmI

    String s = "miami";// MiAmI

        for(int i=0; i<s.length(); i++){
        String ch = s.substring(i, i+1);
        if(i%2==0){
            System.out.print(ch.toUpperCase());
        }else{
            System.out.print(ch);
        }
    }
        //Verilen bir string'de ilk 'a' harfinden önceki tum characterleri console' a yazdınız
        //Hello Java==> Hello J
        System.out.println();
        String t= "Tokacı";
        for(int i=0; i<t.length(); i++){
         char ch=t.charAt(i);
         if(ch=='a'){
             break;
            }else {

             System.out.print(ch);
         }
        }
        System.out.println();
        //Verilen bir String de son 'a' dan sonraki tüm characterleri ters sırada yazdırınız.
        //"Tokatci" ==>  "ict"

        String u = "Tokatci";
        for(int i=u.length()-1 ; i>=0; i--){

            char ch=u.charAt(i);
            if(ch=='a'){
                break;
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();
        System.out.println("============");
        String k="Tokatci";

        for(int i=k.length()-1 ; i>=0; i--){
            char ch=k.charAt(i);
            if(ch=='k'){
                break;
            }else {
                System.out.print(ch);
            }
        }


    }
}

