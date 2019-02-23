/*
 *@Author: Chad Snyder
 *@Date:   02/21/2018
 * Class:  CSE360
 * ID:     553
 */

package cse360assign2;

public class Calculator {

	private int total;
	
	public Calculator () {

	}
	
	/*
	 * getTotal shall return the current total
	 * 
	 */
	
	public int getTotal () {
		
		return total;
	}
	
	/* @param value
	 * The add method shall add the
	 * parameter to the total variable
	 */
	public void add (int value) {
		total=value+total;

	}
	
	/* @param value
	 * The subtract method shall subtract
	 * the parameter to the total variable
	 */
	public void subtract (int value) {
		total=total-value;
	}
	
	/* @param value
	 * The multiply method shall multiply the
	 * total by the parameter
	 */
	public void multiply (int value) {
		total=total*value;
	}
	
	/* @param value
	 * The divide method shall divide the
	 * total by the parameter. If paramater
	 * is zero then set total to zero.
	 */
	public void divide (int value) {
			if (value !=0 ){
				total=total/value;
			}
			else {
				total=0;
			}
	}
	
	/* 
	 * @param
	 * @return string
	 * 
	 */
	public String getHistory () {
		return "";
	}
}