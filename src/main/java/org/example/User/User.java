package org.example.User;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String bai5(User user) {
        if (user == null) throw new NullPointerException("User không tồn tại");
        return user.getName();
    }
}
