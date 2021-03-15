/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typeEmployee;

/**
 *
 * @author Putri Syalwa
 * 191524054
 */
//****************************************************************** 
//Commission.java      Author: Runar
//
//Represents an employee that gets paid by the hour plus commission.
//*******************************************************************
public class Commission extends Hourly {

  double totalSales;
  double commissionRate;
  //----------------------------------------------------------------- 
  //  Sets up this commission employee using the specified information. 
  //-----------------------------------------------------------------
  public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
    super(eName, eAddress, ePhone, socSecNumber, rate);
    commissionRate = commRate;
  }
  //----------------------------------------------------------------- 
  //  Adds the specified amount of sales to this employee's
  //  total sales.
  //-----------------------------------------------------------------
  public void addSales(double totSales) {
    totalSales += totSales;
  }
  //----------------------------------------------------------------- 
  //  Computes and returns the pay for this commission employee.
  //-----------------------------------------------------------------
  @Override
  public double pay() {
    double payment = super.pay();
    payment += totalSales * commissionRate;
    totalSales = 0;
    return payment;
  }
  //----------------------------------------------------------------- 
  //  Returns information about this commission employee as a string. 
  //-----------------------------------------------------------------
  @Override
  public String toString() {
    String result = super.toString();
    result += "\nTotal Sales: " + totalSales; 
    return result;
  }
}
