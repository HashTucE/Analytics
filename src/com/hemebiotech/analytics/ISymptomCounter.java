package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * anything that will count occurrences from a list without duplication
 * 
 * the implementation does not need to order the list
 */
public interface ISymptomCounter {
	/**
	 * @param a raw listing of all Symptoms obtained from a data source
	 * @return an unordered listing of each Symptoms with their occurrences 
	 */
	Map<String, Integer> countSymptoms(List<String> readList) throws Exception;
}
