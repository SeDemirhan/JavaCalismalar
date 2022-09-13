package practice.src.inheritance03;

public class Yonetici extends Calisan{

    public Yonetici(String isim, int maas, String departman) {
        super(isim, maas, departman);
    }

    public void zamMiktari(int zam){
        System.out.println("Yapilacak zam miktari : "+ zam);

    }
}
