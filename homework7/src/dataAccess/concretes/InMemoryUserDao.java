package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
	List<User> users = new ArrayList<User>(); 

	@Override
	public void add(User user) {
		
		System.out.println("Google ile uye olundu: " + user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		
		users.removeIf(obj->obj.getFirstName() == user.getFirstName());
		System.out.println("Kullanici silindi: " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		
		System.out.println("Kullanici guncellendi: " + user.getFirstName());
		
	}

	@Override
	public User getEmail(String email) {
		
		for(User user : users) {
			if(user.getEmail() == email)
				return user;
		}
		return null;
		
	
	}

	@Override
	public User getEmailAndPassword(String email, String password) {
		
		
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
		
		
	}

}































