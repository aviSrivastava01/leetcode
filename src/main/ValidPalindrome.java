package main;

public class ValidPalindrome {
	 public static boolean isPalindrome(String s) {
	        if(s == " " || s=="" || s.length() == 0 || s.length() == 0 ) return true;
	            int n = s.length() - 1;
		        int j =0;
		        for(int i=0; i<s.length();i++){
		            while(i <= n){
		                if(!Character.isLetterOrDigit(s.charAt(j))){
		                    j++;
		                }else if(!Character.isLetterOrDigit(s.charAt(n))){
		                    n--;
		                }
		                else{
	                    if(Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(n)))  return false;
		                j++;
		                n--;
		                }
		            }
		        }
		        return true;
	    }
	   
	   public static void main(String[] args) {
		   isPalindrome(" ");
	}
}
