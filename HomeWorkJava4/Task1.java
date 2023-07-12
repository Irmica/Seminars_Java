package HomeWorkJava4;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    // Даны два Deque, представляющие два целых числа. Цифры хранятся в обратном
    // порядке и каждый из их узлов содержит одну цифру.
    // 1) Умножьте два числа и верните произведение в виде связанного списка.
    // 2) Сложите два числа и верните сумму в виде связанного списка. Одно или два
    // числа должны быть отрицательными.
    public static void main(String[] args) {
        int n = -1;
        StringBuilder stringNumber1 = new StringBuilder();
        StringBuilder stringNumber2 = new StringBuilder();
        while (n != 0) {
            System.out.println("Выбор действия: 1 - ввести числа, 2 - сложить числа, 3  - умножить числа, 0 - выйти.");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            switch (n) {
                case 1:
                    List<StringBuilder> stringsNumber = getDataFromUser();
                    stringNumber1 = stringsNumber.get(0);
                    stringNumber2 = stringsNumber.get(1);
                    break;
                case 2:
                    additionAnalyzer(stringNumber1, stringNumber2);
                    break;
                case 3:
                    multiAnalyzer(stringNumber1, stringNumber2);
                    break;
            }
        }
    }

    static void additionAnalyzer(StringBuilder number1,                                 // метод для анализа отрицательных чисел и вызова дополнительных   
            StringBuilder number2) { // минусы тут убираем                               //для сложения
        if (number1.charAt(0) == '-' && !(number2.charAt(0) == '-')) { // вычитание
            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1.deleteCharAt(0), number2);
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = subtractionNumbers(dequeIntNum2, dequeIntNum1);
            System.out.println(sub);
        } else if (!(number1.charAt(0) == '-') && number2.charAt(0) == '-') { 
            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1,
                    number2.deleteCharAt(0));
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = subtractionNumbers(dequeIntNum1, dequeIntNum2);
            System.out.println(sub);
        } else if (!(number1.charAt(0) == '-') && !(number2.charAt(0) == '-')) { 
            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1,
                    number2);
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = additionNumbers(dequeIntNum1, dequeIntNum2);
            System.out.println(sub);
        } else if ((number1.charAt(0) == '-') && (number2.charAt(0) == '-')) { 

            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1.deleteCharAt(0),
                    number2.deleteCharAt(0));
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = additionNumbers(dequeIntNum1, dequeIntNum2);
            LinkedList<Character> charSub = new LinkedList<>();
            Iterator<Integer> itr2 = sub.iterator();
            while (itr2.hasNext()) {
                charSub.add(Character.forDigit((itr2.next()), 10));
            }
            charSub.add(0, '-');
            System.out.println(charSub);
        }
    }

    static void multiAnalyzer(StringBuilder number1,   // метод для анализа отр.чисел и вызова доп. для умножения
            StringBuilder number2) { // минусы тут убираем
        if (number1.charAt(0) == '-' && !(number2.charAt(0) == '-')) { 
            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1.deleteCharAt(0), number2);
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = multiplication(dequeIntNum2, dequeIntNum1);
            LinkedList<Character> charSub = new LinkedList<>();
            Iterator<Integer> itr2 = sub.iterator();
            while (itr2.hasNext()) {
                charSub.add(Character.forDigit((itr2.next()), 10));
            }
            charSub.add(0, '-');
            System.out.println(charSub);
        } else if (!(number1.charAt(0) == '-') && number2.charAt(0) == '-') { // вычитание
            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1,
                    number2.deleteCharAt(0));
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = multiplication(dequeIntNum1, dequeIntNum2);
            LinkedList<Character> charSub = new LinkedList<>();
            Iterator<Integer> itr2 = sub.iterator();
            while (itr2.hasNext()) {
                charSub.add(Character.forDigit((itr2.next()), 10));
            }
            charSub.add(0, '-');
            System.out.println(charSub);
        } else if (!(number1.charAt(0) == '-') && !(number2.charAt(0) == '-')) { // сложение положительных
            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1,
                    number2);
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = multiplication(dequeIntNum1, dequeIntNum2);
            System.out.println(sub);
        } else if ((number1.charAt(0) == '-') && (number2.charAt(0) == '-')) { // ложение отрицательных

            List<Deque<Integer>> dequeuesIntNum = preprocessorNumbers(number1.deleteCharAt(0),
                    number2.deleteCharAt(0));
            Deque<Integer> dequeIntNum1 = dequeuesIntNum.get(0);
            Deque<Integer> dequeIntNum2 = dequeuesIntNum.get(1);
            LinkedList<Integer> sub = multiplication(dequeIntNum1, dequeIntNum2);
            System.out.println(sub);
        }
    }

    static List<StringBuilder> getDataFromUser() { // метод получения строк от пользователя
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число ввиде строки: ");
        String stringNumber1 = input.nextLine();
        System.out.println("Введите второе число ввиде строки: ");
        String stringNumber2 = input.nextLine();
        StringBuilder stringBNumber1 = new StringBuilder(stringNumber1);
        StringBuilder stringBNumber2 = new StringBuilder(stringNumber2);
        return List.of(stringBNumber1, stringBNumber2);
    }

    static List<Deque<Integer>> preprocessorNumbers(StringBuilder stringNumber1,
            StringBuilder stringNumber2) { // метод для общей
        // обработки строки в
        // очередь нужной
        // длины с целыми
        // числами
        Deque<Character> dequeCharNumber1 = createDequeOfCharacters(stringNumber1);
        Deque<Character> dequeCharNumber2 = createDequeOfCharacters(stringNumber2);
        Deque<Integer> dequeIntNumber1 = convertToIntegerDeque(dequeCharNumber1); // конвертация в очередь из целых

        Deque<Integer> dequeIntNumber2 = convertToIntegerDeque(dequeCharNumber2);
        dequeIntNumber1 = equalLengths(dequeIntNumber1, dequeIntNumber2).get(0); // равнение длины очереди
        dequeIntNumber2 = equalLengths(dequeIntNumber1, dequeIntNumber2).get(1);
        return List.of(dequeIntNumber1, dequeIntNumber2);
    }

    static LinkedList<Integer> additionNumbers(Deque<Integer> deque1,
            Deque<Integer> deque2) { // метод для сложения чисел

        LinkedList<Integer> sumDeque = new LinkedList<>();
        int tempDigit = 0;
        int iter = deque1.size();
        for (int i = 0; i < iter; i++) {
            sumDeque.addFirst((deque1.peekFirst() + deque2.peekFirst() + tempDigit)
                    % 10);
            tempDigit = (deque1.pollFirst() + deque2.pollFirst() + tempDigit) / 10;
        }
        if (tempDigit == 1)
            sumDeque.addFirst(1);
        return sumDeque;
    }

    static LinkedList<Integer> subtractionNumbers(Deque<Integer> deque1, Deque<Integer> deque2) { // метод для
                                                                                                  // вычитания
        LinkedList<Integer> subDeque = new LinkedList<>();
        int tempDigit = 0;
        int iter = deque1.size();
        for (int i = 0; i < iter; i++) {
            if (deque2.peekFirst() > deque1.peekFirst()) {
                subDeque.addFirst((10 + deque1.pollFirst() - deque2.pollFirst() - tempDigit));
                tempDigit = 1;
            } else {
                subDeque.addFirst(deque1.pollFirst() - deque2.pollFirst() - tempDigit);
                tempDigit = 0;
            }
        }
        int k = 0;
        while (subDeque.get(k) == 0)
            subDeque.remove(k);
        return subDeque;
    }

    static Deque<Character> createDequeOfCharacters(StringBuilder Digit) { // метод для создания очереди символов из
                                                                           // строки.
        Deque<Character> DequeOfCharacter = new LinkedList<>();
        for (int i = 0; i < Digit.length(); i++) {
            DequeOfCharacter.addFirst(Digit.charAt(i));
        }
        return DequeOfCharacter;
    }

    static Deque<Integer> convertToIntegerDeque(Deque<Character> number) { // метод для конвертации символов очереди в
                                                                           // целые числа.
        Deque<Integer> intDequeNumber = new LinkedList<>();
        Iterator<Character> itr = number.iterator();
        while (itr.hasNext()) {
            intDequeNumber.addLast((Character.digit(itr.next(), 10)));
        }
        return intDequeNumber;
    }

    static List<Deque<Integer>> equalLengths(Deque<Integer> number1, Deque<Integer> number2) { // метод для увеличения
                                                                                               // длины
        // очереди
        if (number1.size() > number2.size()) {
            for (int i = 0; i < number1.size() - number2.size(); i++)
                number2.addLast(0);
        } else {
            for (int i = 0; i < number2.size() - number1.size(); i++)
                number1.addLast(0);
        }
        return List.of(number1, number2);
    }

    static LinkedList<Integer> multiplication(Deque<Integer> deque1, Deque<Integer> deque2) {
        int digit1 = convertDequeToInt(deque1);
        int digit2 = convertDequeToInt(deque2);
        int mult = digit1 * digit2;
        LinkedList<Integer> multList = new LinkedList<>();
        while (mult != 0) {
            multList.add(mult % 10);
            mult = mult / 10;
        }
        return multList;

    }

    static int convertDequeToInt(Deque<Integer> deque1) {
        int sum = 0;
        int i = 1;
        while (!deque1.isEmpty()) {
            sum += deque1.pollLast() * i;
            i = i * 10;
        }
        return sum;
    }
}
