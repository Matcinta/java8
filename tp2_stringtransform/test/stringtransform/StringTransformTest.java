package stringtransform;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class StringTransformTest {
    
    StringTransform st = new StringTransform();

    @Test
    void testTransformConcat() {
        String a = "chat";
        String b = "rat";
        Assert.assertEquals("chatrat", st.transform(a, "concat", b) );
    }
    
    @Test
    void testTransformConcat2() {
        String a = "chat";
        String b = " rat";
        Assert.assertEquals("chat rat", st.transform(a, "concat", b) );
    }
    
    @Test
    void testTransformUpper() {
        String a = "chat";
        String b = "rat";
        Assert.assertEquals("CHAT", st.transform(a, "upper", b));
    }
    
    @Test
    void testTransformLower() {
        String a = "ChAt";
        String b = "rat";
        Assert.assertEquals("chat", st.transform(a, "lower", b));
    }
    
    @Test
    void testTransformLower2() {
        String a = "chat";
        String b = "rat";
        Assert.assertEquals("chat", st.transform(a, "lower", b));
    }
   
    @Test
    void testTransformZip() {
        String a = "rat";
        String b = "chien";
        Assert.assertEquals("rcahti", st.transform(a, "zip", b));
    }
    
    @Test
    void testTransformZip2() {
        String a = "chat";
        String b = "rat";
        Assert.assertEquals("crhaat", st.transform(a, "zip", b));
    }
    
    @Test
    void testTransformReverse() {
        String a = "chat";
        String b = "rat";
        Assert.assertEquals("tahc", st.transform(a, "reverse", b));
    }
    
    @Test
    void testTransformReverse2() {
        String a = "chat";
        String b = null;
        Assert.assertEquals("tahc", st.transform(a, "reverse", b));
    }
    
    @Test
    void testTransformTacnoc() {
        String a = "chat";
        String b = "rat";
        Assert.assertEquals("tahctar", st.transform(a, "tacnoc", b));
    }
    

}
