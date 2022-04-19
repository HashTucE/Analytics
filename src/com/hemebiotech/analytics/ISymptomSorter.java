/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Anything that will sort a list of symptoms by alphabetical order
 *
 */
public interface ISymptomSorter {
	/**
	 * 
	 * @param a Map of String and Long named finalList
	 * @return a TreeMap with a natural sorting
	 */
	Map<String, Long> sortSymptoms(Map<String, Long> finalList) throws Exception;
}
