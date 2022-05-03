/**
 * 
 */
package com.hemebiotech.analytics;

import java.util.Map;

/**
 * anything that will generate a text file
 */
public interface ISymptomWriter {
	/**
	 * @param an alphabetical ordered listing of each symptoms with their occurrences
	 */
	void writeSymptoms(Map<String, Long> sortedList) throws Exception;
}
