import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            System.out.println("Please, input first number: ");
            BaseCalculator baseCalc1 = new BaseCalculator();

            double input1 = Exceptions.isANumber();
            System.out.println("Please, second number: ");
            double input2 = Exceptions.isANumber();

            baseCalc1.summation(input1, input2);
            baseCalc1.substraction(input1, input2);
            baseCalc1.multiplication(input1, input2);
            baseCalc1.division(input1, input2);

            System.out.println("\nFinancial calculator: ");
            FinancialCalculator financialCacl1 = new FinancialCalculator();
            financialCacl1.division(8,0);
            financialCacl1.simplePercentCalc(200, 20);
            financialCacl1.complexPercentCalc(500, 20, 5, 4);

            System.out.println("\nEngineer's calculator: ");
            EngineerCalculator engCalc = new EngineerCalculator();
            engCalc.multiplication(input1, input2 );
            engCalc.caclCosinus(input1);

            System.out.println("\nAccountant's calculator: ");
            AccountantCalculator accountantCalc1 = new AccountantCalculator();
            accountantCalc1.caclNDS(input1);

            System.out.println("\nProgrammer's calculator: ");
            ProgramerCalctulator progrCalc1 = new ProgramerCalctulator();
            progrCalc1.convertToHex((int)input1);
    }
}