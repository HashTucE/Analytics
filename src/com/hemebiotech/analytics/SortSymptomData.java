package com.hemebiotech.analytics;

import java.util.Map;
import java.util.TreeMap;

/**
 * sort the symptoms keys of a map by alphabetical order using a treemap class 
 * 
 * @author jeremyb59@wanadoo.fr
 */
public class SortSymptomData implements ISymptomSorter {
	
	@Override
	public Map<String, Long> sortSymptoms(Map<String, Long> countedList) throws Exception {
		
		Map<String, Long> sortList = new TreeMap<String, Long>(countedList);
		
		return sortList;
	}
}
