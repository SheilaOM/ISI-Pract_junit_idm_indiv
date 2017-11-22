import java.util.*;

public class Union {
    public static Vector union (Vector a, Vector b) {
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
