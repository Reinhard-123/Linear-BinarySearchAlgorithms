
package project7.pkg2;

import java.io.*;
import java.util.*;


public class Project72 {


    public static void main(String[] args) {
        
        System.out.print("Enter array size:");
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int[] array = new int[size];
        
        populateArray(array);
        Random rand = new Random();
        int target = rand.nextInt(1001);
        
        
        searchAlgorithms.LinearSearch(array, target); 
        Arrays.sort(array);
        searchAlgorithms.binarySearch(array, target);

        
    }//main
    
    public static void populateArray(int[] array) {
        
        Random rnd = new Random();
        
        for(int i = 0; i < array.length; i++) {
            int randomNumber = rnd.nextInt(1001);
            array[i] += randomNumber;
        }
        
    }//populateArray method
    
    
    
    
    
    
}//Project7 class
