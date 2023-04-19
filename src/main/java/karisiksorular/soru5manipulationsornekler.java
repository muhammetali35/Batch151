package karisiksorular;

public class soru5manipulationsornekler {
    public static void main(String[] args) {
        //String methotlarını kullanarak " Java ogrenmek123 Cok guzel@ " Stringini
        // "Java ogrenmek cok guzel." seklinde getirin ve yazdırın.
        String str=" Java ogrenmek123 Cok guzel@ ";
        str= str.trim();
        str= str.replace("123","").replace("@","").replace("C","c");
        System.out.println("Son hali= " + str);
    }
}
