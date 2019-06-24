package calculatrice;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatriceTest {

    Calculatrice calc = new Calculatrice();
    
    
    
    @Test
    void testCalculerPlus() {
    Assert.assertEquals(7, calc.plus(2, 5));
    Assert.assertEquals(-3, calc.plus(2, -5));
    Assert.assertEquals(3, calc.plus(-2, 5));
    Assert.assertEquals(2, calc.plus(2, 0));
    Assert.assertEquals(5, calc.plus(10, -5));
    Assert.assertEquals(-11, calc.plus(-6, -5));
    }
    
    @Test
    void testCalculerMoins() {
    Assert.assertEquals(3, calc.moins(5, 2));
    Assert.assertEquals(-7, calc.moins(-5, 2));
    Assert.assertEquals(7, calc.moins(5, -2));
    Assert.assertEquals(-3, calc.moins(-5, -2));
    Assert.assertEquals(5, calc.moins(5, 0));
    }
    
    @Test
    void testCalculerMul() {
    Assert.assertEquals(10, calc.mul(5, 2));
    Assert.assertEquals(-10, calc.mul(-5, 2));
    Assert.assertEquals(-10, calc.mul(5, -2));
    Assert.assertEquals(10, calc.mul(-5, -2));
    Assert.assertEquals(0, calc.mul(5, 0));
    }
    
    @Test
    void testCalculerDiv() {
    Assert.assertEquals(5, calc.div(10, 2));
    Assert.assertEquals(-5, calc.div(-10, 2));
    Assert.assertEquals(-5, calc.div(10, -2));
    Assert.assertEquals(5, calc.div(-10, -2));
    
    
        try {
            calc.div(10, 0);
            Assert.fail();
        } catch (ArithmeticException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    void testCalculerMod() {
        Assert.assertEquals(1, calc.mod(11, 2));
        Assert.assertEquals(-1, calc.mod(-11, 2));
        Assert.assertEquals(-1, calc.mod(11, -2));
        Assert.assertEquals(1, calc.mod(-11, -2));

        try {
            calc.mod(10, 0);
            Assert.fail();
        } catch (ArithmeticException e) {
            Assert.assertTrue(true);
        }
    }
    
    @Test
    void testCalculerPow() {
    Assert.assertEquals(4, calc.pow(2, 2));
    Assert.assertEquals(-4, calc.pow(-2, 2));
    Assert.assertEquals(-4, calc.pow(2, -2));
    Assert.assertEquals(4, calc.pow(-2, -2));
    // Assert.assertEquals(?, calc.pow(0, 0)); ajouter une exception
    }

}
