package genericLibraryCatalog;

import com.genericlib.*;
import textio.TextIO;

/**
 * This class represents a simple library application for managing library items.
 * Users can add, remove, and view library items via a command-line interface.
 */
public class LibraryApp {

	public static void main(String[] args) {
		Catalog<LibraryItem> catalog = new Catalog<>();
		
		while (true) {
			System.out.println("Menu");
			System.out.println("1. Add Library Item");
            System.out.println("2. Remove Library Item");
            System.out.println("3. View Catalog");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = TextIO.getInt();
            
            switch (choice) {
	            case 1:
	            	TextIO.getln(); // not having this line breaks the program... not sure why
	            	System.out.print("Enter title: ");
	            	String title = TextIO.getln();
	            	System.out.print("\nEnter author: ");
	            	String author = TextIO.getln();
	            	System.out.print("\nEnter a numeric item ID: ");
	            	int itemID = TextIO.getInt();
	            	LibraryItem newItem = new LibraryItem(title, author, itemID);
	            	catalog.addItem(newItem);
	            	System.out.println("\nItem added successfully");
	            	break;
	            	
	            case 2:
	            	System.out.print("Enter item ID to remove: ");
	            	int idToRemove = TextIO.getInt();
	            	if (catalog.removeItem(idToRemove)) {
	            		System.out.println("Item removed successfully.");
	            	} else {
	            		System.out.println("Item not found.");
	            	}
	            	break;
	            	
	            case 3:
	            	catalog.displayCatalog();
	            	break;
	            	
	            case 4:
	            	System.out.println("Exiting...");
	            	System.exit(0);
	            	
	            default:
	            	System.out.println("Invalid choice. Please enter one of the menu item numbers.");
            }
		}
	}
}
