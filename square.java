import java.util.Scanner;

/**
 * square
 */
public class square {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num=scn.nextInt();
        char word=scn.next().charAt(0);

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print(word);
            }
            System.out.println();
        }
    }
}