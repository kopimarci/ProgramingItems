package eu.nsjg.programmingitems.simple;

import java.util.List;

public interface SimpleProgrammingItemStrategy {

	Object getResult(List<Integer> numbers, int divider);

	default Object getResult(List<Integer> numbers) {

		return getResult(numbers, 0);
	}
}
