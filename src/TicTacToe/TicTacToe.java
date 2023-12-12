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
    }
}

