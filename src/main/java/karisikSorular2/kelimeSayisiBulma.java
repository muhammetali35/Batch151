package karisikSorular2;

public class kelimeSayisiBulma {
    public static int kelimeSayisi(String metin){

        int kelimeSayisi=0;
        boolean kelimeMi=false;

        for(int i=0; i<metin.length(); i++){
            if(Character.isLetter(metin.charAt(i))&& i!= metin.length()-1 ){
                kelimeMi=true;
            } else if (!Character.isLetter(metin.charAt(i))&& kelimeMi) {
                kelimeSayisi++;
                kelimeMi=false;

            } else if (Character.isLetter(metin.charAt(i))&& i==metin.length()-1) {
                kelimeSayisi++;

            }
        }
        return kelimeSayisi;
    }

    public static void main(String[] args) {
        String metin="Merhaba Ddünya, bu bir Java proğramıdır.";
        System.out.println("kelime sayısı : "+kelimeSayisi(metin));
    }
}
