public class kubus extends menghitungvolume {
    int sisi;

    public  kubus(int sisi) {
        this.sisi = sisi;
    }

    @Override
    double volume() {
        return sisi*sisi*sisi;
    }
}

