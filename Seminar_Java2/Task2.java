package Seminar_Java2;

public class Task2 {
    public static void main(String[] args) {
        // Напишите метод, который сжимает строку.
        // Пример: вход aaaabbbcdd. Результат - a4b3cd2 для примера.
        System.err.println(stringCompress("aaaabbbcdd"));
    }

    static String stringCompress(String str) {
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for (char letter : str.toCharArray()) {
            if (letter == symbol)
                count++;
            else {
                if (count != 1)
                    newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        if (count != 1)
            newStr.append(count);
        return newStr.toString();
    }
}
