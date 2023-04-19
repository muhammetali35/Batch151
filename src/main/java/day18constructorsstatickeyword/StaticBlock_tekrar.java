package day18constructorsstatickeyword;

public class StaticBlock_tekrar {
    public static int age;

    static {
        System.out.println("Static block 2 çalışti");
        age=24;
    }
    static {
        System.out.println("Static block 1 çalışti");
        age=23;
    }
    public StaticBlock_tekrar(){
        System.out.println("Constructor çalıştı");
        System.out.println(++age);
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı 1");
        System.out.println(++age);
        StaticBlock_tekrar obj1= new StaticBlock_tekrar();
        System.out.println("MAin method çalıştı 2");
    }


}
