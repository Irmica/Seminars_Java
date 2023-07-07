package Seminar_Java5;

import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//Написать метод, который сортирует строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
public class Task3 {
    public static void main(String[] args) {
        // ex1();// по очереди запускать или чинить сканер
        ex2();
    }

    static void ex1() {   // метод, строки с одинаковой длиной теряются
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String[] words = input.nextLine().split(" ");
        Map<Integer, String> sortedWords = new TreeMap<>();
        for (String word : words) {
            sortedWords.put(word.length(), word);
        }
        System.out.println(sortedWords);
        input.close();
    }

    static void ex2(){ // метод, строки с одинаковой длиной НЕ теряются
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String[] words = input.nextLine().split(" ");
        Map<Integer,LinkedList<String>> sortedWords = new TreeMap<>();

        for (String word : words) {
            if(sortedWords.containsKey(word.length())){
                sortedWords.get(word.length()).add(word);
            }
            else{
                sortedWords.put(word.length(), new LinkedList<>());
                sortedWords.get(word.length()).add(word);
            }
        }
        System.out.println(sortedWords);
        input.close();
    }
}
