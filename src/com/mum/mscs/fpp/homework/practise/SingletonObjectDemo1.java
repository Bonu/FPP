package com.mum.mscs.fpp.homework.practise;


class SingletonClass {
	// static SingletonClass singletonObject;
	private static SingletonClass singletonObject;
	String key;
	/** A private Constructor prevents any other class from instantiating. */
	
	 private SingletonClass() {
		System.out.println("Key is generated for you successfully");
		key = "K135J89L35";
	}
	public static SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}
	
	public void getKey(){ 
    	System.out.println("Your key to activate Avast anti virus is:"+key);   
    	}
		
	public Object clone()throws CloneNotSupportedException
	{
	    throw new CloneNotSupportedException(); 
	}	
}
public class SingletonObjectDemo1 {

		public static void main(String[] args) {
//		SingletonClass obj = new SingletonClass(); //Compilation error
	    SingletonClass obj = SingletonClass.getSingletonObject();
	    obj.getKey();
	    try {
			SingletonClass cloneObj = (SingletonClass)obj.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.err.println("Singleton object clone is restricted");
			e.printStackTrace();
		}
	}
}
