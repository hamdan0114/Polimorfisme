package overriding;

class Karyawan {
    double getGaji() {
        return 3000000;
    }
}

class Manager extends Karyawan {
    double getGaji() {
        return super.getGaji() + 2000000;
    }
}

class Direktur extends Karyawan {
    double getGaji() {
        return super.getGaji() + 5000000;
    }
}

public class TesGaji {
    public static void main(String[] args) {
        Karyawan m = new Manager();
        Karyawan d = new Direktur();
        System.out.println("Gaji Manager: " + m.getGaji());
        System.out.println("Gaji Direktur: " + d.getGaji());
    }
}
