/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.Map;

/**
 *Anything that will generate a text file including a list of symptoms
 *
 */
public interface ISymptomWriter {
	/**
	 * @param a Map of String
	 * Write on a text file each entry from a TreeMap named finalList
	 * 
	 * 
	 */
	void writeSymptoms(Map<String, Long> finalList) throws Exception;
}
