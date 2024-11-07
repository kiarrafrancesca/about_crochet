package user;

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UserManager {
    private Scanner input = new Scanner(System.in);
    private String userData;

    public UserManager(String userData) {
        this.userData = userData;
    }

    @SuppressWarnings("deprecation")
    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public void pressReturn() {
        System.out.println("Press 'enter' to return.");
        input.nextLine();
        clearScreen();
    }

    public String setUsernameInput() {
        String username;

        while (true) {
            System.out.print("Enter a username: ");
            username = input.nextLine();
            if (username.equalsIgnoreCase("0")) return "0";
            if (username.length() >= 6) break;
            System.out.println("Username must be at least 6 characters long."); 
        }
        return username;
    }

    public boolean usernameExists(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader(userData))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.split(",")[0].trim().equals(username)) {
                    System.out.println("Username already exists.");
                    return true;
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public String setPasswordInput() {
        String password;

        while (true) {
            System.out.print("Enter a password: ");
            password = input.nextLine();
            if (password.length() >= 8) break;
            System.out.println("Password must be at least 8 characters long.");
        }
        return password;
    }

    public void saveUser(String username, String password) {
        try (FileWriter fileWriter = new FileWriter(userData, true)) {
            fileWriter.write(username + ", " + password);
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public boolean loadUser(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(userData))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.trim().split(", ", 2);
                if (parts.length == 2) {
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];
                    if (username.equals(storedUsername) && password.equals(storedPassword)) {
                        return true;
                    }
                }
            }
            return false;
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
