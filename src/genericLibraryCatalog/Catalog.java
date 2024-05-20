package genericLibraryCatalog;

import java.util.HashMap;

public class Catalog<T> {
	private HashMap<Integer, T> items;
	
	public Catalog() {
		this.items = new HashMap<>();
	}
}
