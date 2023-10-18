///https://school.programmers.co.kr/learn/courses/30/lessons/120866
package ProblemsLv0;

public class SafeZone {
    //Find Safe Zone.
    public int safeZone(int[][] board){
        board = makeDanger(board);
        return countSafe(board);
    }
    public int[][] makeDanger(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    board = markDanger(board, i, j);
                }
            }
        }
        return board;
    }
    public int[][] markDanger(int[][] board, int i, int j){
        //NN, NE, EE, SE, SS, SW, WW, NW
        markNN(board, i, j);
        markNE(board, i, j);
        markEE(board, i, j);
        markSE(board, i, j);
        markSS(board, i, j);
        markSW(board, i, j);
        markWW(board, i, j);
        markNW(board, i, j);
        return board;
    }
    public void markNN(int[][] board, int i, int j){
        try {
            if(board[i-1][j] == 0){
                board[i-1][j] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public void markNE(int[][] board, int i, int j){
        try {
            if(board[i-1][j+1] == 0){
                board[i-1][j+1] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public void markEE(int[][] board, int i, int j){
        try {
            if(board[i][j+1] == 0){
                board[i][j+1] = -1;
            }

        }
        catch (Exception ignored){

        }
    }
    public void markSE(int[][] board, int i, int j){
        try {
            if(board[i+1][j+1] == 0){
                board[i+1][j+1] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public void markSS(int[][] board, int i, int j){
        try {
            if(board[i+1][j] == 0){
                board[i+1][j] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public void markSW(int[][] board, int i, int j){
        try {
            if(board[i+1][j-1] == 0){
                board[i+1][j-1] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public void markWW(int[][] board, int i, int j){
        try {
            if(board[i][j-1] == 0){
                board[i][j-1] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public void markNW(int[][] board, int i, int j){
        try {
            if(board[i-1][j-1] == 0){
                board[i-1][j-1] = -1;
            }
        }
        catch (Exception ignored){

        }
    }
    public int countSafe(int[][] board){
        int count = 0;
        for (int[] ints : board) {
            for (int j = 0; j < board[0].length; j++) {
                if (ints[j] == 0) count++;
            }
        }
        return count;
    }
    public void print(int[][] board){
        for (int[] ints : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
