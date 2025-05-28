package Overloading;

class Kalkulator {
    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println("Hasil 2 + 3 = " + k.tambah(2, 3));
        System.out.println("Hasil 2.5 + 3.5 = " + k.tambah(2.5, 3.5));
        System.out.println("Hasil 1 + 2 + 3 = " + k.tambah(1, 2, 3));
    }
}
