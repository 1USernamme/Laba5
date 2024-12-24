public class CountNumbersInStringLab5 {
    public static int countNumbersInString(String input) {
        if (input == null) {
            throw new NullPointerException("Вхідний рядок не може бути null");
        }

        // Розбиваємо рядок на слова
        String[] tokens = input.split("\\s+");
        int count = 0;

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Приклади перевірок
        String example1 = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        String example2 = "In 2023, 10 new products were released, and sales increased by 20 percent.";

        System.out.println("Кількість чисел у першому реченні: " + countNumbersInString(example1)); // очікувано: 2
        System.out.println("Кількість чисел у другому реченні: " + countNumbersInString(example2));  // очікувано: 3

        // Перевірка з null
        try {
            countNumbersInString(null); // виключення
        } catch (NullPointerException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
}