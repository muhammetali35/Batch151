package day27interface;

public class CarRunner {
    public static void main(String[] args) {

        Engine.stop();//stop method'u static olduğundan "interface" ismi ile ulaştım

        Honda h=new Honda();
        h.eco();//eco method'u static olmadığından "object" ismi ile ulaştım

    }
}
