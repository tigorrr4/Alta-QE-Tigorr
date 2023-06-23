
    public class Persegi extends LuasdanKeliling {
        int sisi;

        public Persegi (int sisi) {
            this.sisi = sisi;
        }

        @Override
        float luas() {
            return(sisi * sisi);
        }


        @Override
        float keliling() {
            return(sisi * 4);
        }
    }


