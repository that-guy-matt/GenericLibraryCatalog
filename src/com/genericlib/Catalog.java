package com.genericlib;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends LibraryItem> {
	private List<T> items;
	
	public Catalog() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public boolean removeItem(int itemID) {
		for (T item : items) {
			if (item.getItemID() == itemID) {
				items.remove(item);
				return true;
			} 
		}
		return false;
	}
	
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
