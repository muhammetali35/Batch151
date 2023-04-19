package practices;

import java.lang.reflect.AnnotatedElement;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba=new Butce();//adem
        System.out.println("Maaş öncesi bütçe "+ Butce.butce);

        baba.maasAl(30000);
        baba.harclikAl(100);
        baba.harcliktanHarca(80);

        System.out.println(Butce.butce);

        Butce anne= new Butce();//havva
        anne.maasAl(50000);
        anne.harclikAl(500);
        anne.harcliktanHarca(500);

        System.out.println(Butce.butce);

        System.out.println(anne.harclik);

        Butce cocuk= new Butce();
        cocuk.harclikAl(200);
        cocuk.harcliktanHarca(180);

        System.out.println(Butce.butce);

        System.out.println(cocuk.harclik);





    }
}
