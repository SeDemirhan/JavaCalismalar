package practice.src.generics;

import java.util.Arrays;
import java.util.Comparator;

public class G02genericsMethods {
    //parameter tipleri non-primitive olmali
    // ERASURE process==> jvm derleyici compile time asamasinda generic methodu java byte kodlara ceviriken
    // parametere tiplerini kaldirir
    // ve yerine gercek parametre koyar.


    //generik veri tipleri sadece non-primitive olabilir
    //binary operatorler (+ - * / < > ) ise non-primitive veri tiplerindee kullanilmazlar
    //dolayisiyla birgeneric methodda karsilastirma icin ne kullanilabilir
    //cevap => comparable interface i kullanilmali
    public static void main(String[] args) {
        Integer[] intDizi = {1, 2, 3, 3, 6, 4, 6, 5, 6, 4, 6, 9};
        Double[] doubleDizi = {1.2, 2.6, 3.2, 3.8, 6.3};
        Character[] charDizi = {'r', 'e', 'c', 'e' , 'p'};
    //task 1 generic method create ederek bu dizileri yazdirirniz

        diziYazdir(intDizi);
        diziYazdir(doubleDizi);
        diziYazdir(charDizi);

     //task 2 max sayiyi bulan generic method yazinir. 3 pmli olsun




        System.out.println(" - generic method ");
        System.out.println(maxBulGeneric(35, 63, 34));
        System.out.println("maxBulGeneric(\"21\",\"35\",\"55\") = " + maxBulGeneric("21", "35", "55"));
        System.out.println("maxBulGeneric(23.4,45.6,67.8) = " + maxBulGeneric(23.4, 45.6, 67.8));
    }


        public static <T> void diziYazdir(T[] dizi){
        Arrays.stream(dizi).forEach(System.out::print);

}

   public static <T extends Comparable<T>>  T maxBulGeneric(T a, T b, T c){
       //cevap => comparable interface i kullanilmali

       T max=a;
       if (b.compareTo(max)>0){
           max=b;
       }
       if (c.compareTo(max)>0) {
           max = c;
       }
       return max;
   }


}
