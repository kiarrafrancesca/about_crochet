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
            int choice;

            try {
                choice = input.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice from the menu.");
                input.next();
                continue;
            }

            input.nextLine();

            Suggester2 suggester = switch (choice) {
                case 1 -> new ColorSuggester();
                case 2 -> new ProjectSuggester();
                case 3 -> {
                    System.out.println("Exiting...");
                    exit = true;
                    yield null;
                }
                default -> {
                    System.out.println("Please enter a valid choice from the menu.");
                    yield null;
                }
            };

            if (suggester != null) {
            suggester.getSuggestion();
            }
        }
    }

    public abstract class Suggester2 {
        public abstract void getSuggestion();
    }

    public class ColorSuggester extends Suggester2 {
        private final Random random = new Random();

        private class ColorPalette {
            private String name;
            private String description;
            private String hexCode;

            public ColorPalette(String name, String description, String hexCode) {
                this.name = name;
                this.description = description;
                this.hexCode = hexCode;
            }

            @Override
            public String toString() {
                return name + " (" + description + ") - Code: " + hexCode;
            }
        }

        @Override
        public void getSuggestion() {
            boolean exit = false;

            while (!exit) {
                System.out.println("============================================================");
                System.out.println("                    Welcome to Palette Idea!");
                System.out.println("============================================================");
                System.out.println(" 1. 1-color Palette");
                System.out.println(" 2. 2-color Palette");
                System.out.println(" 3. 5-color Palette");
                System.out.println("------------------------------------------------------------");
                System.out.println(" 4. Exit");
                System.out.println("============================================================");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter a valid choice from the menu.");
                    input.next();
                    continue;
                }

                switch (choice) {
                    case 1 -> displayPalettes(1);
                    case 2 -> displayPalettes(2);
                    case 3 -> displayPalettes(5);
                    case 4 -> exit = true;
                    default -> System.out.println("Please enter a valid choice from the menu.");
                }
            }
        }

        private void displayPalettes(int numColor) {
            // Loop to allow the user to see multiple suggestion for the chosen color count
            while (true) {
                String palette = switch (numColor) {
                    case 1 -> getRandomOneColor();
                    case 2 -> getRandomTwoColors();
                    case 5 -> getRandomFiveColors();
                    default -> "No palette available for this.";
                };

                System.out.println("Suggested Palette: ");
                System.out.println(palette);
                System.out.println("Press 'enter' for next palette or 'x' to return.");
                String userInput = input.nextLine();

                if (userInput.equalsIgnoreCase("x")) {
                    break; // Exit inner loop to allow choosing a different color count
                }
            }
        }

        private String getRandomOneColor() {
            List<ColorPalette> oneColor = List.of(
                new ColorPalette("Blushing Rose", "A warm, muted pink that evokes the gentle, soft hues of a rose at dusk, creating romantic and delicate ambiance", "B74F6F"),
                new ColorPalette("Lavender Mist", "A soft, pastel lavender that brings to mind a serene, mist-covered landscape at dawn, offering a calming and subtle presence", "ADBDFF"),
                new ColorPalette("Cocoa Truffle", "The rich, deep brown suggests the warmth and indulgence of dark chocolate, creating a luxurious and earthy feel", "35281D"),
                new ColorPalette("Sagebrush", "The soft, muted green evokes the earthy, calming tones of sage leaves, creating peaceful and natural ambiance", "648767"),
                new ColorPalette("Fresh Sprout", "The vibrant green evokes the lively and refreshing energy of new grwoth, symbolizing the rejuvenation of spring and the vitality of nature", "7CDF64"),
                new ColorPalette("Autumn Spice", "The rich, earthy orange evokes the warmth and vibrancy of fall, with hints of cinnamon and spice, creating a cozy, inviting atmosphere", "DA7635"),
                new ColorPalette("Burnt Sienna", "The rich, redding-brown hue evokes the warmth and depth of autumn leaves and natural earthy tones, adding a bold and cozy feel to any design", "A62639"),
                new ColorPalette("Violet Dream", "The soft yet vibrant purple evokes a sense of calm and mystery, reminiscent of a twilight sky or a dreamy, ethereal landscape", "AB81CD")
            );
            return oneColor.get(random.nextInt(oneColor.size())).toString();
        }

        private String getRandomTwoColors() {
            List<ColorPalette> twoColor = List.of(
                new ColorPalette("Midnight Glow", "The rich, dark blue represents the depth of the night sky while the soft, glowing white evokes the gentle light of stars or moonlight, creating a calm, serene contrast", "001F54, FEFCFB"),
                new ColorPalette("Dusky Rose", "The soft, cool blue evokes a serene twilight, while the warm, muted red adds depth and richness, creating a harmonious, vintage-inspired feel", "8ACDEA, 8C4843"),
                new ColorPalette("Golden Mocha", "The warm, sunny yellow paired with the rich, deep brown creates a balanced contrast, evoking the comforting allure of golden light over a steaming cup of coffee", "F2DD6E & 523A34"),
                new ColorPalette("Forest Bloom", "The rich, deep green symbolizes the dense of foliage of a thriving forest, while the vibrant lime green brings a lively burst of fresh growth, capturing the essence of nature's vitality", "386C0B, 38A700"),
                new ColorPalette("Silver Twilight", "The soft, muted gray-blue and light silvery hue evoke the calm and tranquil ambiance of a twilight sky, blending serenity with a touch of elegance", "767B91, C7CCDB"),
                new ColorPalette("Golden Sunrise", "The vibrant amber and soft golden yellow evoke the warmth and radiance of the rising sun, filling the scene with energy and optimism", "FFB627, FFC971"),
                new ColorPalette("Spiced Amber", "The deep, rich orange and warm, golden amber evoke the cozy, earthy tones of autumn spices, creating a bold and inviting feel reminiscent of a harvest celebration", "CC5803, E2711D"),
                new ColorPalette("Moss and Wood", "The deep, earthy green and warm, rich brown evoke the natural harmony of moss-covered tress and weathered wood, creating a grounded, rustic feel", "23231A, 6A5837")
            );
            return twoColor.get(random.nextInt(twoColor.size())).toString();
        }

        private String getRandomFiveColors() {
            List<ColorPalette> fiveColor = List.of(
                new ColorPalette("Vintage Velvet", "The rich, dark hues mixed with the soft pastels give it a luxurious, old-world feel, perfect for an elegant and timeless aesthetic", "2E0E02, 581908, 983628, E2AEDD, EBCBF4"),
                new ColorPalette("Rustic Rose Garden", "The blend of soft pinks, warm neutrals, and earth greens evokes the charm of a blooming garden with a rustic twist, offering a cozy and natural feel", "FAB3A9, C6AD94, 7FB285, 463239, ED6B86"),
                new ColorPalette("Desert Sunset", "The deep browns, warm terracottas, and soft sandy tones combine to reflect the color of a sunlit desert landscape, capturing an earthy yet serene atmosphere", "4F3130, 753742, AA5042, D8BD8A, D8D78F"),
                new ColorPalette("Spring Meadow", "The light, fresh blues and greens evoke the feeling of a vibrant, blooming meadow in the early days of spring, filles with new growth and clear skies", "CFFCFF, AAEFDF, 9EE37D, 63C132, 358600"),
                new ColorPalette("Ocean Depths", "The deep blues and aquas evoke the vastness and mystery of the ocean, while the soft, creamy white adds a hint of light and contrast, reminiscent of waves breaking on the shore", "0A1128, 001F54, 034078, 1282A2, FEFCFB"),
                new ColorPalette("Autumn Fireside", "The warm, earthy tones of golden amber, deep browns, and spicy oranges come together to evoke the cozy, comforting feel of a crackling fire on a cool autumn evening, with hints of soft mossy greens and the glow of falling leaves", "DB995A, 654236, D6D4A0, DA7635, E24E1B"),
                new ColorPalette("Crimson Ember", "The rich, dark tones transitioning to fiery reds evoke the intensity and warmth of glowing embers, creating a dramatic and passionate atmosphere reminiscent of a roaring hearth or a smoldering sunset", "250902, 38040E, 640D14, 800E13, AD2831"),
                new ColorPalette("Cerulean Cascade", "The gradient of soft sky blues to deep royal indigos captures the dynamic flow of cascading water, evoking a sense of serenity, energy, and depth inspired by the beauty of clear streams and open skies", "ADD7F6, 87BFFF, 3F8EFC, 2667FF, 3B28CC")
            );
            return fiveColor.get(random.nextInt(fiveColor.size())).toString();
        }
    }

    public class ProjectSuggester extends Suggester2 {
        private final Random random = new Random();

        private class ProjectIdea {
            private String name;
            private String description;
            private String yarnSuggestion;
            private String design;

            public ProjectIdea(String name, String description, String yarnSuggestion, String design) {
                this.name = name;
                this.description = description;
                this.yarnSuggestion = yarnSuggestion;
                this.design = design;
            }

            @Override
            public String toString() {
                return "Project: " + name + "\n" +
                        "Description: " + description + "\n" +
                        "Yarn Suggestion: " + yarnSuggestion + "\n" +
                        "Design: " + design + "\n"''

            }
        }

        @Override
        public void getSuggestion() {
            boolean exit = false;

            while (!exit) {
                System.out.println("============================================================");
                System.out.println("                    Welcome to Project Idea!");
                System.out.println("============================================================");
                System.out.println(" 1. Simple Projects");
                System.out.println(" 2. Big Projects");
                System.out.println("------------------------------------------------------------");
                System.out.println(" 3. Exit");
                System.out.println("============================================================");
                System.out.print("Enter your choice: ");

                int choice;
                try {
                    choice = input.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Please enter a valid choice from the menu.");
                    input.next();
                    continue;
                }

                switch (choice) {
                    case 1 -> displaySimpleProjects();
                    case 2 -> displayBigProjects();
                    case 3 -> exit = true;
                    default -> System.out.println("Please enter a valid choice from the menu.");
                }
            }
        }

        private void displaySimpleProjects() {
            List<ProjectIdea> simpleProjects = List.of(
                new Project("Keychain"),
                new Project("Bookmark"),
                new Project("Coin Purse"),
                new Project("Headband"),
                new Project("Hairclip"),
                new Project("Coaster"),
                new Project("Pouch"),
                new Project(""),
                new Project(""),
            );
            suggestProjects(simpleProjects);
        }

        private void displayBigProjects() {
            List<ProjectIdea> bigProjects = List.of(
                new Project(),
                new Project(),
                new Project(),
                new Project(),
                new Project(),
                new Project(),
                new Project(),
                new Project(),
                new Project(),
            );
            suggestProjects(bigProjects);
        }

        private void suggestProjects(List<Projects> projects) {
            while (true) {
                Project project = projects.get(random.nextInt(projects.size()));
                System.out.println("Suggested Project:");
                System.out.println(projects);
                System.out.println("Press 'enter for another suggestion or 'x' to return to the menu.");
                String userInput = input.nextLine();

                if (userInput.equalsIgnoreCase("x")) {
                    break;
                }
            }
        }
    }
}
