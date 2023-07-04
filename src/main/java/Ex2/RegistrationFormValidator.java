package Ex2;

public class RegistrationFormValidator {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean validateUsername(String username) {
        return !username.trim().isEmpty();
    }

    public boolean validateEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }

    public boolean validatePassword(String password) {
        return password.length() >= 8;
    }

    public boolean validate(String username, String email, String password) {
        return validateUsername(username) && validateEmail(email) && validatePassword(password);
    }
}