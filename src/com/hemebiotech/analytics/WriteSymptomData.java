package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

/**
 * generate a text file from a map using an entryset
 * 
 * @author jeremyb59@wanadoo.fr
 */
public class WriteSymptomData implements ISymptomWriter {
	
	private static String OUTPUTFILE = "results.out";

	@Override
	public void writeSymptoms(Map<String, Long> sortList) throws Exception {
		
		
		FileWriter myWriter = null;
	    try {
	        myWriter = new FileWriter(OUTPUTFILE);
	        for (Entry<String, Long> writeLine : sortList.entrySet()) {
				 myWriter.write(writeLine.getKey() + ": " + writeLine.getValue() + "\n");
	        }	          
	    } 
	    catch (IOException e) {
	      System.out.println("An error occurred." +e);
	    }
	    finally {
	    	myWriter.close();
		}
	}

}
