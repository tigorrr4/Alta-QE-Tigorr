import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Konversi Nilai ");

        int nilai = input.nextInt();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("A");

        } else if (nilai >= 65 && nilai <= 79) {
            System.out.println("B+");

        }else if (nilai >= 50 && nilai <= 64) {
            System.out.println("B");

        }else if (nilai >= 35 && nilai <= 49) {
            System.out.println("C");

        }else if (nilai >= 0 && nilai <=34) {
            System.out.println("D");

        }else System.out.println("Invalid");




    }
}