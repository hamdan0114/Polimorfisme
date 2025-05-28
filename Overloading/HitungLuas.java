package Overloading;

class HitungLuas {
    double luas(double sisi) {
        return sisi * sisi;
    }

    double luas(double panjang, double lebar) {
        return panjang * lebar;
    }

    double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        HitungLuas hl = new HitungLuas();
        System.out.println("Luas persegi: " + hl.luas(4));
        System.out.println("Luas persegi panjang: " + hl.luas(4, 6));
        System.out.println("Luas lingkaran: " + hl.luasLingkaran(7));
    }
}
