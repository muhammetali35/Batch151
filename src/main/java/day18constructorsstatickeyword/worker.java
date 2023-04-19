package day18constructorsstatickeyword;

public class worker {

    public int num;
    public String name;
    public String surname;
    public  double salary;
    public  int tecrube;
    public  String depertman;
    public boolean evliMi;


    public worker(int num, String name, String surname, int salary, int tecrube, String depertman, boolean evliMi) {
        this.num = num;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.tecrube = tecrube;
        this.depertman = depertman;
        this.evliMi = evliMi;
    }

    public worker(int num){

    }
    public worker(){

    }

    public void zamYapma(double zamMiktari){//method

        salary+=zamMiktari;
        System.out.println("Maaşınıza "+zamMiktari+" Tl zam yapıldı.");
        System.out.println("Şuan ki güncel maaşınıza "+salary+" Tl'dir.");
    }

    public void calisanBilgileri(){//method
        System.out.println("*****ÇALIŞAN BİLGİLERİ*******");
        System.out.println("Numara "+num);
        System.out.println("İsmi "+name);
        System.out.println("Soyismi "+surname);
        System.out.println("Maaşı "+salary);
        System.out.println("Tecrübesi "+tecrube);
        System.out.println("Departmanı "+depertman);
        System.out.println("Evli mi "+evliMi);


    }


}
