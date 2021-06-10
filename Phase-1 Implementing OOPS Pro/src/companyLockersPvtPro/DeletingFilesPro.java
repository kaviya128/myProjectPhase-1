package companyLockersPvtPro;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeletingFilesPro {
	
		private String filePath; //Declaring a private variable
		
		public DeletingFilesPro() //Constructor
		{
			
			}
		
		public DeletingFilesPro(String p) //Constructor with parameter
		{
			this.filePath = p;
		}
		
		// method to delete files 
		public void deletePath(String p){
			filePath = p;
			
			try {
				Path pathOfFile = Paths.get(filePath); //creating object for Path to get file path
				boolean actiond = Files.deleteIfExists(pathOfFile);
				  if(actiond){
					System.out.println("file deleted");
				   }
				  else {
					System.out.println("file cannot be found");
					
				    }
				
			} catch(IOException e){
				e.printStackTrace();
			} 
			
			}
		
		
	}


