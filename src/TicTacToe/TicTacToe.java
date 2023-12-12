package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cells: ");
        String input = scanner.nextLine();

        // Перевірка на правильність введення
        if (input.length() != 9) {
            System.out.println("Incorrect input! Please enter 9 characters.");
            return;
        }

        // Виведення ігрового поля
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char symbol = input.charAt(i + j);
                System.out.print(symbol + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");

        // Аналіз стану гри
        boolean xWins = checkWinner(input, 'X');
        boolean oWins = checkWinner(input, 'O');
        boolean impossible = isImpossible(input);

        if (impossible) {
            System.out.println("Impossible");
        } else if (xWins) {
            System.out.println("X wins");
        } else if (oWins) {
            System.out.println("O wins");
        } else if (input.contains("_")) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }
    }

    // Перевірка переможця
    public static boolean checkWinner(String cells, char symbol) {
        // Перевірка рядків, стовпців та діагоналей
        return (cells.charAt(0) == symbol && cells.charAt(1) == symbol && cells.charAt(2) == symbol) ||
                (cells.charAt(3) == symbol && cells.charAt(4) == symbol && cells.charAt(5) == symbol) ||
                (cells.charAt(6) == symbol && cells.charAt(7) == symbol && cells.charAt(8) == symbol) ||
                (cells.charAt(0) == symbol && cells.charAt(3) == symbol && cells.charAt(6) == symbol) ||
                (cells.charAt(1) == symbol && cells.charAt(4) == symbol && cells.charAt(7) == symbol) ||
                (cells.charAt(2) == symbol && cells.charAt(5) == symbol && cells.charAt(8) == symbol) ||
                (cells.charAt(0) == symbol && cells.charAt(4) == symbol && cells.charAt(8) == symbol) ||
                (cells.charAt(2) == symbol && cells.charAt(4) == symbol && cells.charAt(6) == symbol);
    }

    // Перевірка неможливості стану гри
    public static boolean isImpossible(String cells) {
        int countX = 0;
        int countO = 0;

        for (char cell : cells.toCharArray()) {
            if (cell == 'X') {
                countX++;
            } else if (cell == 'O') {
                countO++;
            }
        }

        int diff = Math.abs(countX - countO);
        boolean xWins = checkWinner(cells, 'X');
        boolean oWins = checkWinner(cells, 'O');

        return (xWins && oWins) || diff >= 2;
    }
}

