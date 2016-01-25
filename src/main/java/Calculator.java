import java.math.BigDecimal;

public class Calculator {

    private static void printResultToConsole(BigDecimal result, String operation) {
        switch (operation) {
            case "add":
                System.out.println("Sum is " + result.toString());
                break;
            case "subtract":
                System.out.println("Difference is " + result.toString());
                break;
            case "multiply":
                System.out.println("Product is " + result.toString());
                break;
            case "divide":
                System.out.println("Quotient is " + result.toString());
                break;
            default:
                System.out.println("Result is " + result.toString());
                break;
        }
    }

    public static BigDecimal add(int operand1, int operand2) {
        BigDecimal sum = new BigDecimal(operand1).add(new BigDecimal(operand2));
        printResultToConsole(sum, "add");
        return sum;
    }

    public static BigDecimal subtract(int operand1, int operand2) {
        BigDecimal difference = new BigDecimal(operand1).subtract(new BigDecimal(operand2));
        printResultToConsole(difference, "subtract");
        return difference;
    }

    public static BigDecimal multiply(int operand1, int operand2) {
        BigDecimal product = new BigDecimal(operand1).multiply(new BigDecimal(operand2));
        printResultToConsole(product, "multiply");
        return product;
    }

    public static BigDecimal divide(int operand1, int operand2) {
        BigDecimal quotient = new BigDecimal(operand1).divide(new BigDecimal(operand2), 10, BigDecimal.ROUND_HALF_UP);
        printResultToConsole(quotient, "divide");
        return quotient;
    }
}