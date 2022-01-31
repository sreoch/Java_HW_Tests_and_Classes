import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(10, calculator.Add(5,5));
    }

    @Test
    public void canSubtract(){
        assertEquals(5, calculator.Subtract(10,5));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.Multiply(5,5));
    }

    @Test
    public void canDivide(){
        assertEquals(5, calculator.Divide(50,10), 0.0);
    }
}
