import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canDrink(){
        waterBottle.Drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canFill(){
        waterBottle.Drink();
        waterBottle.Drink();
        waterBottle.Fill();
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterBottle.Empty();
        assertEquals(0, waterBottle.getVolume());
    }
}
