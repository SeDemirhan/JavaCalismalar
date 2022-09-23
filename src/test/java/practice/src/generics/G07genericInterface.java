package practice.src.generics;
//OCA trick = ayni dosya icinde birden fazla create edilen non-inner class lari JVM compile ederken
// sadece main class public olarak tanimlar. diger class lar dan herhangi biri de public olursa CTE veriri

public class G07genericInterface {//main class
        //1 math islem yapan mehodu olan bir  generic interface create diniz
    //2 silme yapan bir class create edip bu classtan interface i implement edin
    //3 main methoddan obj ler creqate dip call yapin

    public static void main(String[] args) {
        UsAlanClass < Float> floatUs=new UsAlanClass<>();
        System.out.println("floatUs.usAl(5f,2f) = " + floatUs.usAl(5f, 2f));

        UsAlanClass < Double> doubleUs=new UsAlanClass<>();
        System.out.println("doubleUs.usAl(5.2,2.3) = " + doubleUs.usAl(5.2, 2.3));

        UsAlanClass < Integer> intUs=new UsAlanClass<>();
        System.out.println("intUs.usAl(4,6) = " + intUs.usAl(4, 6));
    }
}

    interface MatIslem <T extends Number>{   //generic interfaceden data type number
                                            // olarak parametrenin boundedi create edilsi.
      double usAl(T t, T u); //abstram parametreli generic method create edildi.
    }

    class UsAlanClass <T extends Number> implements MatIslem<T> {

        @Override
        public double usAl(T t, T u) { //pow methodu parametre olarak double olarak alır
                                        // bundan dolayı paremetreleri doubleye donusturduk
            return Math.pow(t.doubleValue(),u.doubleValue());
        }
    }
