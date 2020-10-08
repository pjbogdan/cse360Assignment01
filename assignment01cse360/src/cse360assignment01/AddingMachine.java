package cse360assignment01;

public class AddingMachine 
{
	  private int total;
	  private String history;
	  /*
	   * 
	   */
	  public AddingMachine () 
	  {
		
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  
	  /*
	   * function to get total from adding/subtracting
	   */
	  public int getTotal () 
	  {
	    return total;
	  }
	  
	  /*
	   * function to add
	   */
	  public void add (int value) 
	  {
		  total = value + total;
		  history += " + " + value; // saves recorded values into history
	  }

	  /*
	   * function to subtract
	   */
	  public void subtract (int value) 
	  {
		  total = total - value;
		  history += " - " + value; // saves recorded values into history
	  }

	  public String toString () 
	  {
		  
		  return history;
	  }

	  public void clear() 
	  {
		  history = "0";
		  total = 0;
	  }
	  
	  public static void main(String[] args)
	  {
		  AddingMachine myCalculator = new AddingMachine();
		  
		 
		  myCalculator.add(4);
		  myCalculator.subtract(2);
		  myCalculator.add(5);
		  
		  System.out.println(myCalculator.getTotal());
		  System.out.println(myCalculator.toString());
	  }
	}