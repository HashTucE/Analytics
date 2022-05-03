package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * read each line of strings from a file locate to filepath
 * 
 * @author Hélène
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	/**
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *        one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> bufferList = new ArrayList<String>();

		BufferedReader reader = null;
		if (filepath != null) {
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					bufferList.add(line);
					line = reader.readLine();
				}	
			}  
			catch (IOException e) {
				System.out.println("An error occurred." +e);
			}
			finally {
	    	reader.close();
			}
		}
		return bufferList;
	}
}
