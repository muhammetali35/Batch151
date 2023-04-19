package karisikSorular2;

public class PassByValue {
    public static void main(String[] args) {

        int fiyat=100;
        System.out.println(indirim(fiyat));//90
        System.out.println(fiyat);//100

    }
    public static int indirim(int fiyat){
        fiyat*=0.90;
        return fiyat;

    }
}
