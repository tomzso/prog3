package lab4;

import java.util.Comparator;

public class StrengthComparator implements Comparator<Beer> {
	@Override
	public int compare(Beer b1, Beer b2) {
		if(b1.getStength()<b2.getStength()) {
			return -1;
		}else if(b1.getStength()>b2.getStength()) {
			return 1;
		}else {
			return 0;
		}
	}
}
