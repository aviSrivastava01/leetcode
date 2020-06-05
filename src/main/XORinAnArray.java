package main;

// Java program to find the XOR of 
//all elements in the array 
class GFG { 
   
 // Function to find the XOR of 
 // all elements in the array 
 static int xorOfArray(int arr[], int n) 
 { 
     // Resultant variable 
     int xor_arr = 0; 
   
     // Iterating through every element in 
     // the array 
     for (int i = 0; i < n; i++) { 
   
         // Find XOR with the result 
         xor_arr = xor_arr ^ arr[i]; 
     } 
   
     // Return the XOR 
     return xor_arr; 
 } 
   
 // Driver Code 
 public static void main (String[] args) 
 { 
   
     int arr[] = { 3, 3, 2, 2, 5, 4, 4 }; 
     int n = arr.length; 
   
     // Function call 
     System.out.println(xorOfArray(arr, n)); 

 } 
} 
