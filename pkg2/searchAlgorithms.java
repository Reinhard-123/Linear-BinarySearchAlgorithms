
package project7.pkg2;


public class searchAlgorithms {
    
    public static void LinearSearch(int[] array, int target) {
        
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
            if(target == array[i]) {
                System.out.println("target " + target + " found. "
                        + "Number of steps is " + count);
                        return;
            }
            else {
                count++;
            }
        }//for loop
        
        System.out.println("Target not found");
        
    }//linearsearch method
    
    public static void binarySearch(int[] array, int target) {
         
        int min = 0;
        int max = array.length-1;
        int mid = (min+max)/2;
        
       int count = 0; 
       while(min<=max) {
           
           count++;
           mid = (min+max)/2;
           
           if(array[mid] < target) {
               min = mid + 1;
           }
           else if(array[mid] > target) {
               max = mid -1 ;
           }
           else if(array[mid]== target) {
               System.out.println("Binary Search: target " + target + " found. "
                       + "Number of steps is " + count);
               return;
           }
           
       }//while loop
        
       System.out.println("target not found");
        
    }//binarysearch method
    
    
    
}
