package main;

import java.util.HashMap;

public class DuplicateInAnArray {
	    public static boolean containsDuplicate(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap(nums.length);
	        for(int i=0; i<nums.length; i++){
	        	int num = map.get(nums[i]) == null ? 0 : map.get(nums[i]);
	            map.put(nums[i],num +1);
	                if(map.get(nums[i]) >1) return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	    	containsDuplicate(new int[] {1,2,3,1});
	    }
}
