package Overriding;

class Kendaraan {
    public void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    public void info() {
        System.out.println("Mobil: Roda 4");
    }
}

class Motor extends Kendaraan {
    public void info() {
        System.out.println("Motor: Roda 2");
    }
}

public class TesKendaraan {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Motor();

        k1.info();
        k2.info();
    }
}
