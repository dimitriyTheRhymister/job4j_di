package ru.job4j.di;

public class StartUI {
    private final Store store;
    private final ConsoleInput input;

    public StartUI(Store store, ConsoleInput input) {
        this.store = store;
        this.input = input;
    }

    // Метод для добавления имени (без запроса возраста)
    public void add(String value) {
        store.add(value);
    }

    // Метод для добавления через консоль
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