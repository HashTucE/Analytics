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
	public Map<String, Integer> sortSymptoms(Map<String, Integer> countList) throws Exception {
		
		Map<String, Integer> sortList = new TreeMap<String, Integer>(countList);
		
		return sortList;
	}
}
