package day22stringbuilder;

public class Studenttekrar {

    //stdName "public" olduğu için diğer classlardan da ulaşabiliriz
    public String stdName="Ali Can";
    // Access modifier default olan ile public olan class member'lar aynı package
    //içinde kullanıldıklarında aynı özelliklee sahiptir.
    //Fakat farklı package' a geçildiğinde public olanlara ulaşabilir, ancak
    // default olanlara ulaşılamaz

    int age=23;
    //Access modifier'i private olan class member'lar sadece
    // oluşturuldukları class içinden görülebilirler
    //Oluşturuldukları class'in dışına çıktığınızda görünmez, ulaşılmaz olurlar.

    private String healthCondition="Cancer";
    //Access modifier'i protected olan class member'lar aynı package içinde iken public gibi davranırlar
    //Farklı package' a geçtiğinde protected olanlar sadece child class'lardan görülebilir

    protected int salary=3000;

    //Note***: Class'lar default ve public olabilirler ama private ve protected olamazlar.

}
