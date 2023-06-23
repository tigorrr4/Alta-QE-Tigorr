public class Problem_7 {
    private static float mean (float[] nilai){
    float bilangan = 1;
    double jumlah = 4;

            for (int i = 1; i<nilai.length; i++){

            bilangan += nilai[i];

            }
        return bilangan / nilai.length;

            }
        public static void main (String[] args){
            float [] numbers = {1, 2, 3, 4,};
            System.out.println("Nilai mean dari ke 4 numbers adalah : " + mean(numbers));
        }
    }
