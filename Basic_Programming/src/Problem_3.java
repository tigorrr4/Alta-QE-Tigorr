import java.util.Scanner;

public class Problem_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input angka : ");

        int nilai = input.nextInt();

        for (int i =1; i<= nilai; i++){

            if (nilai % i == 0){

                System.out.println(i);
            }
        }

    }
}