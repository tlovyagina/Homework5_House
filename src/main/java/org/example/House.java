package org.example;

import java.util.*;

public class House {
    private Map<String, Integer> tenants = new HashMap<>();

    public void checkInTenants() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя и возраст человека (0 -завершить список жильцов):");
            String name = scanner.next();

            if (name.equals("0")) break;
            tenants.put(name, scanner.nextInt());
        }
    }

    public List<String> getOlder18() {
        List<String> result = new ArrayList<>();

        for (String name : tenants.keySet()) {
            if (tenants.get(name) > 18)
                result.add(name);
        }

        Collections.sort(result);
        return result;
    }
}