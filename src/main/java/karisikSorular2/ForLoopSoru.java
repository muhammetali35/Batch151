package karisikSorular2;

public class ForLoopSoru {
    public static void main(String[] args) {
        //Örnek : 1-25 arasındaki çift sayıların 2 katını,
        // tek sayıların 3 katını ekrana yazdıran program

        for (int i = 1; i <= 25; i++) {
            if(i%2==0){
                System.out.print(" "+2*i);

            }else {
                System.out.print(" "+ 3*i);
            }
        }
        System.out.println();
        System.out.println("=====================================");

        // 1-50 arasındaki sayılardan 3e, 5e ve 15e bölünenleri ayrı ayrı toplayan program
        // kodunu yazınız.(Not: 15e bölünüyorsa sayı sadece 15e bölünenlere eklenecek)
        int toplam3=0, toplam5=0, toplam15=0;
         for (int i = 1; i <= 50; i++) {
            if(i%15==0){
                toplam15+=i;
            }else if(i%5==0){
                toplam5+=i;
            }else if(i%3==0){
                toplam3+=i;
            }
        }

        System.out.println("toplam15 = " + toplam15);
         System.out.println("toplam5 = " + toplam5);
         System.out.println("toplam3 = " + toplam3);


    }
}
