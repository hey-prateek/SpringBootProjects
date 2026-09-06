import java.util.function.Predicate;

public class code5_PasswordCheck {
    public static void main(String[] args) {
        Predicate<String> isValidLength = pwd -> pwd.length() >= 8;
        Predicate<String> hasDigit      = pwd -> pwd.chars().anyMatch(Character::isDigit);
        Predicate<String> hasSpecial    = pwd -> pwd.chars().anyMatch(ch -> "!@#$%^&*()-_=+[]{}|;:'\",.<>?/".indexOf(ch) != -1);

        Predicate<String> isValidPassword = isValidLength.and(hasDigit).and(hasSpecial);

        String password = "Pass@123";

        System.out.println(isValidPassword.test(password) ? "Valid Password" : "Invalid Password");
    }
}
