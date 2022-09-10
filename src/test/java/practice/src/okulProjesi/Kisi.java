package practice.src.okulProjesi;

public class Kisi {

   private String adSoyad;
   private String kimlikNo;
   private int yas;

   public Kisi(){

   }

    public Kisi(String adSoyad, String kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        setKimlikNo(kimlikNo);
        setYas(yas);
    }

    public String getAdSoyad() {

       return adSoyad.toUpperCase();
    }

    public void setAdSoyad(String adSoyad) {

       this.adSoyad = adSoyad;
    }

    public String getKimlikNo() {

       return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        if (kimlikNo.length()==11){

        }else {
            System.out.println("Luften 11 haneli kimlik numaranizi giriniz");
        }
       this.kimlikNo = kimlikNo;
    }

    public int getYas() {

       return yas;
    }

    public void setYas(int yas) {
        if (yas<0){
            this.yas=-yas;
        }else
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", yas=" + yas +
                '}';
    }
}
