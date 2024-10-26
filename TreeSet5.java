package collection.listclasses;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet5 {

    public static void main(String[] args) {
        TreeSet<Flipkart> ts = new TreeSet<>(new FlipkartProdName());
        ts.add(new Flipkart(202, "mobile"));
        ts.add(new Flipkart(101, "projector"));
        ts.add(new Flipkart(303, "tablet")); // Changed ID to be unique
        ts.add(new Flipkart(404, "watches")); // Changed ID to be unique

        Iterator<Flipkart> fk = ts.iterator();
        while (fk.hasNext()) {
            Flipkart f1 = fk.next();
            System.out.println(f1.fkProdId + "_" + f1.fkProdName); // Corrected print statement
        }
    }
}
