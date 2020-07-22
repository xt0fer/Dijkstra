package rocks.zipcode;

import static org.junit.Assert.*;

public class CalculateTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void runSimple() {
        Calculate engine = new Calculate();

        String args2 = "( 4 + 5 )";
        double expected = 9.0;
        double actual = engine.run(args2);
        assertEquals(expected, actual, 0.0001);
    }
    @org.junit.Test
    public void runAlexTest() {
        Calculate engine = new Calculate();

        String args2 = "( -4 + 5 )";
        double expected = 1.0;
        double actual = engine.run(args2);
        assertEquals(expected, actual, 0.0001);
    }

    @org.junit.Test
    public void runSimpleRPN() {
        Calculate engine = new Calculate();

        String args2 = "( 4 5 + 7 3.0 / * )";
        double expected = 21.0;
        double actual = engine.run(args2);
        assertEquals(expected, actual, 0.0001);
    }

    @org.junit.Test
    public void runFailedTestNoParens() {
        Calculate engine = new Calculate();

        String args2 = "4 + 5";
        double expected = 9.0;
        double actual = engine.run(args2);
        assertNotEquals(expected, actual, 0.0001);
    }

    @org.junit.Test
    public void runSimple2() {
        Calculate engine = new Calculate();

        String args2 = "( ( 4 + 5 ) * ( 7 / 3.0 ) )";
        double expected = 21.0;
        double actual = engine.run(args2);
        assertEquals(expected, actual, 0.0001);
    }

    @org.junit.Test
    public void runSimple3() {
        Calculate engine = new Calculate();

        String args2 = "( sqrt ( 2.0 ) * sqrt ( 5.0 ) )";
        double expected = 3.162277660;
        double actual = engine.run(args2);
        assertEquals(expected, actual, 0.0001);
    }

    @org.junit.Test
    public void runLongerDemo() {
        Calculate engine = new Calculate();

        String args2 = "( ( ( 4 + 5 ) * ( 7 / 3.0 ) ) - ( 13 / 6.0 ) )";
        double expected = 18.833333333;
        double actual = engine.run(args2);
        assertEquals(expected, actual, 0.0001);
    }


}
