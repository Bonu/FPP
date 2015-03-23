/**
 * 4. Recursive Addition
 */
package edu.mum.mscs.fpp.homework.w1d5;

/**
 * Add the items in an array recursively.
 * 
 * Output:
 * 
 *  Item :3 Index:0  Result3
	Item :5 Index:1  Result8
	Item :14 Index:2  Result22
	Item :15 Index:3  Result37
	Item :35 Index:4  Result72
	Item :80 Index:5  Result152
	Item :91 Index:6  Result243
	Item :99 Index:7  Result342
	342
	Item :1 Index:0  Result1
	Item :2 Index:1  Result3
	Item :3 Index:2  Result6
	Item :4 Index:3  Result10
	Item :5 Index:4  Result15
	15


 * @author janardhanbonu
 *
 */
public class RecursiveAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] items = {3,5,14,15,35,80,91,99};
		RecursiveAddition ra = new RecursiveAddition();
		System.out.println(ra.addItems(items, items.length-1));
		int[] items2 = {1,2,3,4,5};
		System.out.println(ra.addItems(items2, items2.length-1));

	}
	
	public int addItems(int[] items, int index){
		if(index >= 0){
			int result =  items[index] + addItems(items, index-1);
			System.out.println("Item :"+items[index]+" Index:"+index +"  Result"+result);
			return result;
		}
		return 0;
	}

}
