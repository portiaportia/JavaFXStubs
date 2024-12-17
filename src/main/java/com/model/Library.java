package com.model;

public class Library {
	private Items items;
	private Users users;
	private User user;

	public Library() {
		items = Items.getInstance();
		users = Users.getInstance();
	}

	public boolean login(String username, String password) {
		return true;
	}

	// Returns true if item is found, and false otherwise
	public boolean findItem(String itemName) {
		return items.haveItem(itemName);
	}

	public boolean checkout(String itemName) {
		if (!findItem(itemName))
			return false;

		// checkout the item
		// need a user then have them checkout an item
		return true;
	}

	public boolean rateItem(String itemName, int rating) {
		if (!findItem(itemName))
			return false;

		if (rating < 0 || rating > 5)
			return false;

		return true;
	}

	public boolean payFine(int amount) {
		if (amount < 0)
			return false;

		return true; // successfully paid fine
	}
}
