package QuestionBankApexQuestions;

public class Loops02 {
    /*
    2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; accessories ´ ces
     */
    public static void main(String[] args) {
        /*String name= "Muhammet Yılmaz";

        for(int i=0; i<name.length(); i++) {
            String ch=name.substring(i,i+1);
            if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
                System.out.print(ch+" ");

            }
        }*/
     /*   String name = "Muhammet Yılmaz";
        String bos = "";
        for (int i = 0; i < name.length(); i++) {
            String ch = name.substring(i, i + 1);
            if (name.indexOf(ch) != name.lastIndexOf(ch)) {
                bos = bos + ch;

            }
        }
        System.out.print(bos);*/

        //2.Way

        String s="accessories";
        String d="";

        int i=0;
        while (i<s.length()) {
            String c=s.substring(i,i+1);
        if(s.indexOf(c)!=s.lastIndexOf(c)){
            if(!d.contains(c)){
                d+=c;

            }
        }
        i++;
        }
        System.out.println(d);

    }
}
