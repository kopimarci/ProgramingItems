package eu.nsjg.programmingitems.simple;

public enum SimpleProgrammingItem {

CALCULATE("Sorozat számítás: ", new Calculate()),
DECIDE("Eldöntés: ", new Decide()),
SELECT("Kiválasztás: ", new Select()),
FIND("Keresés: ", new Find()),
COUNT("Megszámolás: ", new Count()),
MAX_VALUE("Maximum érték: ", new MaxValue());
	
	private final String description;
	private final SimpleProgrammingItemStrategy item;
	
	private SimpleProgrammingItem(String description, SimpleProgrammingItemStrategy item) {
		this.description = description;
		this.item = item;
	}

	public String getDescription() {
		return description;
	}

	public SimpleProgrammingItemStrategy getItem() {
		return item;
	} 
	
}
