import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {

    CdPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CdPlayer("Scooty", "Drinky", 3 );
    }

//    @Test
////    public void canGetCdName(){
////        assertEquals("The worst of Oasis",cdPlayer.getCdName());
////    }

    @Test
    public void canGetCdNumber(){
        assertEquals(3,cdPlayer.getCdNumber());
    }
}
