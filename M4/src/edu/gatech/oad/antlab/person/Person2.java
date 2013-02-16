package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		String ans="";
	  if(input==null){
		  return ans;
	  }
	  else{
		  for(int x=input.length()-1;x>=0;x--){
			  ans=ans+input.charAt(x);
		  }
		  char[] chars=ans.toCharArray();
		  char z=chars[0];
		  char y=chars[input.length()-1];
		  chars[0]=y;
		  chars[input.length()-1]=z;
		  String temp="";
		  for(int x=input.length()-1;x>=0;x--){
			  temp=temp+ans.charAt(x);
		  }
		  return temp;
	  }
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
