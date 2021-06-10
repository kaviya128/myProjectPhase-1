package companyLockersPvtPro;

import java.io.File;
import java.io.IOException;

public class SearchingFilesPro {

	private String filePathForSearch; //declaring a private variable
	
	//Constructors 
	
	public SearchingFilesPro(){
		
	}
	
	public SearchingFilesPro(String fp){
		this.filePathForSearch = fp;
	}
	// method for searching files 
	public void searchFile(String fp){
		filePathForSearch = fp;
		
	   File f = new File(filePathForSearch); //creating object to access file class
	
	      try {
	    	  // comparing the searched file name and retrieved file name
	        
	    	  if(f.exists()&& f.getCanonicalFile().getName().equals(f.getName())){
	
                       System.out.println("File found :" + f.getName());
		
	               }
	    	  else
	                {
		                System.out.println("file does not exist");
	                }
	    	  
	           }catch(IOException e){
	        	   
		            e.printStackTrace();
	           }
	
	}
}

