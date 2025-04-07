package utility;
import java.util.Scanner;

public class Util {
    private static Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String text){
        System.out.println(text);
        return scanner.next();
    }
    public static int getIntInput(String text){
        System.out.println(text);
        return scanner.nextInt();
    }

}
