package main;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class UniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap();
        for(int i =0; i< s.length() ;i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0)+1);
        }
        for(Character ch : map.keySet()){
            if(map.get(ch) == 1) return ch;
        }
        return -1;
    }
    
   public static void main(String[] args) {
	   firstUniqChar("leetcode");
}
}
