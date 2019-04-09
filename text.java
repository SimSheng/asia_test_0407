import java.util.Random;
import java.util.Scanner;

/**
 * randomNum
 */
public class text {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Random randnum = new Random();
        
        
        int save[]= new int[6];
        for(int i=0;i<=6;i++){
            save[i]=randnum.nextInt(42)+1;
            for(int j=i;j>0;j--){
                if(save[i] == save[i-j]){
                    save[i]=randnum.nextInt(42)+1;
                }
            }

        }

        for(int i=0;i<=6;i++){
            System.out.println(save[i] + "\t");
        }

        System.out.println();
    }
}