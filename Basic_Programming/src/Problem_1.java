import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input alas : " );
        float alas = input.nextFloat();

        System.out.println("Input tinggi : " );
        float tinggi = input.nextFloat();

        float luasSegitiga =( alas * tinggi)/2 ;
        System.out.println("Luas segitiga : "+ luasSegitiga);
    }



}

