public class ProgramerCalctulator extends BaseCalculator {

    public void convertToBinary(int number){
        System.out.println("Convert " + number + " to Binary system: " + Integer.toBinaryString(number));
    }
    public void convertToOctal(int number){
        System.out.println("Convert " + number + " to Octal system: " + Integer.toOctalString(number));
    }
    public void convertToHex(int number){
        System.out.println("Convert " + number + " to Hex system: " + Integer.toHexString(number));
    }
}
