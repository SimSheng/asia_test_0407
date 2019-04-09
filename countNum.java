import java.util.Scanner;

/**
 * countNum
 */
public class countNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String oneNum = scn.nextLine();
        int count=0;
        for(int i=0;i<oneNum.length();i++){
            count++;
        }
        System.out.println(count);
    }
}