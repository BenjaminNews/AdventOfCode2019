import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DayOneTest {

    @Test
    public void givenInputMassOf_12_returns_2() {
        assertEquals(2, DayOne.partOne("12"));
    }

    @Test
    public void givenInputMassOf_14_returns_2() {
        assertEquals(2, DayOne.partOne("14"));
    }

    @Test
    public void givenInputMassOf_1969_returns_654() {
        assertEquals(654, DayOne.partOne("1969"));
    }

    @Test
    public void givenInputMassOf_100756_returns_33583() {
        assertEquals(33583, DayOne.partOne("100756"));
    }

    @Test
    public void givenInputMassOf_12_returns_2_partTwo() {
        assertEquals(2, DayOne.partTwo("14"));
    }

    @Test
    public void givenInputMassOf_1969_returns_966_partTwo() {
        assertEquals(966, DayOne.partTwo("1969"));
    }

    @Test
    public void givenInputMassOf_100756_returns_50346_partTwo() {
        assertEquals(50346, DayOne.partTwo("100756"));
    }
}