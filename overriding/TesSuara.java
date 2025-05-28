package overriding;

class Hewan {
    void suara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    void suara() {
        System.out.println("Kucing: Meong!");
    }
}

class Anjing extends Hewan {
    void suara() {
        System.out.println("Anjing: Guk guk!");
    }
}

public class TesSuara {
    public static void main(String[] args) {
        Hewan h1 = new Kucing();
        Hewan h2 = new Anjing();
        h1.suara();
        h2.suara();
    }
}
