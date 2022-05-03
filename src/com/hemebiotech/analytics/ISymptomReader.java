package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

/**
 * anything that will read symptom data from a source The important part is, the
 * return value from the operation, which is a list of strings, that may contain
 * many duplications
 * 
 * the implementation does not need to order the list
 */
public interface ISymptomReader {
	/**
	 * if no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates
	 *         are possible/probable
	 * @throws IOException 
	 */
	List<String> getSymptoms() throws IOException;
}
