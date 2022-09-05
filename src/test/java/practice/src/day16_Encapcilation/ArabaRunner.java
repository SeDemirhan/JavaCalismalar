package practice.src.day16_Encapcilation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba honda= new Araba();

        Araba toyota=new Araba("avensis","beyaz",300,2020);
        Araba volvo=new Araba("s80","siyah",1800,-2015);

        System.out.println(honda);
        System.out.println(toyota);
        System.out.println(volvo);


    }

}
