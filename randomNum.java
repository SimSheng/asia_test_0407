import java.util.Random;
import java.util.Scanner;

/**
 * randomNum
 */
public class randomNum {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Random randnum = new Random();
        randnum.setSeed(23323456);
        
        int save[]= new int[6];
        for(int i=0;i<6;i++){
            save[i]=randnum.nextInt(42)+1;
            

        }

        for(int i=0;i<6;i++){
            System.out.printf(save[i] + "\t");
        }

        System.out.println();
    }
}