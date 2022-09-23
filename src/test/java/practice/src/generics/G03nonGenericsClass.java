package practice.src.generics;

import java.util.ArrayList;
import java.util.List;

public class G03nonGenericsClass {
    public static void main(String[] args) {

       // List<String> liste=new ArrayList<>();// ==>generic list
        List liste=new ArrayList<>();

        liste.add("sefer ser");
        liste.add(2121);

        System.out.println("liste = " + liste);

       // int name= (int) liste.get(0); claas cast exception veriri
        //System.out.println("name = " + name);

        int name= (int) liste.get(0);
        System.out.println("name = " + name);

        String tarih= (String) liste.get(1);
        System.out.println("tarih = " + tarih);


        //row List yerine Object super class data type
        List<Object> devList=new ArrayList<>();//object super class data type list create edili
        devList.add("serdar");
        devList.add(2022);
        devList.add(20000.5);

        String devName= (String) devList.get(0);
        Integer dTarih= (Integer) devList.get(1);

        for (Object w:devList) { //ClassCastException
            String data= (String) w; //numeric deger oldugu için casting yapamaz.
            System.out.println("data = " + data);

        }









    }

}
