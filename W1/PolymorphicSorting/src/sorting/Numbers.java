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
//**********************************************************
// Numbers.java
//
// Demonstrates selectionSort on an array of integers.
//**********************************************************
import java.util.Scanner;
public class Numbers{
    public static void main (String[] args){
/**       int[] diubah menjadi Comparable[] (disesuaikan dengan parameter pada
          method insertionSort dan selectionSort di class Sorting)*/
        //int[] intList;
        Comparable[] intList;
        int size;
        
        Scanner scan = new Scanner(System.in);
        System.out.print ("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Comparable[size];         //int[size] diubah menjadi Comparable[size]
        System.out.println ("\nEnter the numbers...");
            for (int i = 0; i < size; i++){
                intList[i] = scan.nextInt();
            }
            Sorting.selectionSort(intList);
            //Sorting.insertionSort(intList);
            
            System.out.println ("\nYour numbers in sorted order...");
            for (int i = 0; i < size; i++)
                System.out.print(intList[i] + " ");
                System.out.println ();
    }
}
