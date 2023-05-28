import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static double isANumber() {
        double doubleVar;
        Scanner var = new Scanner(System.in);
        try {
            doubleVar = var.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Only numbers can be input. No symlobs, empty fields, etc." +
                    "\nPlease, input correct value: ");
            doubleVar = isANumber();
        }
        return doubleVar;
    }
}
