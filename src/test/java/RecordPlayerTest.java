import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {
    RecordPlayer recordPlayer;

    @Before
    public void before(){
      recordPlayer = new RecordPlayer("Scooty", "Drinky", 8,false);
    }

    @Test
    public void canGetSpeed(){
        assertEquals(8,recordPlayer.getSpeed());
    }

    @Test
    public void hiddenSatanicMessages(){
        assertEquals(false,recordPlayer.isReverse());
    }

    @Test
    public void canPlay(){
        assertEquals("The RecordPlayer is playing.", recordPlayer.play());
    }
}
