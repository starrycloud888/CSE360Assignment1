/*
 * Name: Paul Chang
 * Description: uhhh
 */

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
	  this.total = 0;  // not needed - included for clarity
	  this.history = "0";
  } // initializes attributes
  
  public int getTotal () {
	  return this.total;
  } // returns total value
  
  public void add (int value) {
	  this.total = this.total + value;
	  this.history = this.history + " + " + Integer.toString(value);
  } // adds parameter to total variable

  public void subtract (int value) {
	  this.total = this.total - value;
	  this.history = this.history + " - " + Integer.toString(value);
  } // subtracts parameter from total variable

  public String toString () {
	  return this.history;
  } // returns history of transactions

  public void clear() {
	  this.total = 0;
	  this.history = "0";
  } // resets attributes to values assigned in constructor
}