// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BaseCalculator baseCalc1 = new BaseCalculator();
        baseCalc1.summation(5,10);
        baseCalc1.substraction(50, 40);
        baseCalc1.multiplication(8,8);
        baseCalc1.division(100, 10);
        //ProgramerCalctulator progCacl = new ProgramerCalctulator();

        FinancialCalculator financialCacl1 = new FinancialCalculator();
        financialCacl1.summation(8, 25);
        financialCacl1.simplePercentCalc(500, 20);
        financialCacl1.complexPercentCalc(500, 20, 5, 4);

        EngineerCalculator engCalc = new EngineerCalculator();
        engCalc.multiplication(80, 2);
        engCalc.caclCosinus(50);

        AccountantCalculator accountantCalc1 = new AccountantCalculator();
        accountantCalc1.caclNDS(900);

        ProgramerCalctulator progrCalc1 = new ProgramerCalctulator();
        progrCalc1.convertToHex(79);
        }
}