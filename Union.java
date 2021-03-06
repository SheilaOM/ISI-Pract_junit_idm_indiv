import java.util.*;

public class Union {
    public static Vector union (Vector a, Vector b) {

        if (a == null || b == null)
        {
            throw new NullPointerException ("Union.union");
        }

        Vector vect = new Vector(5);

        for (int i=0;i<a.size();i++) {
            if (!vect.contains(a.elementAt(i))) {
                vect.addElement(a.elementAt(i));
            }
        }

        for (int i=0;i<b.size();i++) {
            if (!vect.contains(b.elementAt(i))) {
                vect.addElement(b.elementAt(i));
            }
        }
        return vect;
    }

    public static Set unionSet(Set a, Set b)
    {
        Set set_new = new HashSet();
        if (a == null || b == null)
        {
            throw new NullPointerException ("UnionSet.unionSet");
        }
        set_new.addAll(a);
        set_new.addAll(b);
        return set_new;
    }
}
