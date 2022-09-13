package practice.src.inheritance03;

public class Calisan {

    String isim;
    int maas;
    String departman;

    public Calisan() {
    }

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }

    public void bilgileriGoster(){
        System.out.println("Isim : "+ isim);
        System.out.println("maas : "+ maas);
        System.out.println("Departman : "+ departman);
    }
}
