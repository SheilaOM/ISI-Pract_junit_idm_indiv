import java.util.*;

public class Union {
    public static Vector union (Vector a, Vector b) {

        if (a == null || b == null)
        {
            throw new NullPointerException ("Union.union");
        }

        Vector vect = new Vector(5);
        vect = a;

        for (int i=0;i<b.size();i++) {
            if (!vect.contains(b.elementAt(i))) {
                vect.addElement(b.elementAt(i));
            }
        }
        return vect;
    }
}
