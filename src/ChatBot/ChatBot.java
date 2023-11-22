package ChatBot;

import java.util.Scanner;
public class ChatBot {

        public static void main(String[] args) {
            // Визначте ім'я бота
            String botName = "Shadow Fiend";

            // Визначте поточний рік
            int birthYear = 2023;

            // Створіть сканер для введення з клавіатури
            Scanner scanner = new Scanner(System.in);

            // Запитайте користувача про його ім'я
            System.out.println("Hello! My name is " + botName + ".");
            System.out.println("I was created in " + birthYear + ".");
            System.out.println("Please, remind me your name.");

            // Отримайте ім'я користувача з клавіатури
            String yourName = scanner.nextLine();

            // Виведіть привітання для користувача
            System.out.println("What a great name you have, " + yourName + "!");
        }
    }


