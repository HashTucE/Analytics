package com.hemebiotech.analytics;

import java.util.Map;

/**
 * anything that will sort a list of symptoms by alphabetical order
 */
public interface ISymptomSorter {
	/**
	 * @param an unordered listing of each symptoms with their occurrences
	 * @return an alphabetical ordered listing of each symptoms with their occurrences
	 */
	Map<String, Integer> sortSymptoms(Map<String, Integer> countedList) throws Exception;
}
