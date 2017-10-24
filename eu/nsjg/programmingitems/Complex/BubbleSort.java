package eu.nsjg.programmingitems.Complex;

import java.util.Arrays;
import java.util.List;

public class BubbleSort extends ComplexProgramingItemStrategy {

	public BubbleSort(List<Integer> numbers) {
		super(numbers);

	}

	@Override
	public List<Integer> sort() {
		for (int i = numbers.length; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (greater(i, j + 1)) {
					swap(i, j + 1);
				}
			}
		}
		return Arrays.asList(numbers);
	}

}
