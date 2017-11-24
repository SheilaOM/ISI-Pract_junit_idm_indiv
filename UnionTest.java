import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionTest
{
    private Vector a, b;

    @Before      // Set up - Called before every test method.
    public void setUp()
    {
        a = new Vector(5);
        b = new Vector(5);
    }

    @Test
    public void repeatElement()
    {
        a.addElement(2);
        a.addElement(3);
        a.addElement(4);

        b.addElement(2);
        b.addElement(5);
        b.addElement(a);

        Vector c = new Vector(5);
        c.addElement(2);
        c.addElement(3);
        c.addElement(4);
        c.addElement(5);
        c.addElement(a);

        assertTrue("A same element is in both vectors", c.equals(Union.union(a, b)));
    }

    @Test
    public void elementNull()
    {
        a.addElement(2);
        a.addElement(3);
        a.addElement(null);

        b.addElement(2);
        b.addElement(5);
        b.addElement(a);

        Vector c = new Vector(5);
        c.addElement(2);
        c.addElement(3);
        c.addElement(null);
        c.addElement(5);
        c.addElement(a);

        assertTrue("A vector contain null element", c.equals(Union.union(a, b)));
    }

    @Test (expected = NullPointerException.class)
    public void nullVector()
    {
        a = null;
        b.addElement(4);
        Union.union(a, b);
    }
}
