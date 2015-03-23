/**
 * 
 */
package edu.mum.mscs.fpp.homework.practise;

/**
 * @author 984417
 *
 */

class Pizza {
	
	int price = 0;
	
	Pizza(){
		System.out.println("Base Pizza ");
	}
}

class VegPizza extends Pizza {
	
	int price = 2;
	VegPizza() {
		System.out.println("Pizza -> Veg Pizza : Like Margaritta");
	}
	
}

class OlivesPizza extends VegPizza {
	int additionalPrice = price + 1;
	OlivesPizza(){
		System.out.println("Pizza -> Veg Pizza -> OlivesPizza");
	}
}


class NonVegPizza extends Pizza {
	int price =  2;
	NonVegPizza() {
		System.out.println("Pizza -> Non-Veg Pizza");
	}
}

class PouletPizza extends NonVegPizza {
	int additionalPrice = price + 2;
	PouletPizza() {
		System.out.println("Pizza -> Non-Veg Pizza -> Poulet Pizza");
	}
}


public class polymorphism {

	/**
	 * 
	 */
	public polymorphism() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
