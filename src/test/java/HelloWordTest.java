import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWordTest {
    private String expected;
    private String hiJay;

    @Before
    public void setUp(){
        this.expected = "Hello, World!";
        this.hiJay = "Hello, Jay";
    }

    @Test
    public void testForHelloWorld(){
        Assert.assertEquals(this.expected, HellWorld.hello());
    }

    @Test
    public void testForHelloJay(){
        Assert.assertEquals(this.hiJay, HellWorld.hello("Jay"));
    }

    @Test
    public void testForHelloDavid(){
        Assert.assertEquals("Hello, David", HellWorld.hello("David"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNull(){
        Assert.assertNotEquals("Hello, null!", HellWorld.hello(null));
    }
}
