class Solution {
    
    public boolean checkinbox(char[][] board,int startx,int starty){
              HashSet<Character> hs =new HashSet<>();

              for(int i=startx;i<startx+3;i++){
                for(int j=starty;j<starty+3;j++){
                    if(board[i][j]!='.' && hs.contains(board[i][j])){
                       return false;
                    }
                    else{
                        hs.add(board[i][j]);
                    }
                }
              }
              return true;
    }


    public boolean isValidSudoku(char[][] board) {
        
           for(int i=0;i<board.length;i=i+3){
             for(int j=0;j<board[i].length;j=j+3){
                   if(!checkinbox(board,i,j)){
                      return false;
                   }
             }
           }
//  for row mtch
        for(int i=0;i<board.length;i++){
             HashSet<Character> hs =new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                 if(board[i][j]!='.' && hs.contains(board[i][j])){
                       return false;
                    }
                    else{
                        hs.add(board[i][j]);
                    }   
            }
           }

            for(int i=0;i<board.length;i++){
                HashSet<Character> hs =new HashSet<>();
            for(int j=0;j<board[i].length;j++){
                 if(board[j][i]!='.' && hs.contains(board[j][i])){
                       return false;
                    }
                    else{
                        hs.add(board[j][i]);
                    }   
            }
           }

return true;
    }
}
