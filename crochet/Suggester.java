package crochet;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Random;

public class Suggester {
    private Scanner input = new Scanner(System.in);

    public void suggester() {
        boolean exit = false;

        while (!exit) {
            System.out.println("****************************************");
            System.out.println("|               Suggester              |");
            System.out.println("****************************************");
            System.out.println("  1. Palette Picker");
            System.out.println("  2. Project Ideas");
            System.out.println("----------------------------------------");
            System.out.println("  3. Exit");
            System.out.println("****************************************");
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

            input.nextLine();

            Suggester2 suggester = null;

            switch(choice) {
                case 1 -> suggester = new ColorSuggester();
                case 2 -> suggester = new ProjectSuggester();
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Please enter a valid choice from the menu.");
                continue;
            }

            if (suggester != null) {
            suggester.getSuggestion();
            }
        }
        input.close();
    }

    public abstract class Suggester2 {
        public abstract void getSuggestion();
    }

    public class ColorSuggester extends Suggester2 {
        private final Random random = new Random();

        @Override
        public void getSuggestion() {
            while (true) {
                System.out.print("Enter the number of color/s you want in the palette (1, 2, or 5): ");
                int numColor = 0;
    
                try {
                    numColor = Integer.parseInt(input.nextLine());
                    if (numColor != 1 && numColor != 2 && numColor != 5) {
                        System.out.println("Please enter 1, 2, or 5");
                        continue;
                    }
                }
                catch (NumberFormatException e) {
                    System.out.println("Please enter a valid choice from the list.");
                    continue;
                }

                // Loop to allow the user to see multiple suggestion for the chosen color count
                while (true) {
                    String suggestion = switch (numColor) {
                        case 1 -> getRandomOneColor();
                        case 2 -> getRandomTwoColors();
                        case 3 -> getRandomFiveColors();
                        default -> "No palette available for this.";
                    };

                    System.out.println("Suggested Palette: " + suggestion);
                    System.out.println("Press 'enter' for next palette or 'x' to return.");
                    String userInput = input.nextLine();

                    if (userInput.equalsIgnoreCase("x")) {
                        break; // Exit inner loop to allow choosing a different color count
                    }
                }
            }
        }

        private String getRandomOneColor() {
            String[] oneColor = {
                "Blushing Rose",
                "",
                "",
                "",
            };
            return oneColor[random.nextInt(oneColor.length)];
        }

        private String getRandomTwoColors() {
            String[] twoColor = {
                "",
                "",
                "",
                "",
            };
            return twoColor[random.nextInt(twoColor.length)];
        }

        private String getRandomFiveColors() {
            String[] fiveColor = {
                "",
                "",
                "",
                "",
            };
            return fiveColor[random.nextInt(fiveColor.length)];
        }
    }

    public class ProjectSuggester extends Suggester2 {
        @Override
        public void getSuggestion() {
            System.out.print("Enter the type of project you want (simple or big): ");
            String projectType = input.nextLine();

            String suggestion = switch (projectType.toLowerCase()) {
                case "" -> "";
                case "" -> "";
                case "" -> "";
                default -> "";
            };

            System.out.println(suggestion);
        }
    }
}
