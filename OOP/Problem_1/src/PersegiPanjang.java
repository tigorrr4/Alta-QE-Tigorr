public class PersegiPanjang extends LuasdanKeliling {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    float luas() {
        return (panjang * lebar);
    }


    @Override
    float keliling() {
        return (2 * (panjang + lebar));
    }
}

