package homework7;

import java.util.List;
import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.GoogleServiceManagerAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		
    UserService userservice = new UserManager(new InMemoryUserDao(),new GoogleServiceManagerAdapter());
    
    
    
    userservice.register(new User("Erol","Öcalýr","erocalir@gmail.com","123456")); 
    
    userservice.register(new User("Erol","Öcalýr","erolocalir551","123456")); 
    
    
	
	User user1 = new User("Erol","Öcalýr","erocalir@gmail.com","123456");
	
	User user2 = new User("Ahmet","Öcalýr","ahmetocalir@gmail.com","123456");
	
	
	
	//userservice.login(user1); 
	userservice.login(user2); 
	//userservice.delete(user1); 
	

	
}
		
	
	}


