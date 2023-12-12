package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cells = "_________";
        printGrid(cells);

        boolean xTurn = true;
        boolean gameFinished = false;

        while (!gameFinished) {
            char symbol = xTurn ? 'X' : 'O';
            int x, y;

            while (true) {
                System.out.print("Enter the coordinates: ");
                try {
                    x = scanner.nextInt();
                    y = scanner.nextInt();

                    if (x < 1 || x > 3 || y < 1 || y > 3) {
                        System.out.println("Coordinates should be from 1 to 3!");
                        scanner.nextLine(); // Clear input buffer
                        continue;
                    }

                    int index = (3 - y) * 3 + (x - 1);
                    if (cells.charAt(index) != '_') {
                        System.out.println("This cell is occupied! Choose another one!");
                        continue;
                    }

                    cells = cells.substring(0, index) + symbol + cells.substring(index + 1);
                    break;
                } catch (Exception e) {
                    System.out.println("You should enter numbers!");
                    scanner.nextLine(); // Clear input buffer
                }
            }

            printGrid(cells);

            if (checkWinner(cells, 'X')) {
                System.out.println("X wins");
                gameFinished = true;
            } else if (checkWinner(cells, 'O')) {
                System.out.println("O wins");
                gameFinished = true;
            } else if (!cells.contains("_")) {
                System.out.println("Draw");
                gameFinished = true;
            }

            xTurn = !xTurn;
        }
    }

    public static void printGrid(String cells) {
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char symbol = cells.charAt(i + j);
                System.out.print(symbol + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static boolean checkWinner(String cells, char symbol) {
        return (cells.charAt(0) == symbol && cells.charAt(1) == symbol && cells.charAt(2) == symbol) ||
                (cells.charAt(3) == symbol && cells.charAt(4) == symbol && cells.charAt(5) == symbol) ||
                (cells.charAt(6) == symbol && cells.charAt(7) == symbol && cells.charAt(8) == symbol) ||
                (cells.charAt(0) == symbol && cells.charAt(3) == symbol && cells.charAt(6) == symbol) ||
                (cells.charAt(1) == symbol && cells.charAt(4) == symbol && cells.charAt(7) == symbol) ||
                (cells.charAt(2) == symbol && cells.charAt(5) == symbol && cells.charAt(8) == symbol) ||
                (cells.charAt(0) == symbol && cells.charAt(4) == symbol && cells.charAt(8) == symbol) ||
                (cells.charAt(2) == symbol && cells.charAt(4) == symbol && cells.charAt(6) == symbol);
    }
}
