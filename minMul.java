import java.util.Scanner;

/**
 * minMul
 */
public class minMul {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        if(num1%num2 !=0 && num1%num3 !=0 && num2%num3 !=0){
            System.out.println(num1*num2*num3);
        }
        else if(num1%num2 ==0 || num1%num3 ==0 || num2%num3 ==0){
            
        }
    }
}