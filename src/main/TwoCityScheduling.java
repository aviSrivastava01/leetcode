package main;

import java.util.Arrays;

public class TwoCityScheduling {
	    public static int twoCitySchedCost(int[][] costs) {
	       Arrays.sort(costs , (a,b) -> {
	           return (Math.abs(b[0]-b[1]) - Math.abs(a[0]-a[1]));
	       });
	        
	        int res =0;
	        int countA =0;
	        int countB =0;
	        int n = costs.length/2;
	        for(int i=0; i< costs.length ; i++){
	            if(countA < n && countB < n){
	                if(costs[i][0] < costs[i][1])  {
	                    countA++; 
	                    res += costs[i][0];
	                }else{
	                    countB++; 
	                    res += costs[i][1];
	                }
	            }
	           else if(countA < n){
	                    countA++; 
	                    res += costs[i][0];
	           }
	            else if(countB < n){
	                countB++;
	                res += costs[i][1];
	            }
	        }
	        
	        return res;
	    }
	    
	    public static void main (String[] args) {
	    	twoCitySchedCost(new int[][] {{10,20},{30,200},{400,50},{30,20}});
	    }
}
