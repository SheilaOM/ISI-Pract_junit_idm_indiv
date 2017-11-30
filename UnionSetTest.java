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

	/*No veo necesario implementar Test para comprobar, si se repiten valores
	 * en un Set, ya que ésto lo implementa la propia interfaz de Set, al igual que
	 * permitir que un elemento de Set sea null, y que éste se repita.
	 */
}
