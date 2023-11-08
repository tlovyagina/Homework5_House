package org.example;

import java.util.List;

public class App {
    public static void main(String[] args) {
        House house = new House();
        house.checkInTenants();
        List<String> tenants = house.getOlder18();

        if (tenants.isEmpty())
            System.out.println("Нет жильцов старше 18 лет");
        else
            System.out.println("Отсортированные по алфавиту жильцы старше 18 лет: " + tenants);
    }
}