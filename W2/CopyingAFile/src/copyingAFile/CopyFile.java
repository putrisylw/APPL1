/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copyingAFile;

/**
 *
 * @author Putri Syalwa
 * 191524054
 */

import java.io.File;  
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CopyFile {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        Scanner inputScanner = null;
        
        // Jika file tidak ditemukan (not found) maka akan diminta masukkan file address kemabali
        do{
            System.out.println("Masukkan File Address : ");
            String fileAddrTobeRead = sc.nextLine();
            File file = new File(fileAddrTobeRead);
            
            // Check file ditemukan (found) atau tidak
            try{
                inputScanner = new Scanner(file);
                found = true;
            } catch(FileNotFoundException e){
                System.out.println("\nFile tidak ditemukan!\n"
                        + "Silahkan coba kembali...\n----------------------\n");
            }
        } while (!found);
        
        // Print isi file
        System.out.println("\nIsi File : ");
        do{
            String line = inputScanner.nextLine();
            System.out.println(line);
        } while (inputScanner.hasNextLine());
    }
}