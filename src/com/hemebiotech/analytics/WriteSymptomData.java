package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

public class WriteSymptomData implements ISymptomWriter {
	

	@Override
	public void writeSymptoms(Map<String, Long> finalList) throws Exception {
		
	    try {	      
	      FileWriter myWriter = new FileWriter("results.txt");	      
	      for (Entry<String, Long> writeLine : finalList.entrySet()) {
				myWriter.write(writeLine.getKey() + ": " + writeLine.getValue() + "\n");
		}	     
	      myWriter.close();
	    } 
	    catch (IOException e) {
	      System.out.println("An error occurred." +e);
	    }
	}

}
