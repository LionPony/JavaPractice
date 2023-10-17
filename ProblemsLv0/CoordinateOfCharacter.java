//https://school.programmers.co.kr/learn/courses/30/lessons/120861
package ProblemsLv0;

public class CoordinateOfCharacter {
    int[][] gameBoard;

    //Where (0, 0) position in 2D array.
    int[] standard;

    //Find out where is character.
    public int[] coordinateOfCharacter(String[] keyinput, int[] board){
        makeBoard(board);
        int width = gameBoard.length;
        int height = gameBoard[0].length;

        //Cursor which works in 2d array.
        standard = new int[]{width/2, height/2};

        //Fixed start position of Character.
        int[] position = new int[]{0, 0};

        for(String i : keyinput){
            position = takeOrder(i, position);
        }
        return position;
    }
    public int[] translate(int[] position){
        //Cursor is which actually works in 2d array.
        int[] cursor = new int[2];
        cursor[0] = standard[0] - position[1];
        cursor[1] = standard[1] + position[0];
        return cursor;
    }
    public int[] translateBack(int[] cursor){
        //Postion is where Character in.
        int[] position = new int[2];
        position[0] = cursor[1] - standard[1];
        position[1] = (cursor[0] - standard[0])*-1;
        return position;
    }
    //Move in gameboard.
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
    //Make gameBoard by given nums.
    public void makeBoard(int[] board){
        //Make 2D array of map.
        gameBoard = new int[board[1]+2][board[0]+2];
        //For exception make wall of -1.
        makeWall();
    }
    //Cover gameBoard with -1.
    public void makeWall(){
        for(int i = 0; i < gameBoard.length; i++){
            for(int j = 0; j <gameBoard[0].length; j++){
                if(i == 0 || i == gameBoard.length-1 || j == 0 || j == gameBoard[0].length-1)
                    gameBoard[i][j] = -1;
            }
        }
    }
}
