package practice.src.inheritance;

public class Runner {
    public static void main(String[] args) {

        My_Method();

    }

    public static void My_Method(){

        SubClass sc=new SubClass();
        System.out.println(sc.num);
        sc.goster();

        SuperClass superClass=new SuperClass();

        System.out.println(superClass.num);
        superClass.goster();
    }
}
