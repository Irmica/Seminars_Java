package Seminar_Java5;

import java.util.HashMap;
import java.util.Map;

/**
 * Task1 Создать структуру для хранения номеров паспортов и фамилий сотрудников.
 */
public class Task1 {
    public static void main(String[] args) {
        ex1();
    }

    static void ex1() {
        Map<String, String> workers = new HashMap<>();
        workers.put("100", "Ivanov");
        workers.put("101", "Ivanov1");
        workers.put("102", "Ivanov2");
        workers.put("103", "Ivanov3");
        workers.put("104", "Ivanov4");
        workers.put("105", "Ivanov5");
        workers.put("106", "Ivanov6");
        workers.put("107", "Ivanov7");
        workers.put("108", "Ivanov8");
        workers.put("109", "Ivanov9");
        for (Map.Entry<String, String> worker : workers.entrySet()) {
            if(worker.getValue().equals("Ivanov"))
            System.out.printf("Passport number: %s, Worker Surname: %s \n", worker.getKey(), worker.getValue());
        }
    }
    
}