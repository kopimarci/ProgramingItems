package eu.nsjg.programmingitems.simple;

import java.util.List;

public class Count implements SimpleProgrammingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0) {
			throw new IllegalArgumentException("Nullával ne ossz ");
		}
		int i = 0;
		int count = 0;
		for (Integer Value : numbers) {
			if (Value % divider == 0) {
				count++;
			}
		}
		return count;
	}

}
