//https://school.programmers.co.kr/learn/courses/30/lessons/120861
package ProblemsLv0;

public class CoordinateOfCharacter {
    int[][] gameBoard;
    int[] standard;
    //Find out where is character.
    public int[] coordinateOfCharacter(String[] keyinput, int[] board){
        gameBoard = makeBoard(board);
        int width = gameBoard.length;
        int height = gameBoard[0].length;
        standard = new int[]{width/2, height/2};
        int[] pointer = new int[]{0, 0};

        for(String i : keyinput){
            pointer = takeOrder(i, pointer);
        }
        return pointer;
    }
    public int[] translate(int[] pointer){
        int[] cursor = new int[2];
        cursor[0] = standard[0] - pointer[1];
        cursor[1] = standard[1] + pointer[0];
        return cursor;
    }
    public int[] translateBack(int[] cursor){
        int[] pointer = new int[2];
        pointer[0] = cursor[1] - standard[1];
        pointer[1] = (cursor[0] - standard[0])*-1;
        return pointer;
    }
    public int[] takeOrder(String order, int[] pointer) {
        int[] cursor = translate(pointer);
        int x = cursor[0];
        int y = cursor[1];
        switch (order) {
            case "right" -> {
                if (gameBoard[x][y + 1] != -1) {
                    cursor[1] = y + 1;
                }
            }
            case "left" -> {
                if (gameBoard[x][y - 1] != -1) {
                    cursor[1] = y - 1;
                }
            }
            case "up" -> {
                if (gameBoard[x - 1][y] != -1) {
                    cursor[0] = x - 1;
                }
            }
            case "down" -> {
                if (gameBoard[x + 1][y] != -1) {
                    cursor[0] = x + 1;
                }
            }
        }
        return translateBack(cursor);
    }
    public int[][] makeBoard(int[] board){
        int[][] gameBoard = new int[board[1]+2][board[0]+2];
        return makeWall(gameBoard);
    }
    public int[][] makeWall(int[][] gameBoard){
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j <gameBoard[0].length; j++){
                if(i == 0 || i == gameBoard.length-1 || j == 0 || j == gameBoard[0].length-1)
                    gameBoard[i][j] = -1;
            }
        }
        return gameBoard;
    }
}
