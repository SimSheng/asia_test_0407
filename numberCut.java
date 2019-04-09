import java.util.Scanner;

/**
 * numberCut
 */
public class numberCut {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String num = scn.nextLine();
        char save[] = num.toCharArray();
        for(int i=0;i<num.length();i++){
            System.out.print(save[i] + " ");
        }
        System.out.println();
    }
}