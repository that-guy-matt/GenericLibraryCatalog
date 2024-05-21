package com.genericlib;

import java.util.ArrayList;
import java.util.List;

/**
 * The Catalog class represents a generic catalog that can store and manage
 * items of type T, where T extends LibraryItem.
 * 
 * @param <T> The type of items to be stored in the catalog.
 */
public class Catalog<T extends LibraryItem> {
	private List<T> items;
	
	public Catalog() {
		this.items = new ArrayList<>();
	}
	
	/**
     * Adds the specified item to the catalog.
     * 
     * @param item The item to be added to the catalog.
     */
	public void addItem(T item) {
		items.add(item);
	}
	
	/**
     * Removes the item with the specified item ID from the catalog, if it exists.
     * 
     * @param itemID The ID of the item to be removed.
     * @return true if the item was successfully removed, false otherwise.
     */
	public boolean removeItem(int itemID) {
		for (T item : items) {
			if (item.getItemID() == itemID) {
				items.remove(item);
				return true;
			} 
		}
		return false;
	}
	
	/**
     * Displays the items currently stored in the catalog.
     */
	public void displayCatalog() {
		if (items.isEmpty()) {
			System.out.println("Catalog is empty");
		} else {
			System.out.println("Catalog:");
			for (T item : items) {
				System.out.println(item);
			}
		}
	}
}
