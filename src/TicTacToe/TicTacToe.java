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
        printGrid(input);

        // Запит на введення координат від користувача
        while (true) {
            System.out.print("Enter the coordinates: ");
            try {
                int x = scanner.nextInt();
                int y = scanner.nextInt();

                if (x < 1 || x > 3 || y < 1 || y > 3) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    scanner.nextLine(); // Очистка буфера введення
                    continue;
                }

                int index = (3 - y) * 3 + (x - 1);
                if (input.charAt(index) != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }

                input = input.substring(0, index) + 'X' + input.substring(index + 1);
                break;
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                scanner.nextLine(); // Очистка буфера введення
            }
        }

        // Оновлення та виведення ігрового поля після ходу користувача
        printGrid(input);
    }

    // Функція виведення ігрового поля
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
}
