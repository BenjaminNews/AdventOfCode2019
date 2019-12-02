import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayTwoTest {

    private final String inputOne = "1,9,10,3,2,3,11,0,99,30,40,50";

    @Test
    public void givenInputOne_return_3500() {
        DayTwo dayTwo = new DayTwo(inputOne);
        assertEquals(3500, dayTwo.partOne());
        dayTwo = new DayTwo("1,0,0,0,99");
        dayTwo.partOne();

        dayTwo = new DayTwo("2,3,0,3,99");
        dayTwo.partOne();

        dayTwo = new DayTwo("2,4,4,5,99,0");
        dayTwo.partOne();

        dayTwo = new DayTwo("1,1,1,4,99,5,6,0,99");
        dayTwo.partOne();
    }
}