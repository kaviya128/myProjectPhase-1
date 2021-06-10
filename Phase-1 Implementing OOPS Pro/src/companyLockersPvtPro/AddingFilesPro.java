package companyLockersPvtPro;

import java.io.File;
import java.io.IOException;

public class AddingFilesPro {

	private String fileToAdd; //declaring a private variable
	//Constructors
	public AddingFilesPro(){
		
	}
	
	public AddingFilesPro(String addF){
		this.fileToAdd = addF;
	}
	//method to add files to the folder
	public void addFiles(String addF) {
		
		fileToAdd = addF;
		
		   try {
	          File f = new File(fileToAdd);
	
	              if(f.createNewFile()){
	    	 
		             System.out.println("File added");
	
		             File files = new File("C:\\LockersFiles");
	
		             File[] flist = files.listFiles();
	
		                for (int i = 0; i < flist.length; i++) {
			
                            System.out.println("File Name: " +flist[i]);
                        	}
		
	                  }
	     
	            }catch(IOException e){
		             e.printStackTrace();
	            }
		
	}
	
}
