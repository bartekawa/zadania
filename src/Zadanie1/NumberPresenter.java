package Zadanie1;

public class NumberPresenter {

    public static void main(String[] args) {
        //deklaracja zmiennej lokalnej
        int i = 123;

        showInt(i);
        showIntAsBinary(i);
        showIntAsOctal(i);
        showIntAsHex(i);
    }

    public static void showInt(int i) {
        System.out.println("Dziesiętnie: \t" + i);
        System.out.println("------------------------");
    }

    public static void showIntAsBinary(int i) {
        System.out.println("Binarnie: \t\t" + Integer.toBinaryString(i));
    }

    public static void showIntAsOctal(int i) {
        System.out.println("Ósemkowo: \t\t" + Integer.toOctalString(i));
    }

    public static void showIntAsHex(int i) {
        System.out.println("Szesnastkowo: \t" + Integer.toHexString(i));
    }
}

