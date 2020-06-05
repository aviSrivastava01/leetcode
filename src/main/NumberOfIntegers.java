package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'getNumberOfIntegers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING L
     *  2. STRING R
     *  3. INTEGER K
     */

    public static int getNumberOfIntegers(String L, String R, int K) {
    // Write your code here
        
        List<Integer> ls = new ArrayList();
        
        int low =Integer.parseInt(L); 
        int high = Integer.parseInt(R);
        
        StringBuilder sb = new StringBuilder();
        for(int j=0 ; j<K ;j++){
            sb = sb.append("0");
        }
        String res = "1"+sb.toString();
        int modTen = Integer.parseInt(res);
        
        for(int i = low+1; i<= high ;i++){
            if(i <modTen){
                if(i%modTen != 0) ls.add(i);
            }else if (i >=modTen) {
               if(i%modTen == 0) ls.add(i);
            }
            
        }
   
return ls.size();
    }

}

public class NumberOfIntegers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String L = bufferedReader.readLine();

        String R = bufferedReader.readLine();

        int K = Integer.parseInt(bufferedReader.readLine().trim());

        int ans = Result.getNumberOfIntegers(L, R, K);

		/*
		 * bufferedWriter.write(String.valueOf(ans)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
    }
}