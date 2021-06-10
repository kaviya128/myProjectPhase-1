package companyLockersPvtPro;

import java.io.File;
import java.io.IOException;

public class CreateFilesPro {
	public static void main(String[] args){
		File files = new File("C:\\LockersFiles"); //creating a directory
	
		
	boolean dir = files.mkdir();
	
	if(dir){
		System.out.println("Directory created successfully");
		
	}
	else 
	{
		System.out.println("Directory cannot be created");
	}
	    
	
	try {
		File filesList = new File("C:\\LockersFiles\\FirstFile.txt"); //creating files in directory
		
		if(filesList.createNewFile()){
			System.out.println("File created :" + filesList.getName());//getting the created file name
			System.out.println("File path:" +  filesList.getAbsolutePath());//getting the file path
			
			
		} else {
			System.out.println("File already exists");
			}
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	}
}



