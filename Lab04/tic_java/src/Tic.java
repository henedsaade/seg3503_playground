public class Tic {

    private String[][] board;

    public String[][] theBoard(int index1, int index2){
        board = new String[index1][index2];
        for(int i = 0; i<index1; i++) {
            for(int j = 0; j<index2; j++) {
                board[i][j] = " ";
            }
        }
        return board;
    }
}