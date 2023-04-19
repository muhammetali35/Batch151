package day22stringbuilder;

public class Student {

    //stdName "public" olduğu için diğer class'lardan ulaşabiliriz.
    public String stdName="Ali Can";

    //Access Modifier'i "default" olan ile "public" olan class member'lar aynı package içinde
      //kullanıldıklarında aynı özellikleri gösterir.
    //Fakat farklı package' a geçildiğinde "public" olanlara ulaşabilir, ancak "default"
      //olanlara ulaşılamaz.


    int age=23;

    //Access Modifier'i "private" olan Class Member'lar sadece oluşturuldukları class
      //içinden görülebilirler.
    //Oluşturuldukları class'in dışına çıktığınızda görünmez, ulaşılmaz olurlar.
    private String healthCondition="Cancer";

    //Access Modifier'i "protected" olan Class Member'lar aynı package içinde iken
    // "public" gibi davranırlar.
    //Farklı package'a geçtiğiizde "protected" olanlar sadece child class'lardan görülebilir.
    protected int salary=3000;

    //Note: Class'lar public ve default olabilir ama private ve protected olamazlar.


}
