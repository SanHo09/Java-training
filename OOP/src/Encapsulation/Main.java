package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Đăng ký tài khoản mật khẩu
        User user = new User("user1", "12345");

        // Log lên hệ thống là có user mới
        System.out.println("There a new user logon to system:");
        System.out.println(user.UserName);
        System.out.println(user.GetEncryptedPassword());
    }
}