import java.util.Scanner;

/**
 * count
 */
public class count {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);

        String oneNum = scn.nextLine();
        int count=0;
        for(int i=0;i<oneNum.length();i++){
            count++;
        }
        System.out.println(count);
    }
}