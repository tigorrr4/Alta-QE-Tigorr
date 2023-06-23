import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pilihan;


        do {
            System.out.println("Masukkan angka : ");
            int bilangan = input.nextInt();
            System.out.println(bilanganPrima(bilangan));

            System.out.println("Mau coba bilangan lain? (y / n)");

            pilihan = input.next();

            if (pilihan.equalsIgnoreCase("n")) {
                System.out.println("Terima kasih sudah mencoba");
            }
        } while (pilihan.equalsIgnoreCase(" y"));

        }


    public static boolean bilanganPrima(int nilai) {

        if (nilai == 1) {
            return false;

        }
        for (int i = 2; i < nilai; i++) {
            if (nilai % i == 0) {
                System.out.println("Bukan bilangan prima ");
                return false;
            }

        }
        System.out.println( "Bilangan prima");
        return true;

    }
}


