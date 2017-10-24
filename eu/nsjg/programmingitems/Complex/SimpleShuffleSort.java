package eu.nsjg.programmingitems.Complex;

import java.util.Arrays;
import java.util.List;

public class SimpleShuffleSort extends ComplexProgramingItemStrategy {

	public SimpleShuffleSort(List<Integer> numbers) {
		super(numbers);

	}

	@Override
	public List<Integer> sort() {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (greater(i, j)) {
					swap(i, j);
				}
			}
		}
		return Arrays.asList(numbers);
	}

}
