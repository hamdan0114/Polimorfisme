package Overloading;

class Mahasiswa {
    void tampil(String nama) {
        System.out.println("Nama: " + nama);
    }

    void tampil(String nama, int umur) {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }

    void tampil(String nama, String jurusan) {
        System.out.println("Nama: " + nama + ", Jurusan: " + jurusan);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.tampil("Budi");
        mhs.tampil("Sari", 20);
        mhs.tampil("Rani", "Informatika");
    }
}
