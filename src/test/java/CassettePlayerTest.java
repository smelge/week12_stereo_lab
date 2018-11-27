import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {
    CassettePlayer cassettePlayer;

    @Before
    public void before(){
        cassettePlayer = new CassettePlayer("Scooty", "Drinky", 8,1);
    }

    @Test
    public void canGetNumberOfSides(){
        assertEquals(8,cassettePlayer.getCassetteSides());
    }

    @Test
    public void canGetPitch(){
        assertEquals(1,cassettePlayer.getChangePitch());
    }
}
