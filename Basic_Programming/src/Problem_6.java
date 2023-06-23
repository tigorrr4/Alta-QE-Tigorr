import java.util.Scanner;

public class Problem_6 {

        public static void main (String[] arg){

            Scanner keyboard =new Scanner(System.in);
            System.out.println(" Input:");
            int num=keyboard.nextInt();
            drawCross(num);

        }

        private static void drawCross(int num) {

            int startCur = 0;
            int endCur = num-1;
            for (int i = 0; i < num; i++)
            {
                for (int j = 0; j < num; j++)
                {
                    if (startCur == endCur && j == i)
                        System.out.print('x');
                    else if (startCur == j || endCur == j)
                        System.out.print('y');
                    else
                        System.out.print('z');
                }
                startCur++;
                endCur--;
                System.out.println();
            }
        }
    }
