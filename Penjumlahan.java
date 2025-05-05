package Overloading;

public class Penjumlahan {
    public int jumlah(int a, int b) {
        return a + b;
    }

    public double jumlah(double a, double b) {
        return a + b;
    }

    public String jumlah(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Penjumlahan p = new Penjumlahan();
        System.out.println("Jumlah int: " + p.jumlah(5, 3));
        System.out.println("Jumlah double: " + p.jumlah(2.5, 3.7));
        System.out.println("Jumlah string: " + p.jumlah("Hello, ", "World!"));
    }
}
