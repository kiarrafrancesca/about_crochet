package crochet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CrochetMenu {
    private Scanner input = new Scanner(System.in);
    private UserMenu userMenu = new UserMenu();
    private AboutCrochet aboutCrochet = new AboutCrochet();
    private Suggester suggester = new Suggester();
    private Pattern pattern = new Pattern();
    
    public void crochetMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("<------------------------->");
            System.out.println("|       Crochet Menu      |");
            System.out.println("+-------------------------+");
            System.out.println("| 1. User Menu            |");
            System.out.println("| 2. About Crochet        |");
            System.out.println("| 3. Suggester            |");
            System.out.println("| 4. Pattern              |");
            System.out.println("+-------------------------+");
            System.out.println("| 5. Log Out              |");
            System.out.println("<------------------------->");
            System.out.println("Enter your choice: ");
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
                    userMenu.userMenu();
                    break;
                case 2:
                    aboutCrochet.aboutCrochet();
                    break;
                case 3:
                    suggester.suggester();
                    break;
                case 4:
                    pattern.pattern();
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Please enter a valid choice from the menu.");
            }
            input.nextLine();
        }
        input.close();
    }
}
