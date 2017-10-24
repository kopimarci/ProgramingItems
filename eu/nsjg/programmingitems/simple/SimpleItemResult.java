package eu.nsjg.programmingitems.simple;

import java.util.List;

public class SimpleItemResult {

	public String getResult(List<Integer> numbers, int divider) {
		StringBuilder sb = new StringBuilder();
		for (SimpleProgrammingItem item : SimpleProgrammingItem.values()) {
			sb.append(item.getDescription());
			try {
							sb.append(item.getItem().getResult(numbers, divider));
			} catch(IllegalArgumentException e) {
				sb.append("Hiba: " + e.getMessage());
			}
			sb.append("\r\n");
			
		}
		return sb.toString();
	}
}
