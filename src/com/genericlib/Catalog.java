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
	
	public void removeItem(int itemID) {
		for (T item : items) {
			if (item.getItemID() == itemID) {
				items.remove(item);
				System.out.println("Item removed.");
			}
		}
	}
}
