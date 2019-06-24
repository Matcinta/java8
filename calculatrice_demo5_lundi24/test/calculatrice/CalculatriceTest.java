package calculatrice;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class CalculatriceTest {

    Calculatrice calc = new Calculatrice();
    @Test
    void testCalculerStandard() {
        Assert.assertEquals(7, calc.plus(2, 5));
    }
    
    @Test
    void testCalculerAuxLimites() {
    Assert.assertEquals(calc.plus(Integer.MAX_VALUE, 1),
    (Integer.MAX_VALUE + 1));
    }

}
