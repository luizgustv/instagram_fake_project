package com.spring.instagram.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class InstagramUtil {
	
	/*public byte[] encoder(String filePath) {
		
	    File file = new File(filePath);
	    
	    byte fileData[] = null;
	    
	    try (FileInputStream fileInFile = new FileInputStream(file)) {
	      // Reading a Image file from file system
	    	fileData = new byte[(int) file.length()];

	    	fileInFile.read(fileData);
	      
	    } catch (FileNotFoundException e) {
	      System.out.println("File not found" + e);
	    } catch (IOException ioe) {
	      System.out.println("Exception while reading the file " + ioe);
	    }
	    return fileData;
	  }
	
	
	  public void decoder(byte[] fileByteArray, String pathFile) {
		  
		  FileOutputStream fileOutFile = null;
		  
		  try{
			  
			  fileOutFile = new FileOutputStream(pathFile);
			  fileOutFile.write(fileByteArray);
			  
		    } catch (FileNotFoundException e) {
		      System.out.println("Image not found" + e);
		    } catch (IOException ioe) {
		      System.out.println("Exception while reading the Image " + ioe);
		    }finally {
		    	if(fileOutFile != null) {
		    		try {
						fileOutFile.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
		    	}
		    }
	}*/

}
