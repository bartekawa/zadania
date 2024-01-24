package Zadanie1;

public class Operations {
    public static void main(String[] args) {
        int a = 13;
        int b = 2;

        int dodawanie = a + b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + dodawanie);

        System.out.println("\nbinarnie");
        System.out.println(String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'));
        System.out.println(String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'));
        System.out.println("------------");
        System.out.println(String.format("%8s", Integer.toBinaryString(dodawanie)).replace(' ', '0'));

        System.out.println("\nósemkowo");
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toOctalString(b));
        System.out.println("------------");
        System.out.println(Integer.toOctalString(dodawanie));

        System.out.println("\nszesnastkowo");
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println("------------");
        System.out.println(Integer.toHexString(dodawanie));
    }
}
