package main;

public class MoveZeroes {

	  public static void moveZeroes(int[] nums) {
	        int lastZeroIndex = -1;
	        for(int i=0 ; i<nums.length;i++){
	            if(nums[i] == 0) lastZeroIndex = lastZeroIndex != -1 ? Math.min(lastZeroIndex,i) : 0;
	            else if (lastZeroIndex != -1) {
	                nums[lastZeroIndex] = nums[i];
	                nums[i] = 0;
	                lastZeroIndex = i;
	            }
	        }
	    }
	  
	  public static void main (String[] args) {
		  moveZeroes(new int[] {0,1,0,3,12});
	  }
}
