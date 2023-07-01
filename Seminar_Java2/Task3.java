package Seminar_Java2;

public class Task3 {
    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String)
        // и определяет является ли строка палиндромом (возвращает boolean значение).
System.out.println(polindrom("aaanmnaaa"));
    }

    static boolean polindrom(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            res.append(str.charAt(i));

        return str.equals(res.toString());
    }

}
