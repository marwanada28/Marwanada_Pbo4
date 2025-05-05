package Overloading;

public class LuasBangunDatar {
    // Luas persegi
    public int hitungLuas(int sisi) {
        return sisi * sisi;
    }

    // Luas persegi panjang
    public int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    // Luas lingkaran
    public double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        LuasBangunDatar lbd = new LuasBangunDatar();
        System.out.println("Luas persegi: " + lbd.hitungLuas(4));
        System.out.println("Luas persegi panjang: " + lbd.hitungLuas(5, 3));
        System.out.println("Luas lingkaran: " + lbd.hitungLuas(3.5));
    }
}
