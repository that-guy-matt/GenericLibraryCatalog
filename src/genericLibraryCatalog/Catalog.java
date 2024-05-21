package genericLibraryCatalog;

import java.util.HashMap;

public class Catalog<T> {
	private HashMap<Integer, T> items;
	
	public Catalog() {
		this.items = new HashMap<>();
	}
	
	public void addItem(int itemID, T item) {
		items.put(itemID, item);
	}
	
	public T removeItem(int itemID) {
		return items.remove(itemID);
	}
	
	public T getItem(int itemID) {
		return items.get(itemID);
	}
}
