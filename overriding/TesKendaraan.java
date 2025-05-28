package overriding;

class Kendaraan {
    void info() {
        System.out.println("Ini adalah kendaraan umum.");
    }
}

class Mobil extends Kendaraan {
    void info() {
        System.out.println("Ini adalah mobil pribadi.");
    }
}

class Motor extends Kendaraan {
    void info() {
        System.out.println("Ini adalah motor roda dua.");
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

