package practice.src.kitapTakibi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KitapBilgileri {

    static List<Integer>kitapNo=new ArrayList<>();
    static List<String>kitapAdi=new ArrayList<>();
    static List<String>yazarAdi=new ArrayList<>();
    static List<Double>kitapFiyati=new ArrayList<>();

    int count=1000;
    String cevap;

    static {
        kitapNo.addAll(Arrays.asList(1001,1002,1003));
        kitapAdi.addAll(Arrays.asList("ahmet","adam","madam"));
        yazarAdi.addAll(Arrays.asList("a","b","c"));
        kitapFiyati.addAll(Arrays.asList(20.0,30.0,40.0));
    }

    public void kitapSecim() throws InterruptedException {
        Scanner scan=new Scanner(System.in);

        System.out.println("============ANA MENU=============="+
                "\n1-Kitap ekle \n2-Numara ile kitap sorgulama" +
                "\n3-Bilgi ile kitap goruntuleme \n4-Numara ile kitap sil" +
                "\n5-Tum kitaplari listele \n6-Cikis");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz");

       int secim=scan.nextInt();

       switch (secim){
           case 1:
               kitapEkle();
               kitapSecim();
               break;
           case 2:
               noIleGoruntule();
               kitapSecim();
               break;
           case 3:
               bilgiIleGoruntule();
               kitapSecim();
               break;
           case 4:
               break;
           case 5:
               break;
           case 6:
               System.out.println("Hayirli gunler");
               break;
           default:
               System.out.println("Lutfen gecerli bir secim yapiniz");

       }
    }

    private void bilgiIleGoruntule() throws InterruptedException {
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Goruntulemek istediginiz kitapdan bir ifade giriniz");

            String ifade = scan.nextLine();
            scan.next();
            for (int i = 0; i < kitapNo.size(); i++) {
                if (kitapAdi.get(i).equalsIgnoreCase(ifade) || yazarAdi.get(i).equalsIgnoreCase(ifade)) {

                    System.out.println(kitapNo.get(i) + " " + kitapAdi.get(i) + " " + kitapFiyati.get(i) + " " + yazarAdi.get(i));

                }

            }
            System.out.println("devam etmek istiyor musunuz (e/h)");
            cevap= scan.nextLine();
        }while (cevap.equalsIgnoreCase("e"));
    }


    public void noIleGoruntule() {
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("Goruntulemek istediginiz kitabin numarasini giriniz");
            int numara = scan.nextInt();

            for (int i = 0; i < kitapNo.size(); i++) {
                if (numara == kitapNo.get(i)) {
                    System.out.println(kitapNo.get(i) + " " + kitapAdi.get(i) + " " + yazarAdi.get(i) + " " + kitapFiyati.get(i));

                }

            }
            System.out.println("devam etmek istiyor musunuz? (e/h");
            cevap= scan.next();
        }while (cevap.equalsIgnoreCase("e"));
    }

    private void kitapEkle() {
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("======== KITAP BILGILERI=========");
            System.out.println("Kitap adini giriniz");
            String kitap = scan.nextLine();
            System.out.println("Lutfen yazar adini giriniz");
            String yazar = scan.nextLine();
            System.out.println("Lutfen kitap fiyatini giriniz");
            double fiyat = scan.nextDouble();

            System.out.println("KITAP NO\tKITAP ADI\t YAZAR ADI\t KITAP FIYATI");
            System.out.println(count + "\t\t" + kitap + "\t\t\t" + yazar + "\t\t" + fiyat);

            kitapAdi.add(kitap);
            yazarAdi.add(yazar);
            kitapFiyati.add(fiyat);
            kitapNo.add(count++);

            System.out.println("Kitabiniz basariyla eklendi");
            scan.nextLine();
            System.out.println("Baska kitap eklemek istiyor musnuz? : (E/H)");
            cevap = scan.nextLine();
        }while (cevap.equalsIgnoreCase("e"));
        System.out.println("Anamenuye yonlendirildiniz");
    }
}
