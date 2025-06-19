class Solution {
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans=new ArrayList<>();
        Nqueen(board,0,ans);
        return ans.size();
    }
     public void Nqueen(char[][] board,int row, List<List<String>> ans) {
        int n=board.length;
        if(row==n){
            //copy 2D char array into list of String 
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }
                l.add(str);
            }
            ans.add(l);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                Nqueen(board,row+1,ans);
                board[row][i]='.';
            }
        }
    }
    public boolean isSafe(char[][] board,int row,int col){
        int n= board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        int i=row;
        int j=col;
        //nort east
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //south east
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //north west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        //west south
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;
    }
}