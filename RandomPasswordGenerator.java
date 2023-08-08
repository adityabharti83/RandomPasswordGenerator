import java.util.Random;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        // define the possible characters for the password
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        // create a random object
        Random random = new Random();
        // create a string builder to store the password
        StringBuilder password = new StringBuilder();
        // loop 8 times to generate 8 characters
        for (int i = 0; i < 8; i++) {
            // get a random index from 0 to chars.length() - 1
            int index = random.nextInt(chars.length());
            // append the character at that index to the password
            password.append(chars.charAt(index));
        }
        // print the password
        System.out.println("The random password is " + password);
    }
}
