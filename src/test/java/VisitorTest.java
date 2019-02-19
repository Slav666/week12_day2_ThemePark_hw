import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(30, 175, 45.5);
    }

    @Test
    public void cangetAge(){
        assertEquals(30, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(175, visitor.getHeight(),0.01);
    }

    @Test
    public void ceGetMoney(){
        assertEquals(45.5, visitor.getMoney(), 0.01);
    }
}
