package Overloading;

public class Printer {
    public void print(String text) {
        System.out.println("Mencetak teks: " + text);
    }

    public void print(int number) {
        System.out.println("Mencetak angka: " + number);
    }

    public void print(double value, String unit) {
        System.out.println("Mencetak nilai: " + value + " " + unit);
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Halo Dunia");
        p.print(123);
        p.print(56.78, "kg");
    }
}
