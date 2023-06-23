public class Harga_Ongkos_kirim extends  OngkosKirim {

    public Harga_Ongkos_kirim() {
        super();
    }

    public int hitungHargaOngkir() {
        double volume = totalKapasitas();
        double beratPembulatan = hitungBerat();

        if (volume >= 50 || beratPembulatan >= 1) {
            return 5000;
        } else {
            return 0;
        }
    }
}

