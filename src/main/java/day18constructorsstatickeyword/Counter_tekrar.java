package day18constructorsstatickeyword;

public class Counter_tekrar {
    int count;
    static int stCount;
    public Counter_tekrar(){
        count++;
        stCount++;
    }

    public int getCount() {
        return count;
    }
    public static int getStCount() {
        return stCount;
    }
    public static void main(String[] args) {
        Counter_tekrar cs1=new Counter_tekrar();
        Counter_tekrar cs2=new Counter_tekrar();
        Counter_tekrar cs3=new Counter_tekrar();
        Counter_tekrar cs4=new Counter_tekrar();
        Counter_tekrar cs5=new Counter_tekrar();
        Counter_tekrar cs6=new Counter_tekrar();

        System.out.println("count is:" +cs6.getCount());
        System.out.println("stCount is:" +cs6.getStCount());

    }
}
