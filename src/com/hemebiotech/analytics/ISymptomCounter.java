/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Anything that will count occurrences from a list of symptoms without 
 * duplication
 * 
 *
 */
public interface ISymptomCounter {
	/**
	 * 
	 * @param a list of String named sourceList
	 * @return a map listing of keys (symptoms) and values (occurrences) 
	 * 
	 */
	Map<String, Long> countSymptoms(List<String> sourceList) throws Exception;
}
