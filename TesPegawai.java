package Overriding;

class Pegawai {
    public void tampilkanGaji() {
        System.out.println("Gaji pegawai umum.");
    }
}

class Manager extends Pegawai {
    public void tampilkanGaji() {
        System.out.println("Gaji Manager: Rp15.000.000");
    }
}

class Staff extends Pegawai {
    public void tampilkanGaji() {
        System.out.println("Gaji Staff: Rp7.000.000");
    }
}

public class TesPegawai {
    public static void main(String[] args) {
        Pegawai p1 = new Manager();
        Pegawai p2 = new Staff();

        p1.tampilkanGaji();
        p2.tampilkanGaji();
    }
}
