import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTests {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void canPrintIfEnoughPages(){
        printer.Print(5, 5);
        assertEquals(75, printer.getSheets());
    }

    @Test
    public void cantPrintBecauseNotEnoughSheets(){
        printer.Print(15, 10);
        assertEquals(100, printer.getSheets());
    }

}
