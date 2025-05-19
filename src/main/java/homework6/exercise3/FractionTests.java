package homework6.exercise3;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionTests {

    private Fraction fraction;

    @BeforeEach
    public void setUp() {
        fraction = new Fraction(1, 2);
    }

    @Test
    public void testFractionConstructor() {
        Assert.assertEquals(1, fraction.getZaehler());
        Assert.assertEquals(2, fraction.getNenner());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("1/2", fraction.toString());
    }

    @Test
    public void testKehrwert() {
        fraction.Kehrwert();
        Assert.assertEquals("2/1", fraction.toString());
    }

    @Test
    public void testMultiplikation() {
        Fraction fraction2 = new Fraction(3, 4);
        fraction.multiplikation(fraction2);
        Assert.assertEquals("3/8", fraction.toString());
    }

    @Test
    public void testAddition() {
        Fraction fraction2 = new Fraction(1, 3);
        fraction.addition(fraction2);
        Assert.assertEquals("5/6", fraction.toString());
    }

    @Test
    public void testKuerzen() {
        fraction = new Fraction(4, 8);
        fraction.kuerzen();
        Assert.assertEquals("1/2", fraction.toString());
    }

    @Test
    public void testSetZaehler() {
        fraction.setZaehler(3);
        Assert.assertEquals(3, fraction.getZaehler());
    }

    @Test
    public void testSetNenner() {
        fraction.setNenner(5);
        Assert.assertEquals(5, fraction.getNenner());
    }

    @Test
    public void NennerZeroException() {
        assertThrows(IllegalArgumentException.class, () -> {
            fraction.setNenner(0);
        });
    }
}
