package LockedMe.com;

public class LockedMeMain {

	public static void main(String[] args) {
		
		// Create Main Folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Goutham");
		
		HandleOptions.handleWelcomeScreenInput();
	}

	
}
