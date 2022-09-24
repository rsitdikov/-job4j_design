package ru.job4j.generic;

public class User extends Base {
    private String name;

    public User(String id, String name) {
        super(id);
        this.name = name;
    }

    public String getId() {
        return super.getId();
    }

    public String getName() {
        return name;
    }
}
