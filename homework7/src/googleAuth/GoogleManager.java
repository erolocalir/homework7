package googleAuth;

import entities.concretes.User;

public class GoogleManager {
	
	
	public void logInWithGoogleAccount(String message) {
		System.out.println("Google ile giris yaptın: " + message);
	}
	public void register(User user){ 
        System.out.println("Kullanıcı Google yardımıyla eklendi: " + user.getFirstName() + " " + user.getLastName().toUpperCase());
    } 

	
}
