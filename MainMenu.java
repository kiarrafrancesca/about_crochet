import java.util.InputMismatchException;
import java.util.Scanner;
import user.User;

public class MainMenu {
    private Scanner input = new Scanner(System.in);
    private User user = new User();

    public void mainMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("***********************************");
            System.out.println("|             Main Menu           |");
            System.out.println("***********************************");
            System.out.println("  1. Sign Up");
            System.out.println("  2. Log In");
            System.out.println("-----------------------------------");
            System.out.println("  3. Exit");
            System.out.println("***********************************");
            System.out.println("  > Enter your choice (1-3): ");
            int choice = 0;

            try {
                choice = input.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice from the menu.");
                input.next();
                continue;
            }

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
            input.nextLine();
        }
        input.close();
    }
}