package Arrays;

public class NQueen {
    public static boolean nQueen(int [][] board, int rows){
        if (rows == board.length){
            return true;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(rows,col,board)){
                board[rows][col] = 1;
            }
            else if (nQueen(board,rows+1)){
                return true;
            }
        }
        return false;
    }
    public static boolean isSafe(int row,int col,int[][] b){
        // for upper-vertical
        for(int i=row;i>=0;i--){
            if(b[i][col]==1) {
                return false;
            }
        }

        // for upper-left diagonal
        int j=col;
        for(int i=row;i>=0 && j>=0;i--,j--){
            if(b[i][j]==1) {
                return false;
            }
        }

        // for upper-right diagonal
        j=col;
        for(int i=row;i>=0 && j<b.length;i--,j++){
            if(b[i][j]==1)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
