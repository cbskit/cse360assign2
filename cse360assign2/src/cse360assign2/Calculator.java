/*
 *@Author: Chad Snyder
 *@Date:   02/21/2019
 * Class:  CSE360
 * ID:     553
 */

package cse360assign2;

public class Calculator {

	private int total;
	private StringBuffer getHistory;
	
	public Calculator () {
		// initialize buffer and set initial content to 0 for first
		// return value of history.
		getHistory = new StringBuffer("0");
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
		getHistory.append(" + "+value);
	}
	
	/* @param value
	 * The subtract method shall subtract
	 * the parameter to the total variable
	 */
	public void subtract (int value) {
		total=total-value;
		getHistory.append(" - "+value);
	}
	
	/* @param value
	 * The multiply method shall multiply the
	 * total by the parameter
	 */
	public void multiply (int value) {
		total=total*value;
		getHistory.append(" * "+value);
	}
	
	/* @param value
	 * The divide method shall divide the
	 * total by the parameter. If paramater
	 * is zero then set total to zero.
	 */
	public void divide (int value) {
			if (value !=0 ){
				total=total/value;
				getHistory.append(" / "+value);
			}
			else {
				total=0;
			}
	}
	
	/* 
	 * @param
	 * @return string
	 * getHistory shall return a string of all operations
	 * performed and separate operations and values with
	 * a space.
	 */
	public String getHistory () {
		
		return getHistory.toString();
		}
	}