package karisiksorular;

public class soru6manipulationsornekler {
    public static void main(String[] args) {
        //String seklinde verilen asağıdaki fiyatları toplamını bulunuz.
        String str1= "$13.99";
        String str2= "$10.55";
        str1= str1.replace("$","");
        str2= str2.replace("$","");

        Double d1=Double.parseDouble(str1);
        System.out.println("d1 = " + d1);

        Double d2=Double.parseDouble(str2);
        System.out.println("d2 = " + d2);

        System.out.println("$"+(d1+d2));

    }
}
