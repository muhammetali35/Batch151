package SSG;

public class C05_Array {
    /*
    Verilen String bir array''de en uzun ve en kısa Stringleri yazdıran method oluştur.
     */
    public static void main(String[] args) {

        String[] arr = {"Abdulrezzak", "Ali", "Mustafa", "Melih", "Kemal", "Canan", "Can",};

        enUzunVeEnKisa(arr);

    }

    public static void enUzunVeEnKisa(String[] arr) {
        String enUzunKelime=arr[0];
        String enKisaKelime=arr[0];
        for(String w : arr){
            if(w.length()>enUzunKelime.length()){
                enUzunKelime=w;
            }
            if(w.length()<enKisaKelime.length()){
                enKisaKelime=w;
            }
        }
        System.out.println("en kısa kelime: " + enKisaKelime);
        System.out.println("en uzun kelime: " + enUzunKelime);
    }
}