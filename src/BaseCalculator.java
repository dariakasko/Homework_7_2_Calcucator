import java.util.InputMismatchException;

public class BaseCalculator {

    public void summation(double var1, double var2) {
                System.out.println(var1 + " + " + var2 + " = " + (var1 + var2));
    }
    public void substraction(double var1, double var2) {
        System.out.println(var1 + " - " + var2 + " = " + (var1 - var2));
    }
    public void multiplication(double var1, double var2) {
        System.out.println(var1 + " * " + var2 + " = " + (var1 * var2));
    }
    public void division(double var1, double var2) {
        try {
            if (var2 == 0){
                int result = (int) var1/ (int)var2;
            }
            else {
                double result = var1 / var2;
                System.out.println(var1 + " / " + var2 + " = " + result);
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("Can't divide by zero");
        }
    }
}
