package day18constructorsstatickeyword;

public class MyConstructorTekrar {

    int x=3;
    int y=5;

    MyConstructorTekrar(){
        x+=1;
        System.out.println("-x"+ x);
    }
    MyConstructorTekrar(int i){
        this();
        this.y=i;
        x+=y;
        System.out.println("-x"+ x);
    }
    MyConstructorTekrar(int i, int i2){
        this(3);
        this.x-=4;
        System.out.println("-x"+ x);
    }
    public static void main(String[] args){
        MyConstructorTekrar mc1=new MyConstructorTekrar(4,3);

    }

}
