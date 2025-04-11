import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

public class USERNAME {

    public static void authenticate(String username, String password) throws AuthenticationException {
        String validUsername = "admin";
        String validPassword = "password123";

        if (!username.equals(validUsername)) {
            throw new AuthenticationException("Invalid username!");
        } else if (!password.equals(validPassword)) {
            throw new AuthenticationException("Invalid password!");
        } else {
            System.out.println("✅ Authentication successful!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String user = scanner.nextLine();

            System.out.print("Enter password: ");
            String pass = scanner.nextLine();

            authenticate(user, pass);

        } catch (AuthenticationException e) {
            System.out.println("❌ Authentication failed: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
