import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DayThreeTest {

    private DayThree dayThree;

    @Before
    public void setup() {
        this.dayThree = new DayThree();
    }

    @Test
    public void givenInputOne_returns_6() {
        assertEquals(6, dayThree.partOne("R8,U5,L5,D3", "U7,R6,D4,L4"));
    }

    @Test
    public void givenInputTwo_returns_159() {
        assertEquals(159, dayThree.partOne("R75,D30,R83,U83,L12,D49,R71,U7,L72", "U62,R66,U55,R34,D71,R55,D58,R83"));
    }

    @Test
    public void givenInputThree_returns_135() {
        assertEquals(135, dayThree.partOne("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51", "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"));
    }

    @Test
    public void givenInputOne_returns_30() {
        assertEquals(30, dayThree.partTwo("R8,U5,L5,D3", "U7,R6,D4,L4"));
    }

    @Test
    public void givenInputTwo_returns_610() {
        assertEquals(610, dayThree.partTwo("R75,D30,R83,U83,L12,D49,R71,U7,L72", "U62,R66,U55,R34,D71,R55,D58,R83"));
    }

    @Test
    public void givenInputThree_returns_410() {
        assertEquals(410, dayThree.partTwo("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51", "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"));
    }
}