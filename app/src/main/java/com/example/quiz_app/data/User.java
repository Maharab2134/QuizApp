package com.example.quiz_app.data;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {

    @ColumnInfo(name = "username")
    private final String username;

    @NonNull
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "email")
    private final String email;

    @ColumnInfo(name = "password")
    private String password;

    public User(String username, @NonNull String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
