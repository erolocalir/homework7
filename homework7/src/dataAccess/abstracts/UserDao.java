package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	void add(User user);
    void delete(User user);
    void update(User user);
    User getEmail(String email);
    User getEmailAndPassword(String email,String password);
    List<User> getAll();
    

}
