import java.util.Scanner;

/**
 * checkWord
 */
public class checkWord {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char text=scn.next().charAt(0);

        if((int)(text) >= 60 && (int)(text) <= 90){
            System.out.println("uppercase");
        }
        else if((int)(text) >= 97 && (int)(text) <= 122){
            System.out.println("lowercase");
        }
        else{
            System.out.println("special character");
        }

        
    }
}