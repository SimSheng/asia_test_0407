import java.util.Scanner;

/**
 * conversion
 */
public class conversion {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double cm = scn.nextFloat();
        double kg = scn.nextFloat();

        System.out.println(cm*1/(double)(2.54));
        System.out.println(kg*1/(double)(0.454));
    }
}