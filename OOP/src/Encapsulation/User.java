package Encapsulation;

import java.nio.charset.StandardCharsets;

public class User {
    public String UserName;
    private String Password;

    public User(String userName, String password) {
        UserName = userName;
        Password = password;
    }

    public String GetEncryptedPassword() {
        return this.Password.getBytes(StandardCharsets.UTF_8).toString();
    }
}
