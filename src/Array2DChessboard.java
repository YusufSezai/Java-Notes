import java.util.ArrayList;

public class Array2DChessboard {
    public static void main(String[] args) {
        String[][] chessboard = new String[8][8];

        //add code below this line
        for( int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if((i+j)% 2 == 0) {
                    chessboard[i][j] = "O";
                }
                else {
                    chessboard[i][j] = "X";
                }
            }
        }
        /*
        for (int i = 0; i < chessboard.length; i++) {
  for (int j = 0; j < chessboard[0].length; j++) {
    if ((i % 2 == 0) && (j % 2 == 0)) {
      chessboard[i][j] = "O";
    }
    else if ((i % 2 == 1) && (j % 2 == 1)) {
      chessboard[i][j] = "O";
    }
    else if ((i % 2 == 0) && (j % 2 == 1)) {
      chessboard[i][j] = "X";
    }
    else if ((i % 2 == 1) && (j % 2 == 0)) {
      chessboard[i][j] = "X";
    }
  }
}
         */




        //add code above this line

        for (int row = 0; row < chessboard.length; row++) {
            for (int col = 0; col < chessboard[0].length; col++) {
                if (col == chessboard[0].length - 1) {
                    System.out.println(chessboard[row][col]);
                }
                else {
                    System.out.print(chessboard[row][col]);
                }
            }
        }
    }
}
