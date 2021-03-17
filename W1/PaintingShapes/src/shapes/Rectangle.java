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
//Rectangle.java
//
//Represents a rectangle.
//***************************************** 
public class Rectangle extends Shape {
  private double length;  //length in feet
  private double width;  //width in feet
  
  //---------------------------------- 
  //Constructor: Sets up the rectangle. 
  //---------------------------------- 
  public Rectangle(double l, double w) {
    super("Rectangle"); 
    length = l;
    width = w;
  } 
  //----------------------------------------- 
  //Returns the surface area of the rectangle. 
  //----------------------------------------- 
  @Override
  public double area() {
    return length * width;
  }
  //----------------------------------- 
  //Returns the rectangle as a String. 
  //----------------------------------- 
  @Override
  public String toString() {
    return super.toString() + " of length " + length + " and width " + width;
  }
}
