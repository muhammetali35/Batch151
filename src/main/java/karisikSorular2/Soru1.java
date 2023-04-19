package karisikSorular2;

public class Soru1 {
    public static void main(String[] args) {

        CemberDaire cember1 = new CemberDaire(5);
        System.out.println("YArıçapı 5 olan çemberin çevresi : " + cember1.cevreBul());
        System.out.println();
        System.out.println("YArıçapı 5 olan dairenin alanı : %2.f "+cember1.alanBul());

    }
}
    class CemberDaire{
        private int yaricap;
        public final static double PI=3.14;
        public CemberDaire(int r){
            this.yaricap=r;
        }
        public double cevreBul(){
            return 2* PI*yaricap;

        }
        public double alanBul(){
            return PI*Math.pow(yaricap,2);
        }
    }

