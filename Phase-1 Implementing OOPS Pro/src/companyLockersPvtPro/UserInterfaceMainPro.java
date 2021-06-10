package companyLockersPvtPro;

import java.util.Scanner;



public class UserInterfaceMainPro {
	public static void main(String[] args) {
		String pathName; //creating variable to store the user input
		//creating objects to access methods 
		SortingFilesPro sorting = new SortingFilesPro();
		AddingFilesPro add = new AddingFilesPro();
		DeletingFilesPro cleanUp = new DeletingFilesPro();
		SearchingFilesPro search = new SearchingFilesPro();
		Scanner userInp = new Scanner(System.in); //creating scanner object
		boolean moreAction = true; //check whether more action to perform
		System.out.println("Lockers Private Application \n Verson 1.0"); //Application name
		System.out.println("Developer : Kaviya Natarajan"); //Developer details
		// To perform the continued actions until main Exit
		 while (moreAction) {
		System.out.println("Choose the main action :"+"\n 1.Main Menu \n 2.Main Exit"); 
		String mainAction = userInp.nextLine();
		
		 
		if(mainAction.equalsIgnoreCase("Main Menu")) // if main menu is selected perform the following actions
				  { 
		               System.out.println("Main Menu :");
			           System.out.println("Choose the action :" + "\n 1.Sort \n 2.Add \n 3.Search \n 4.Delete \n 5.Exit");
			           String action = userInp.nextLine();
			     
               //to switch over the actions
			      switch (action) {

			            case "Sort":
				            System.out.println("Sorted files are :");
                            sorting.sortingFiles();
				            break;
				
			            case "Add":
				            System.out.println("Enter the file path :");
				            pathName= userInp.nextLine();
				            System.out.println("you entered :" + pathName);
				            add.addFiles(pathName);
				            break;

			            case "Search":
				            System.out.println("Enter the file path :");
				            pathName = userInp.nextLine();
				            System.out.println("you entered :" + pathName);
				            search.searchFile(pathName);
				            break;

			            case "Delete":
				            System.out.println("Enter the file path :");
				            pathName = userInp.nextLine();
				            System.out.println("you entered :" + pathName);
				            cleanUp.deletePath(pathName);
				            break;

			            case "Exit":
				            System.out.println("Exit to Main Menu");
				            break;
				        
			            default:
				             System.out.println("Invalid input");

			           }
			   }
				  
			   else if(mainAction.equalsIgnoreCase("Main Exit")) // if main exit perform this
			   {
			      System.out.println("Program Ended");
			      moreAction = false;
			   }
			   else {
				   System.out.println("Invalid Action"); //invalid use input
			   }
		 }
		    
		userInp.close(); //close the input
	}

}
