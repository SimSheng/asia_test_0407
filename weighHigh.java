import java.util.Scanner;

/**
 * weighHigh
 */
public class weighHigh {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        for(int i=1;i<=num2;i++){
            for(int j=1;j<=num1;j++){
                System.out.print(j*i + "\t");
            }
            System.out.println();
        }
    }
}