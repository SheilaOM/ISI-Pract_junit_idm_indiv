import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class UnionSetTest {

    private Set a, b;

    @Before      // Set up - Called before every test method.
    public void setUp()
    {
        a = new HashSet();
        b = new HashSet();
    }

    @Test (expected = NullPointerException.class)
    public void nullSet()
    {
        a = null;
        b.add(4);
        Union.unionSet(a, b);
    }

}
