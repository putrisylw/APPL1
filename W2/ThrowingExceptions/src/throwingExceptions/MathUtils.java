/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingExceptions;

/**
 *
 * @author Putri Syalwa
 * 191524054
 */
// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************
public class MathUtils{
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException{
        if(n > 16){
            throw new IllegalArgumentException("Argument over 16 are invalid.");
        }else if(n < 0){
            throw new IllegalArgumentException("A negative argument are invalid.");
        } else{
            int fac = 1;
            for (int i=n; i>0; i--){
                fac *= i;
            }
            return fac;
        }
    }
}
