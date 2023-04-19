package day18constructorsstatickeyword;

public class workerRunner {
    public static void main(String[] args) {

        worker w1=new worker();
     worker w2=new worker(135,"Azad","Turan",13500,5,"QA",false);


        worker w3=new worker(135);

        w2.calisanBilgileri();
        w2.zamYapma(2500);
    }
}
