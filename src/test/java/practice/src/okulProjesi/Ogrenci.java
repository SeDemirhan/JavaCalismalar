package practice.src.okulProjesi;

public class Ogrenci extends Kisi{

    private String ogrenciNo;
    private String sınıf;
public Ogrenci (){

}
    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sınıf = sınıf;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sınıf='" + sınıf + '\'' +
                '}';
    }
}
