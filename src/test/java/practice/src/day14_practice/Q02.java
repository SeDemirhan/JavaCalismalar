package practice.src.day14_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {

        String [] pazarSepeti=new String[5];

        String[] pazarSepeti2={"elma","patates","kivi","karpuz","muaz"};

        List<String> listPazarSepeti=new ArrayList<>();
        listPazarSepeti.add("elma");
        listPazarSepeti.add("patates");
        listPazarSepeti.remove("patates");

        List<String>listPazarSepeti2= Arrays.asList(pazarSepeti2);
        System.out.println(listPazarSepeti2.size());
        listPazarSepeti.add(0,"çikolata");

        listPazarSepeti.set(0,"çikolata");
        System.out.println(listPazarSepeti.get(0));

        if (!listPazarSepeti.contains("ketçap")) listPazarSepeti.add("ketçap");
    }
}
