package eu.nsjg.programmingitems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import eu.nsjg.programmingitems.Complex.ComplexProgramingItemStrategy;
import eu.nsjg.programmingitems.Complex.SimpleShuffleSort;
import eu.nsjg.programmingitems.Generate.ListPopulate;
import eu.nsjg.programmingitems.simple.Calculate;
import eu.nsjg.programmingitems.simple.Decide;
import eu.nsjg.programmingitems.simple.SimpleItemResult;
import eu.nsjg.programmingitems.simple.SimpleProgrammingItemStrategy;

public class App {

	private final List<Integer> numbers;
	private final SimpleItemResult item;

	public App() {
		ListPopulate list = new ListPopulate(new Random());
		numbers = list.getNumbers(100, 1, 100);
		item = new SimpleItemResult();
	}

	public static void main(String[] args) {
		App app = new App();
		app.print();
	}

	private void print() {
		System.out.println("A lista jelenleg" + numbers.size() + "elemû.");
		System.out.println("A lista tartalma:" + numbers);
		System.out.println(item.getResult(numbers, 0));
		System.out.println("----------------");
		ComplexProgramingItemStrategy comlpex = new SimpleShuffleSort(numbers);
		System.out.println("A lista tartalma:" + numbers);
		System.out.println("A lista rendezve:" + comlpex.sort() );

	}
	
}
