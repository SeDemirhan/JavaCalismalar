package practice.src.inharitance02;

public class Runner {
    public static void main(String[] args) {

        JaponBaligi jb=new JaponBaligi();
        jb.solunum();
        Guvercin guvercin=new Guvercin();
        guvercin.beslenme();
        guvercin.boyut();
        Kus kus=new Kus();
        kus.barınma();
        kus.ucma();
        Balik balik=new Balik();
        balik.solunum();
        balik.yuzme();
        Hayvan hayvan=new Hayvan();
        hayvan.barınma();
        hayvan.beslenme();
        hayvan.boyut();
        hayvan.solunum();

    }
}
