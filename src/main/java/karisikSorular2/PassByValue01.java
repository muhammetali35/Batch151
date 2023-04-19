package karisikSorular2;

public class PassByValue01 {
    public static void main(String[] args) {

        int fiyat=100;

        System.out.println("method'la hesaplanan fiyat="+discount(fiyat));//90
        System.out.println("Method sonrası fiyat "+fiyat);//100
    }


    public static int discount(int fiyat){
        fiyat*=0.90;
        return fiyat;

    }
}
