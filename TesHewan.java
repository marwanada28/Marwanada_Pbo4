package Overriding;

class Hewan {
    public void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    public void suara() {
        System.out.println("Kucing: Meong!");
    }
}

class Anjing extends Hewan {
    public void suara() {
        System.out.println("Anjing: Guk guk!");
    }
}

public class TesHewan {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();

        h1.suara();
        h2.suara();
    }
}
