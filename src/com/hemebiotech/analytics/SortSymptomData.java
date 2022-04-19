package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

public class SortSymptomData implements ISymptomSorter {
	
	@Override
	public Map<String, Long> sortSymptoms(Map<String, Long> finalList) throws Exception {
		
		Map<String, Long> sortList = new TreeMap<String, Long>(finalList);
		
		return sortList;
	}
}
