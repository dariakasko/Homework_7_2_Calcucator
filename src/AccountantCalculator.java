public class AccountantCalculator extends BaseCalculator {
    public void caclNDS(double price) {
        System.out.println("NDS of " + price + " is: " + price * (1 + 0.2));
    }
    public void caclPriceWithNDS(double price) {
        System.out.println("Price with NDS" + price + price * (1 + 0.2));
    }
}
