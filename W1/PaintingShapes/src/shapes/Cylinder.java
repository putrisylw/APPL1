/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author Putri Syalwa
 * 191524054
 */
//***************************************** 
//Cylinder.java
//
//Represents a cylinder.
//***************************************** 
public class Cylinder extends Shape {
  private double radius;  //radius in feet
  private double height;  // height in feet
  //---------------------------------- 
  //Constructor: Sets up the cylinder. 
  //---------------------------------- 
  public Cylinder(double r, double h) {
    super("Cylinder"); 
    radius = r;
    height = h;
  } 
  //----------------------------------------- 
  //Returns the surface area of the cylinder. 
  //----------------------------------------- 
  @Override
  public double area() {
    return Math.PI*radius*radius*height;
  }
  //----------------------------------- 
  //Returns the cylinder as a String. 
  //----------------------------------- 
  @Override
  public String toString() {
    return super.toString() + " of radius " + radius + " and height " + height;
  }
}
