import static org.junit.Assert.*;

import org.junit.Test;

public class DayFourTest {

    @Test
    public void givenInput_111111_returnsTrue() {
        assertEquals(1, DayFour.partOne("111111-111111"));
    }

    @Test
    public void givenInput_223450_returnsFalse() {
        assertEquals(0, DayFour.partOne("223450-223451"));
    }

    @Test
    public void givenInput_123789_returnsFalse() {
        assertEquals(0, DayFour.partOne("123789-123790"));
    }

    @Test
    public void givenInput_112233_returnsFalse() {
        assertEquals(1, DayFour.partTwo("112233-112233"));
    }

    @Test
    public void givenInput_123444_returnsFalse() {
        assertEquals(0, DayFour.partTwo("123444-123444"));
    }

    @Test
    public void givenInput_111122_returnsFalse() {
        assertEquals(0, DayFour.partTwo("111122-111122"));
    }
}