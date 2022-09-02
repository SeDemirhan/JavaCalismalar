package practice.src.day14_practice;

public class Q01 {
    public static void main(String[] args) {

        String name="Java dünyası çok güzel";
        System.out.println(reverse(name));
    }

    public static String reverse(String name){
        String str2="";
        String[] str=name.split("");
        for (int i = str.length-1; i >=0 ; i--) {
            str2=str2+str[i];

        }
        return str2;
    }
}
