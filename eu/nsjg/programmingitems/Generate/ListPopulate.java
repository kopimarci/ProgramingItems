package eu.nsjg.programmingitems.Generate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListPopulate {

	private final Random random;

	public ListPopulate(Random random) {
		this.random = random;
	}

	public List<Integer> getNumbers() {
		return getNumbers(100, 0, 100);
	}

	public List<Integer> getNumbers(final int count) {
		return getNumbers(count, 0, 100);
	}

	public List<Integer> getNumbers(final int count, final int hi) {
		return getNumbers(count, 0, hi);
	}

	public List<Integer> getNumbers(final int count, final int lo, final int hi) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < count; i++) {
			numbers.add(random.nextInt(hi - lo) + lo);
		}
		return numbers;
	}
}
