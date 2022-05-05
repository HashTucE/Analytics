package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * read each line of strings from a file locate to INPUTFILE
 * 
 * @author Hélène
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private static String INPUTFILE = "symptoms.txt";
	
	@Override
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> readList = new ArrayList<String>();

		BufferedReader reader = null;
		if (INPUTFILE != null) {
			try {
				reader = new BufferedReader(new FileReader(INPUTFILE));
				String line = reader.readLine();

				while (line != null) {
					readList.add(line);
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
		return readList;
	}
}
