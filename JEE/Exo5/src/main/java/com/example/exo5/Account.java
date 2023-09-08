package com.example.exo5;

public class Account {
    private static Long count = 0L;
    private final Long id;
    private String username;
    private String password;

    public Account() {
        this.id = ++count;
    }

    public Account( String username, String password) {
        this.id = ++count;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" +id +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
