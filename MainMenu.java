import java.io.IOException;
import java.util.Scanner;
import user.User;

public class MainMenu {
    private Scanner input = new Scanner(System.in);
    private User user = new User();

    public void mainMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("<---------------------->");
            System.out.println("|       Main Menu      |");
            System.out.println("+----------------------+");
            System.out.println("| 1. Sign Up           |");
            System.out.println("| 2. Log In            |");
            System.out.println("+----------------------+");
            System.out.println("| 3. Exit              |");
            System.out.println("<---------------------->");
            System.out.print(" Enter your choice: ");
            int choice = input.nextInt();

            switch(choice) {
                case 1:
                    user.signUp();
                    break;
                case 2:
                    user.logIn();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid choice from the menu.");
            }
            input.close();
        }
    }

    public void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }
        catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
