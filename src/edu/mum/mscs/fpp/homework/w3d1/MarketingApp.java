/**
 * Marketing.java
 */
package edu.mum.mscs.fpp.homework.w3d1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 1.Create a class called Marketing with fields of employeename, productname, and 
 * salesamount. Create an Arraylist for the class Marketing. 
 * Implement the following methods in the main class.
	a.	add() // adding objects to the Marketing
	b.	remove() // delete objects from Marketing 
	c.	set() // Modify some objects using set() method
	d.	sort according to the employeename and salesamount using comparable interface
	e.	Implement Iterator to display the information of ArrayList.

 * 
 * Output:
 * 
 *  -----Add ---------
	-->Marketing [employeename=Dia Mirza, productname=TV, salesamount=6500.0]
	-->Marketing [employeename=Sachin, productname=Ferrai , salesamount=1200000.0]
	-->Marketing [employeename=Bill Gates, productname=windows 10, salesamount=3000000.0]
	-->Marketing [employeename=Tim cock, productname=Appe Watch, salesamount=17000.0]
	--------- Set ---------
	-->Marketing [employeename=Dia Mirza, productname=Mercedes, salesamount=800000.0]
	-->Marketing [employeename=Sachin, productname=Ferrai , salesamount=1200000.0]
	-->Marketing [employeename=Bill Gates, productname=windows 10, salesamount=3000000.0]
	-->Marketing [employeename=Tim cock, productname=Appe Watch, salesamount=17000.0]
	--------- Remove ---------
	-->Marketing [employeename=Dia Mirza, productname=Mercedes, salesamount=800000.0]
	-->Marketing [employeename=Sachin, productname=Ferrai , salesamount=1200000.0]
	-->Marketing [employeename=Bill Gates, productname=windows 10, salesamount=3000000.0]
	-->Marketing [employeename=Tim cock, productname=Appe Watch, salesamount=17000.0]
	---------SortEmpName---------
	-->Marketing [employeename=Bill Gates, productname=windows 10, salesamount=3000000.0]
	-->Marketing [employeename=Dia Mirza, productname=Mercedes, salesamount=800000.0]
	-->Marketing [employeename=Sachin, productname=Ferrai , salesamount=1200000.0]
	-->Marketing [employeename=Tim cock, productname=Appe Watch, salesamount=17000.0]
	---------SortSalesAmt---------
	-->Marketing [employeename=Tim cock, productname=Appe Watch, salesamount=17000.0]
	-->Marketing [employeename=Dia Mirza, productname=Mercedes, salesamount=800000.0]
	-->Marketing [employeename=Sachin, productname=Ferrai , salesamount=1200000.0]
	-->Marketing [employeename=Bill Gates, productname=windows 10, salesamount=3000000.0]

 * 
 * @author janardhanbonu
 *
 */
public class MarketingApp {
	public static void main(String[] args) {

		MarketingApp mktApp = new MarketingApp();
		List<Marketing> marketing = new ArrayList<Marketing>();
		Marketing m1 = new Marketing("Dia Mirza","TV",6500);
		Marketing m2 = new Marketing("Sachin","Ferrai ",1200000);
		Marketing m3 = new Marketing("Bill Gates","windows 10",3000000);
		Marketing m4 = new Marketing("Tim cock","Appe Watch",17000);
		Marketing m5 = new Marketing("Dia Mirza","Mercedes",800000);
		System.out.println("-----Add ---------");
		marketing.add(m1);
		marketing.add(m2);
		marketing.add(m3);
		marketing.add(m4);
		mktApp.itrMarketing(marketing);
		System.out.println("--------- Set ---------");
		marketing.set(0, m5);
		mktApp.itrMarketing(marketing);
		System.out.println("--------- Remove ---------");
		marketing.remove(m1);
		mktApp.itrMarketing(marketing);
		System.out.println("---------SortEmpName---------");
		Collections.sort(marketing, new SortEmpName());
		mktApp.itrMarketing(marketing);
		System.out.println("---------SortSalesAmt---------");
		Collections.sort(marketing, new SortSalesAmt());
		
		mktApp.itrMarketing(marketing);
		
	}
	
	public void itrMarketing(List mkt){
		for (Iterator iterator = mkt.iterator(); iterator.hasNext();) {
			Marketing marketing2 = (Marketing) iterator.next();
			System.out.printf("-->%s\n",marketing2.toString());
		}
	}
}

/**
 * d.	sort according to the employeename and salesamount using comparable interface
 */
class SortEmpName implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		return o1.getEmployeename().compareTo(o2.getEmployeename());
	}
	
}

class SortSalesAmt implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		if(o1.getSalesamount() > o2.getSalesamount())
			return 1;
		else if(o1.getSalesamount() < o2.getSalesamount())
			return -1;
		else 
			return 0;
	}

	
}

class Marketing {

	private String employeename; 
	private String productname;
	private float salesamount;

	public Marketing(String employeename, String productname, float salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public float getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(float salesamount) {
		this.salesamount = salesamount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeename == null) ? 0 : employeename.hashCode());
		result = prime * result
				+ ((productname == null) ? 0 : productname.hashCode());
		result = prime * result + Float.floatToIntBits(salesamount);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marketing other = (Marketing) obj;
		if (employeename == null) {
			if (other.employeename != null)
				return false;
		} else if (!employeename.equals(other.employeename))
			return false;
		if (productname == null) {
			if (other.productname != null)
				return false;
		} else if (!productname.equals(other.productname))
			return false;
		if (Float.floatToIntBits(salesamount) != Float
				.floatToIntBits(other.salesamount))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Marketing [employeename=" + employeename + ", productname="
				+ productname + ", salesamount=" + salesamount + "]";
	}
	
	

}