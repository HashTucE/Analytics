package com.hemebiotech.analytics;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CountSymptomData implements ISymptomCounter {

	@Override
	public Map<String, Long> countSymptoms(List<String> sourceList) throws Exception {
		
		
		Map<String, Long> countList = new HashMap<>();
		
		for (String symptomName : sourceList) {
		 
			if (countList.containsKey(symptomName) ) { 
		              countList.put(symptomName, countList.get(symptomName)+1);
		    } else {
			          countList.put(symptomName, 1L);
		           }			
		}		
        return countList;
    }
}
