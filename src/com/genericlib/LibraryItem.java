package com.genericlib;

public class LibraryItem<T> {
	private String title;
	private String author;
	private int itemID;
	
	public LibraryItem(String title, String author, int itemID) {
		this.title = title;
		this.author = author;
		this.itemID = itemID;
	}
	
	public int getItemID() {
		return itemID;
	}
}
