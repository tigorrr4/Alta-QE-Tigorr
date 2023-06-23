public class tabung extends menghitungvolume {
    double jari;
    double tinggiTabung;



    public tabung(float jari, float tinggiTabung) {
        this.jari = jari;
        this.tinggiTabung = tinggiTabung;
    }

    @Override
    double volume() {
        return (Math.PI*jari*jari*tinggiTabung);
    }
}

