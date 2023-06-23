public class Main {
    public static void main(String[] args) {

            LuasdanKeliling luasdanKeliling = new LuasdanKeliling();
            Persegi persegi = new Persegi(4);
            PersegiPanjang persegiPanjang = new PersegiPanjang(7,8);
            Segitiga segitiga = new Segitiga(3,4);

            luasdanKeliling.luas ();
            luasdanKeliling.keliling();


            System.out.println("Luas persegi adalah: " + persegi.luas());
            System.out.println("keliling persegi adalah: " + persegi.keliling());
            System.out.println("Luas persegiPanjang adalah: " + persegiPanjang.luas());
            System.out.println("keliling persegiPanjang adalah: " + persegiPanjang.keliling());
            System.out.println("Luas segitiga adalah: " + segitiga.luas());
            System.out.println("keliling segitiga adalah: " + segitiga.keliling());
        }
    }
