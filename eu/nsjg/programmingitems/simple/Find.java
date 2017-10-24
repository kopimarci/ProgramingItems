package eu.nsjg.programmingitems.simple;

import java.util.List;

public class Find implements SimpleProgrammingItemStrategy {

	@Override
	public Integer getResult(List<Integer> numbers, int divider) {
		if(divider == 0) {
			throw new IllegalArgumentException("Nullával ne ossz ");
		}
		int i = 0;
		while( i < numbers.size() && numbers.get(i) % divider != 0) 
			i++ ;
		return i < numbers.size() ? i : -1;
	}

}
