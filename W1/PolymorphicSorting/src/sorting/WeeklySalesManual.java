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
import java.util.Scanner;
public class WeeklySalesManual {
    public static void main(String[] args){
	int size;
	String aFirstName, aLastName;
        int aTotalSales;
                
	Scanner scan = new Scanner(System.in);
	
	System.out.print("\nHow many Staff do you want to sort? ");
	size = scan.nextInt();
        Salesperson[] salesStaff = new Salesperson[size];
	System.out.println("\nEnter Data of Staff...");
	for(int i=0; i<size; i++){  //scan string
            System.out.printf("\nFirst name : ");
            aFirstName = scan.next();
            System.out.printf("Last name : ");
            aLastName = scan.next();
            System.out.printf("Total Sales : ");
            aTotalSales = scan.nextInt();
            salesStaff[i] = new Salesperson(aFirstName, aLastName, aTotalSales);
	}
		
	Sorting.insertionSort(salesStaff);
        System.out.println( "\nRanking of Sales for the Week\n" );
        for(Salesperson sl : salesStaff) {
            System.out.println(sl);
        }
    }
}
