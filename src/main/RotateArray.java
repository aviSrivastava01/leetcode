package main;

public class RotateArray {
	 public static void rotate(int[] nums, int k) {
		 while(k > nums.length ){
	            k--;
	        }
		 if (k == nums.length) {
			 reverseEntireArray(nums, nums.length); 
		 }
		 else if(nums.length >1)
	        {
	       int n= nums.length-k;
	          reverseEntireArray(nums, n); 
	        System.out.println("Reversed array is 1st half: \n"); 
	        for (k = 0; k < n; k++) { 
	            System.out.println(nums[k]); 
	        } 
	        
	        int z = (n+nums.length)/2 ;
	        int l = nums.length;
	        int y =0;
	        int j, r;
	        for(j = n; j<z; j++){
	            r = nums[j]; 
	            nums[j] = nums[l - y - 1]; 
	            nums[l - y - 1] = r; 
	            y++;
	        }
	        
	        System.out.println("Reversed array is 2nd half: \n"); 
	        for (k = n; k < l; k++) { 
	            System.out.println(nums[k]); 
	        } 
	        
	        reverseEntireArray(nums, l); 
	        
	    }
		  System.out.println("Reversed array is total: \n"); 
	         for (k = 0; k < nums.length; k++) { 
	             System.out.println(nums[k]); 
	         } 
	 }

	private static void reverseEntireArray(int[] nums, int l) {
		int x, b;
		 for (x = 0; x < l/2; x++) { 
		    b = nums[x]; 
		    nums[x] = nums[l - x - 1]; 
		    nums[l - x - 1] = b; 
		}
	}
	 
public static void main(String[] args) {
	int[] arr = new int[] {1,2};
	int k =3;
	rotate(arr, k);
}
}
