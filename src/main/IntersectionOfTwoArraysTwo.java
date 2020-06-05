package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArraysTwo {

	 public static int[] intersect(int[] nums1, int[] nums2) {

		 	int[] large = null, small = null;
		 	
		 	if(nums1.length > nums2.length) {
		 		large = nums1;
		 		small = nums2;
		 	}else {
		 		large = nums2;
		 		small = nums1;
		 	}
	        
	        List<Integer> ls = new ArrayList();
	        HashMap<Integer, Integer> map = new HashMap();
	        for(int i= 0;i <large.length; i++){
	            map.put(large[i] ,map.getOrDefault(large[i],0) + 1);
	        }
	        
	       for(int k = 0; k<small.length; k++){
	           if(map.containsKey(small[k]) && map.get(small[k]) >1){
	               map.put(small[k] , map.get(small[k]) - 1);
	               ls.add(small[k]);
	           }
	           else if (map.containsKey(small[k])){
	                ls.add(small[k]);
	                map.remove(small[k]);
	           }
	       }
	        int[] ans = new int[ls.size()];
	        for (int i=0;i<ls.size();i++) {
	            ans[i] = ls.get(i);
	        }
	        return ans;
	     
	    }
	 
	 public static void main (String[] args) {
		 int[] result = intersect(new int[] {3,1,2} , new int[] {1,1});
	 }
	               
}
