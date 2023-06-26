package JavaCalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator {

    public static int a = 5;
    public static int b = 6;
    public static int c = 7;
    public static int d;

    @Test
    public void additionTest() {
        System.out.println("Running Addition Test");

        d = a + b + c;

        Assert.assertEquals(d, 18, "Answer is incorrect");

        System.out.println("Answer is: " + d);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.additionTest();
    }
}
