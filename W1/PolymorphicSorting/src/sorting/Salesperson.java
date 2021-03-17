/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Putri Syalwa
 * 191524054
 */
public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;
	
    //----------------------------------------------------------------------
    //	Constructor:  Sets up the salesperson object with
    //	              the given data.
    //----------------------------------------------------------------------
    public Salesperson( String first, String last, int sales ) {
    	firstName = first;
	lastName = last;
	totalSales = sales;
    }

    //----------------------------------------------------------------------
    //	Returns the salesperson as a string.
    //----------------------------------------------------------------------
    public String toString() {
	return lastName + ", " + firstName + ": \t" + totalSales;
    }
	
    //----------------------------------------------------------------------
    //	Returns true if the salespeople have the same name.
    //----------------------------------------------------------------------
    public boolean equals( Object other ) {
	return( lastName.equals(((Salesperson)other).getLastName()) && firstName.equals(((Salesperson)other).getFirstName()));
    }

    //----------------------------------------------------------------------
    //	Order is based on total sales with the name (last, then first)
    //	breaking a tie.
    //----------------------------------------------------------------------
    public int compareTo( Object other ) {
	int result;
        Salesperson obj = (Salesperson)other;
        
        if (this.totalSales < obj.totalSales){
            result = -1;
        } else if (this.totalSales > obj.totalSales){
            result = 1;
        } else{
            if (this.firstName.compareTo(obj.firstName) != 0){
                result = this.firstName.compareTo(obj.firstName);
            } else{
                result = this.lastName.compareTo(obj.lastName);
            }
        }
	return result;
    }
	
    public String getFirstName() {
	return firstName;
    }
	
    public String getLastName() {
	return lastName;
    }
	
    public int getSales() {
	return totalSales;
    }
}
