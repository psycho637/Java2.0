package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalcUnitTests {

    @Test
    public void testSetAndGetInNumberClass() {
        Numbers x = new Numbers();
        x.setFirstNumber(7.5);
        Assert.assertEquals(7.5, x.getFirstNumber(), 0);
        x.setSecondNumber(7.0);
        Assert.assertEquals(7.0, x.getSecondNumber(), 0);
    }
    @Test
    public void testSumCase() {
        Action x = new Action(3, 2, "+");
        Assert.assertEquals("",Double.toString(5.0),x.pickAction("+"));
    }
    @Test
    public void testSubstractionCase() {
        Action x = new Action(3, 2, "-");
        Assert.assertEquals("",Double.toString(1.0),x.pickAction("-"));
    }
    @Test
    public void testMultiplicationCase() {
        Action x = new Action(3, 2, "*");
        Assert.assertEquals("",Double.toString(6.0),x.pickAction("*"));
    }
    @Test
    public void testDivisionCase() {
        Action x = new Action(3, 2, "/");
        Assert.assertEquals("",Double.toString(1.5),x.pickAction("/"));
    }
    @Test
    public void testInfinityException() {
        Action x = new Action(2, 0, "/");
        Assert.assertEquals("","УУУУУУуууууу, на ноль поделил?",x.pickAction("/"));
    }
}