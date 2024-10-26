package collection.listclasses;

import java.util.Comparator;

public class FlipkartProdName implements Comparator<Flipkart>
{
	public int compare(Flipkart o1, Flipkart o2) {
		return o1.fkProdName.compareTo(o2.fkProdName);
	}

}
