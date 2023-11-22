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
            // Запитайте користувача про залишки від ділення його віку на 3, 5 і 7
            System.out.println("Let me guess your age.");
            System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

            // Отримайте залишки від ділення віку користувача на 3, 5 і 7
            int remainder3 = scanner.nextInt();
            int remainder5 = scanner.nextInt();
            int remainder7 = scanner.nextInt();

            // Визначте вік користувача за формулою
            int yourAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

            // Виведіть вік користувача
            System.out.println("Your age is " + yourAge + "; that's a good time to start programming!");
        }
    }


