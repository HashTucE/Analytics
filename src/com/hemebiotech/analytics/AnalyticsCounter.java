package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	
	public void start() throws Exception {
		
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> sourceList = reader.getSymptoms();
		
		ISymptomCounter counter = new CountSymptomData();
		Map<String, Long> countList = counter.countSymptoms(sourceList);
		
		ISymptomSorter sorter = new SortSymptomData();
		Map<String, Long> sortList = sorter.sortSymptoms(countList);
		
		ISymptomWriter writer = new WriteSymptomData();
		writer.writeSymptoms(sortList);
	}
}
