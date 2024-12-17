package com.model;

import java.util.ArrayList;

public class Users {
	private static Users users;
	private ArrayList<User> userList;
	
	private Users() {
		userList = Database.getUsers();
	}
	
	public static Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}

	public boolean haveUser(String userName) {
		return true;
	}
	
	public User getUser(String userName) {
		if(!haveUser(userName)) return null;
		
		return new User(userName, "amy", "smith");
	}
}
