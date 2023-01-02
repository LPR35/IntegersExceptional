import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;


public class IntegersExceptional {
    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput = "";
        ArrayList<Integer> vals = new ArrayList<Integer>();
        int index;

        for (int i = 0; i < args.length; i++) {
            try {
                userInput = args[i];
                int userInt = Integer.valueOf(userInput);
                vals.add(userInt);
                System.out.println("Converter method says integer OK - " + userInt);

            } catch (NumberFormatException e) {
                System.out.println("Catch block says the argument " + userInput + " is ignored because " + userInput);
            }
        }
            System.out.println("Vector contents are ");
            for (index = 0; index < vals.size(); index++) {
            System.out.println("Item " + index + " is " + vals.get(index));
            }
    }
}
