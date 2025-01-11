import workshop.PasswordGenerator;

public class App {
    public static void main(String[] args) {
        int passwordLength = 12;
        PasswordGenerator passwordGenerator = new PasswordGenerator();
        String generatedPassword = passwordGenerator.generatePassword(passwordLength);
        System.out.println("Згенерований пароль: " + generatedPassword);
    }
}
