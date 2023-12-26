package TurtlePackage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TurtleTest extends Turtle {

    @Test
    public void testThatTurtleIsInZeroZeroByDefault(){
        Turtle turtle = new Turtle();
        TurtlePosition position = new TurtlePosition(0,0);
        assertSame(position, turtle.getClass());
    }
    @Test
    public void testThatPenIsAlwaysUpByDefault(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }




}