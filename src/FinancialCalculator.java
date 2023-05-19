public class FinancialCalculator extends BaseCalculator {
    public void simplePercentCalc(double number, double percent) {
        System.out.println("Simple percent calculation of " + number + " and " + percent + "% : " + number * percent / 100);
    }
    public void complexPercentCalc(double initialDeposit, double percent, int year, int quantityOfPaymentsByYear) {
        System.out.println("Complex percent calculation:\n" +
                "Initial deposit - " + initialDeposit + ", percent: " + percent + "% , for " + year + " years with "
                + quantityOfPaymentsByYear + " payment per year - "
                + initialDeposit * Math.pow((1 + percent/100), year * quantityOfPaymentsByYear));
    }

}
