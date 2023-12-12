package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        // Ігрове поле
        char[][] gameBoard = {
                {'X', 'O', 'X'},
                {'O', 'X', 'O'},
                {'X', 'X', 'O'}
        };

        // Вивід ігрового поля
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
