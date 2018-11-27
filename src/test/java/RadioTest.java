import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Scooty", "Drinky", "Radio1");
    }

    @Test
    public void hasStation(){
        assertEquals("You are listening to Radio 1", radio.tune());
    }

    @Test
    public void canPlay(){
        assertEquals("The radio is playing.", radio.play());
    }
}
