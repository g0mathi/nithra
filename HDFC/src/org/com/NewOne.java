package org.com;

public class NewOne {
	public static void main(String[] args) {
		NetBanking v= new NetBanking();
		v.setUserId("vicky");
		v.setPassword(1234);
		
		String userId = v.getUserId();
		System.out.println(userId);
		
		int password = v.getPassword();
		System.out.println(password);
		
		v.setPassword(5679);
		v.setUserId("Raju");
		
		String userID2= v.getUserId();
		
		System.out.println(userID2);
		
		int password2= v.getPassword();
		System.out.println(password2);
		
		
		
		
		
		
			
	}

}
