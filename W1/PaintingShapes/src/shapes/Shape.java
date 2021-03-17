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
//Shape.java
//
//Represents a shape.
//*****************************************
public abstract class Shape {
  String shapeName;
  //---------------------------------- 
  //Constructor: Sets up the shape. 
  //----------------------------------
  public Shape(String name) {
    shapeName = name;
  }
  //----------------------------------------- 
  //Returns the surface area of the shape. 
  //-----------------------------------------
  public abstract double area();
  //----------------------------------- 
  //Returns the shape as a String. 
  //-----------------------------------
  public String toString() {
    return shapeName;
  }
}
