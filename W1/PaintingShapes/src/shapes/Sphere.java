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
//Sphere.java
//
//Represents a sphere.
//***************************************** 
public class Sphere extends Shape {
  private double radius;  //radius in feet
  //---------------------------------- 
  //Constructor: Sets up the sphere. 
  //---------------------------------- 
  public Sphere(double r) {
    super("Sphere"); 
    radius = r;
  } 
  //----------------------------------------- 
  //Returns the surface area of the sphere. 
  //----------------------------------------- 
  @Override
  public double area() {
    return 4*Math.PI*radius*radius;
  }
  //----------------------------------- 
  //Returns the sphere as a String. 
  //----------------------------------- 
  @Override
  public String toString() {
    return super.toString() + " of radius " + radius;
  }
}
