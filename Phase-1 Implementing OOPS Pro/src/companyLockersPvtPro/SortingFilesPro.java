package companyLockersPvtPro;

import java.io.File;
import java.util.Arrays;

public class SortingFilesPro {
	
	  public void sortingFiles(){
			// Building array of files
		    File directory = new File("C:\\LockersFiles");
		    File[] listOfFiles = directory.listFiles();

		  // Iterating array of files for printing list of all files present in the directory.
		    for (int i = 0; i < listOfFiles.length; i++) {
		        System.out.println("File Name: " +listOfFiles[i]);
		    }
		    //sorting files
		    Arrays.sort(listOfFiles);
		    for(File file : listOfFiles){
		        System.out.println("Sorted files :" + file.getName());
		    }
		}

	}



