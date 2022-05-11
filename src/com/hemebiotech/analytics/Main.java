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

		ISymptomReader reader = new ReadSymptomDataFromFile();
		List<String> readList = reader.getSymptoms();
		
		ISymptomCounter counter = new AnalyticsCounter();
		Map<String, Integer> countList = counter.countSymptoms(readList);
		
		ISymptomSorter sorter = new SortSymptomData();
		Map<String, Integer> sortList = sorter.sortSymptoms(countList);
		
		ISymptomWriter writer = new WriteSymptomData();
		writer.writeSymptoms(sortList);

	}

}
