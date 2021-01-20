package assignment6;

import org.junit.FixMethodOrder;
import org.junit.Test;
import edu.princeton.cs.introcs.StdDraw;
import org.junit.runners.MethodSorters;
import support.cse131.ArgsProcessor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DragonTests {

    /**
     * Test the 0th dragon curve
     */
    @Test
    public void testDragon0() {
        String curve = RecursiveMethods.dragon(0);
        assertEquals("Dragon zero returns incorrect String", "F-H", curve);
        StdDraw.setScale(-1, 1);
        drawCurve(curve, 0.25);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a curve for dragon(0) as shown on the website?\n\n" +
                "Enter true or false:"));
    }

    /**
     * Test the 3rd dragon curve
     */
    @Test
    public void testDragon3() {
        String curve = RecursiveMethods.dragon(3);
        assertEquals("Dragon three returns incorrect String", "F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H", curve);
        StdDraw.setXscale(-1.5, 0.75);
        StdDraw.setYscale(-0.75, 1.25);
        drawCurve(curve, 0.25);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a curve for dragon(3) as shown on the website?\n\n" +
                "Enter true or false:"));
    }

    /**
     * Test the 10th dragon curve
     */
    @Test
    public void testDragonTen() {
        String curve = RecursiveMethods.dragon(10);
        assertEquals("Dragon ten returns incorrect String", "F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H-F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H-F-H-F+H+F-H+F+H+F-H-F+H-F-H+F+H+F-H-F+H+F-H+F+H", curve);
        StdDraw.setXscale(-12, 8);
        StdDraw.setYscale(-6, 14);
        drawCurve(curve, 0.25);
        ArgsProcessor ap = new ArgsProcessor(new String[] {});
        assertTrue(ap.nextBoolean("Does the screen show a curve for dragon(10) as shown on the website?\n\n" +
                "Enter true or false:"));
    }

    private void drawCurve(String curve, double segLength) {
        StdDraw.clear();
        //start to the right
        int xVec = 1;
        int yVec = 0;
        //start at coordinate 0, 0
        double x = 0;
        double y = 0;
        for(int i = 0; i < curve.length(); i++) {
            if(curve.charAt(i) == 'F' || curve.charAt(i) == 'H') { //draw a line
                double newX = x + segLength * xVec;
                double newY = y + segLength * yVec;
                StdDraw.line(x, y, newX, newY);
                x = newX;
                y = newY;
            } else if(curve.charAt(i) == '+') { //turn left
                int temp = xVec;
                xVec = yVec;
                yVec = -temp;
            } else if(curve.charAt(i) == '-') { //turn right
                int temp = xVec;
                xVec = -yVec;
                yVec = temp;
            }
        }
        StdDraw.show();
    }
}
