package main;

import java.util.HashSet;

class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        //for checking in row
        
        for(int i=0; i<9 ;i++){
        	HashSet<Character> rowSet = new HashSet<Character>();
            for(int j=0;j <9; j++){
            	if(board[i][j] != '.')
                if(!rowSet.add(board[i][j])) {
                	return false;
                }
               }
        }
        //for checking in coulmn      
       
        for(int i=0; i<9 ;i++){
        	 HashSet<Character> colSet = new HashSet<Character>();
            for(int j=0;j <9; j++){
            	if(board[j][i] != '.')
                if(!colSet.add(board[j][i])) {
                	return false;
                }
               }
        }
            
       // for checking in sub box
        for(int i=0; i<9 ;i++){
           for(int j=0;j <9; j++){
             int row=(i/3)*3;
             int col=(j/3)*3;
                HashSet<Character> boxSet = new HashSet<Character>();
             for(int r=0;r<3;r++){
                for(int c=0;c<3;c++){
                    int ii=row+r;
                    int jj=col+c;
                    if(board[ii][jj] != '.')
                 if(!boxSet.add(board[ii][jj])) {
                	 return false;
                 }
                     
                }
            }
}
        }
                return true;
                    }
    
    
    public static void main(String[] args) {
    	char[][] prob = new char[][] {  {'5','3','.','.','7','.','.','.','.'},
    									{'6','.','.','1','9','5','.','.','.'},
    									{'.','9','8','.','.','.','.','6','.'},
    									{'8','.','.','.','6','.','.','.','3'},
    									{'4','.','.','8','.','3','.','.','1'},
    									{'7','.','.','.','2','.','.','.','6'},
    									{'.','6','.','.','.','.','2','8','.'},
    									{'.','.','.','4','1','9','.','.','5'},
    									{'.','.','.','.','8','.','.','7','9'}};
    
    System.out.println(isValidSudoku(prob));
    }
                    }