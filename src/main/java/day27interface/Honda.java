package day27interface;

public class Honda implements Engine,Brake{
    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void payment() {
        System.out.println("Pay the Brake...");
        System.out.println("Pay the Engine...");

    }

    @Override
    public void slow() {

    }
}
