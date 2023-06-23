public class Segitiga extends LuasdanKeliling {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    float luas() {
        return(alas*tinggi/2);
    }


    @Override
    float keliling() {
        return ( alas * tinggi);
    }
}



