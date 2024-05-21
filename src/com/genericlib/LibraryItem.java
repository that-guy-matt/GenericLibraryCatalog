package com.genericlib;

public class LibraryItem<T> {
	private String title;
	private String author;
	private int itemID;
	
	/**
	 * The LibraryItem class represents a generic library item with attributes such as title, author, and item ID.
	 *
	 * @param <T> The type parameter for the library item.
	 */
	public LibraryItem(String title, String author, int itemID) {
		this.title = title;
		this.author = author;
		this.itemID = itemID;
	}
	
	/**
     * Retrieves the item ID of the library item.
     *
     * @return The item ID of the library item.
     */
	public int getItemID() {
		return itemID;
	}
	
	/**
     * Returns a string representation of the LibraryItem object.
     *
     * @return A string containing the title, author, and item ID of the library item.
     */
	@Override
    public String toString() {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", itemID=" + itemID +
                '}';
    }
}
