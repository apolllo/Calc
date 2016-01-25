import org.testng.annotations.*;
import java.math.BigDecimal;
import static org.testng.Assert.*;

public class CalculatorTestNG {


    @Test
    public void testAdd() {
        BigDecimal sum = Calculator.add(2147483647,1);
        assertEquals(sum.longValue(), 2147483648L, "Sum should be as expected");
        sum = Calculator.add(2147483647,-1);
        assertTrue(sum.intValue() == 2147483646, sum.toPlainString() + " should match the expected value of " + 2147483646);
        sum = Calculator.add(0,1);
        assertEquals(sum.intValue(), 1, "Sum should be as expected");
        sum = Calculator.add(-2147483647,1);
        assertEquals(sum.intValue(), -2147483646, "Sum should be as expected");
    }

    @Test
    public void testSubtract() {
        BigDecimal diff = Calculator.subtract(2147483647,1);
        assertEquals(diff.intValue(), 2147483646, "Difference should be as expected");
        diff = Calculator.subtract(2147483647,-1);
        assertEquals(diff.longValue(), 2147483648L, "Difference should be as expected");
        diff = Calculator.subtract(0,1);
        assertEquals(diff.intValue(), -1, "Difference should be as expected");
        diff = Calculator.subtract(-2147483647,1);
        assertEquals(diff.longValue(), -2147483648L, "Difference should be as expected");
    }

    @Test
    public void testMultiply() {
        BigDecimal product = Calculator.multiply(2147483647,2);
        assertEquals(product.longValue(),2147483647L * 2, "Product should be as expected");
        product = Calculator.multiply(2147483647,-1);
        assertEquals(product.intValue(), -2147483647, "Product should be as expected");
        product = Calculator.multiply(0,1);
        assertEquals(product.intValue(), 0, "Product should be as expected");
    }

    @Test
    public void testDivide() {
        BigDecimal quotient = Calculator.divide(2147483647,222);
        assertEquals(quotient.toPlainString(), "9673349.7612612613", "Quotient should be as expected");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideNegative() {
        BigDecimal quotient = Calculator.divide(2147483647,0);
    }
}
