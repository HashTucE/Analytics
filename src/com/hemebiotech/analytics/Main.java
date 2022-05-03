package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * entry point of the application reminding the four different methods
 * the important part is that interfaces are used as type rather than implementation
 * 
 * @author jeremyb59@wanadoo.fr
 */
public class Main {
	/**
	 * @param args
	 * @throws exception
	 */
	public static void main(String[] args) throws Exception {

		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> bufferedList = reader.getSymptoms();
		
		ISymptomCounter counter = new AnalyticsCounter();
		Map<String, Long> countedList = counter.countSymptoms(bufferedList);
		
		ISymptomSorter sorter = new SortSymptomData();
		Map<String, Long> sortedList = sorter.sortSymptoms(countedList);
		
		ISymptomWriter writer = new WriteSymptomData();
		writer.writeSymptoms(sortedList);

	}

}
