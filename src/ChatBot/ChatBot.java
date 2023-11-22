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
        // Створіть сканер для введення з клавіатури
        scanner = new Scanner(System.in);
        // Запитайте користувача про число, до якого він хоче порахувати
        System.out.println("Now I will prove to you that I can count to any number you want!");
        System.out.println("Enter a positive number:");

        // Отримайте число від користувача
        int userInp = scanner.nextInt();

        // Почніть підрахунок від 0
        int i = 0;

        // Повторюйте, поки i не досягне введеного числа
        while (i <= userInp) {
            // Виведіть поточне число
            System.out.println(i + "!");

            // Збільште i на 1
            i++;
            // Створіть сканер для введення з клавіатури
            scanner = new Scanner(System.in);

            // Запитайте користувача про його ім'я
            System.out.println("Hello! My name is Bard.");
            System.out.println("I will now give you a programming test.");

            // Створіть список запитань і відповідей
            String[] questions = {
                    "Який тип даних використовується для зберігання цілих чисел?",
                    "Який тип даних використовується для зберігання дійсних чисел?",
                    "Який тип даних використовується для зберігання рядків?",
                    "Який оператор використовується для присвоєння значення змінній?",
                    "Який оператор використовується для порівняння двох змінних?",
                    "Який оператор використовується для арифметичних операцій?"
            };
            String[] answers = {
                    "int",
                    "double",
                    "String",
                    "=",
                    "==",
                    "+, -, *, /"
            };

            // Повторюйте тест, поки користувач не відповість правильно
            int correctAnswers = 0;
            while (correctAnswers < questions.length) {
                // Запитайте користувача запитання
                System.out.println(questions[correctAnswers]);

                // Отримайте відповідь від користувача
                String userAnswer = scanner.nextLine();

                // Перевірте відповідь користувача
                if (userAnswer.equals(answers[correctAnswers])) {
                    // Відповідь правильна
                    System.out.println("Відповідь правильна!");
                    correctAnswers++;
                } else {
                    // Відповідь неправильна
                    System.out.println("Відповідь неправильна.");
                }
            }
            // Привітайте користувача з завершенням тесту
            System.out.println("Вітаю! Ви пройшли тест!");
        }
    }
}








