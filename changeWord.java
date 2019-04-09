import java.util.Scanner;

/**
 * checkWord
 */
public class changeWord {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char text=scn.next().charAt(0);
        int i;
        if((int)(text) >= 60 && (int)(text) <= 90){
            i=(int)(text)+32;
            System.out.println((char)(i));
        }
        else if((int)(text) >= 97 && (int)(text) <= 122){
            i=(int)(text)-32;
            System.out.println((char)(i));
        }
        

        
    }
}