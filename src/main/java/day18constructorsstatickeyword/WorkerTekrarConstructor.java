package day18constructorsstatickeyword;

public class WorkerTekrarConstructor {

    public String name;
    public String surname;
    public int personId;
    public String departman;
    public double maas;
    boolean evliMi;
    public int cocukSayisi;


    public WorkerTekrarConstructor(String name, String surname, int personId, String departman, double maas, boolean evliMi, int cocukSayisi) {
        this.name = name;
        this.surname = surname;
        this.personId = personId;
        this.departman = departman;
        this.maas = maas;
        this.evliMi = evliMi;
        this.cocukSayisi = cocukSayisi;
    }

    public void zamYapma(double zamMiktari){
        maas+=zamMiktari;
        System.out.println("Maaşınıza "+zamMiktari+" TL zam yapılmıştır.");
        System.out.println("Güncel maaşınız "+maas+" TL'dir");

    }


    public void CalisanBilgileri(){

        System.out.println("***PERSONEL BİLGİLERİ***");
        System.out.println("İsim: "+name);
        System.out.println("Soyisim: "+surname);
        System.out.println("Çalışma Kimlik Kart Numarası: "+personId);
        System.out.println("Bölüm: "+departman);
        System.out.println("Maaş: "+maas);
        System.out.println("Evli Mi: "+evliMi);
        System.out.println("Çocuk sayısı: "+cocukSayisi);


    }







}


