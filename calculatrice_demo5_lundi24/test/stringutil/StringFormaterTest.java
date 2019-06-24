package stringutil;


import org.junit.Assert;
import org.junit.jupiter.api.Test;


class StringFormaterTest {

    StringFormater format = new StringFormater();
    
    @Test
    void test1() {
    String string = "Etienne";
    String result = format.toUpperA(string);
    Assert.assertEquals(string, result);
    }
    
    @Test
    void test2() {
    String string = "Antoine";
    String result = format.toUpperA(string);
    Assert.assertEquals(string, result);
    }
    
    @Test
    void test3() {
    String string = "arbalète";
    String result = format.toUpperA(string);
    Assert.assertEquals("ArbAlète", result);
    }
    

}
