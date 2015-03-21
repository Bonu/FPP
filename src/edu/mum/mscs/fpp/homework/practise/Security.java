/**
 * Security.java
 * 
 *     Topics discussed
 	Immutable Classes
 	Private constructors and singleton classes
 */


package edu.mum.mscs.fpp.homework.practise;

/**
 * @author janardhanbonu
 *
 */
public class Security {

	public static void main(String[] args) {
		
		AuthorizationManager am  = AuthorizationManager.createAuthorizationManager();
		Citizen c1 = new Citizen("XYZ12345");
		am.authorize(c1.SSN);
		
		AuthorizationManager am1  = AuthorizationManager.createAuthorizationManager();
		Citizen c2 = new Citizen("ABC67890");
		am1.authorize(c2.SSN);
		
	}

}

final class AuthorizationManager {
	
	private  final String authCode = "ABC";
	
	private static AuthorizationManager authorizationManager;
	
	private AuthorizationManager(){
		
	}
	
	public static AuthorizationManager createAuthorizationManager() {
		if(authorizationManager == null) {
			authorizationManager = new AuthorizationManager();
		}
		return authorizationManager;
	}
	
	public String authorize(String ssn) {
		if(ssn.startsWith(authCode)){
			System.out.printf("%s Authorized\n",ssn);
			return "Authorised";
		} else {
			System.out.printf("%s Not Authorized\n",ssn);
			return "Not Authorised";
		}
		
	}
	
}


class Citizen {
	final String SSN;
	
	public Citizen(String SSN){
		this.SSN = SSN;
	}
	
	public String getSSN(){
		return SSN;
	}
}
