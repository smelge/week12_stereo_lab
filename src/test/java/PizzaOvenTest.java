import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PizzaOvenTest {

    PizzaOven pizzaOven;

    @Before
    public void before(){
        pizzaOven = new PizzaOven("Scooty", "Drinky", 200, "Pepperoni, cheese, cheese, cheese");
    }

    @Test
    public void hasTemperature(){
        assertEquals(200, pizzaOven.getTemperature());
    }

    @Test
    public void hasTopping(){
        assertEquals("Pepperoni, cheese, cheese, cheese", pizzaOven.getAutoTopping());
    }
}
