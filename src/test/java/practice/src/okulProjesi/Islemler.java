package practice.src.okulProjesi;

import java.util.ArrayList;
import java.util.Scanner;

public class Islemler {

    static ArrayList<Kisi> OgrenciList = new ArrayList<>();
    static ArrayList<Kisi> OgretmenList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {

        System.out.println("===========================\nOGRENCI VE OGRETMEN PANELI\n" +
                "===================================\n" +
                "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ-CIKIS");
        System.out.println("Isleminizi seciniz : ");
        String secim = scan.next().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemeDevam();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemeDevam();
                break;
            case "Q":
                cikiss();
                break;
            default:
                System.out.println("Hatalı giris yaptınız");
                girisPaneli();
                break;


        }


    }

    private static void cikiss() {
        System.out.println("Yine bekleriz");
    }

    public static void islemeDevam() {
        System.out.println("Sectiginiz kisi turu : " + kisiTuru + " " + "\nasagidaki islemlerden tercih yapiniz.\r\n"
                + "=========== ISLEMLER =============\r\n"
                + "         1-EKLEME\r\n"
                + "         2-ARAMA\r\n"
                + "         3-LISTELEME\r\n"
                + "         4-SILME\r\n"
                + "         0-ANA MENU");
        System.out.println("Islemler tercihini seciniz :");
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {
            case 1:
                eklee();
                islemeDevam();
                break;
            case 2:
                arama();
                islemeDevam();
                break;
            case 3:
                listele();
                islemeDevam();
                break;
            case 4:
                sil();
                islemeDevam();
                break;
            case 0:
                girisPaneli();
                break;

            default:
                System.out.println("Hatali giris yaptiniz");

                islemeDevam();
                break;
        }


    }

    private static void sil() {
        {
            System.out.println("  ****  " + kisiTuru + " " + "silme sayfasi   ****");

            boolean flag = true;

            if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {
                scan.nextLine();//dummy
                System.out.print("silinecek ogrenci kimlik no giriniz : ");
                String silinecekKimlikNo = scan.nextLine();

                for (Kisi k : OgrenciList) {
                    if (k.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)) {
                        System.out.println("silinen ogrenci : " + k.getAdSoyad());
                        OgrenciList.remove(k);
                    }
                    flag = false;

                }
                if (flag) {
                    System.out.print("silinecek öğrenci mevcut değil");
                }
            } else {
                System.out.print("silinecek ogretmen kimlik no giriniz");
                String arananKimlikNo = scan.next();
                for (Kisi k : OgretmenList) {
                    if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                        System.out.println("silinen ogrenci : " + k.getAdSoyad());
                        OgrenciList.remove(k);
                    }
                    flag = false;

                }
                if (flag) {
                    System.out.println("silinecek ogretmen mevcut değil");
                }
            }


        }
    }
        private static void listele () {
            System.out.println("  ****  " + kisiTuru + " " + "listeleme sayfasi   ****");

            if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
                System.out.println(OgrenciList);

            } else {
                for (Kisi k : OgretmenList) {
                    System.out.println(k.toString());
                }

            }

        }

        private static void arama () {
            System.out.println("  ****  " + kisiTuru + " " + "arama sayfasi   ****");

            boolean flag = true;

            if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {
                scan.nextLine();//dummy
                System.out.print("aradiniz ogrenci kimlik no giriniz : ");
                String arananKimlikNo = scan.nextLine();
                scan.nextLine();
                for (Kisi k : OgrenciList) {
                    if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                        System.out.println("aradiginiz ogrenci : " + k.getAdSoyad());
                    }
                    flag = false;

                }
                if (flag) {
                    System.out.print("aradığın öğrenci mevcut değil");
                }
            } else {
                System.out.print("aradıgınız ogretmen kimlik no giriniz");
                String arananKimlikNo = scan.next();
                for (Kisi k : OgretmenList) {
                    if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {
                        System.out.println("aradıgınız ogretmen : " + k.getAdSoyad());
                    }
                    flag = false;

                }
                if (flag) {
                    System.out.println("aradığın ogretmen mevcut değil");
                }
            }


        }

        public static void eklee () {
            System.out.println("  ****  " + kisiTuru + "ekleme sayfasi   ****");
            System.out.println("Ad Soyad giriniz : ");
            scan.nextLine(); //dummy
            String adSoyad = scan.nextLine();
            System.out.println("Kimlik no giriniz");
            String kimlikNo = scan.nextLine();
            System.out.println("Yas giriniz");
            int yas = scan.nextInt();
            if (kisiTuru.equals("OGRENCI")) {
                System.out.println("Ogrenci no giriniz");
                String ogrenciNo = scan.nextLine();
                scan.nextLine();
                System.out.println("Sinif giriniz");
                String sinif = scan.nextLine();
                Ogrenci ogrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
                OgrenciList.add(ogrenci);


            } else {

                System.out.println("Sicil no giriniz");
                String sicilNo = scan.nextLine();
                scan.nextLine();
                System.out.println("Bolum giriniz");
                String bolum = scan.nextLine();
                Ogretmen ogretmen = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
                OgretmenList.add(ogretmen);
            }
        }


    }

