package com.hemebiotech.analytics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * count occurrences using a hashmap inside a loop,
 * this specific class avoid symptoms duplication
 * 
 * @author jeremyb59@wanadoo.fr
 */
public class AnalyticsCounter implements ISymptomCounter {
	
	@Override
	public Map<String, Long> countSymptoms(List<String> readList) throws Exception {
		
		
		Map<String, Long> countList = new HashMap<>();
		
		for (String symptomName : readList) {
		 
			if (countList.containsKey(symptomName) ) { 
		              countList.put(symptomName, countList.get(symptomName)+1);
		    } else {
			          countList.put(symptomName, 1L);
		           }			
		}
        return countList;
    }
}
