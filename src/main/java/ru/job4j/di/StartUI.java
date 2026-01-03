package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;
    @Autowired
    private ConsoleInput input;

    public void add(String value) {
        store.add(value);
    }

    public void addViaConsole() {
        String name = input.askStr("Enter name: ");
        store.add("Name: " + name);

        String age = input.askStr("Enter age: ");
        store.add("Age: " + age);
    }

    public void print() {
        System.out.println("=== All data ===");
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}