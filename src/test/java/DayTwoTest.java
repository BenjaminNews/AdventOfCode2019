import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayTwoTest {

    @Test
    public void givenInput_return_3500() {
        DayTwo dayTwo = new DayTwo();
        String input = "1,9,10,3,2,3,11,0,99,30,40,50";
        assertEquals(3500, dayTwo.partOne(input));
    }
}