package crochet;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AboutCrochet {
    private Scanner input = new Scanner(System.in);
    private List<Tool> tools;
    private List<Yarn> yarns;
    private List<Stitch> stitches;
    private List<Tips> tips;

    public AboutCrochet() {
        this.tools = ToolInitializer.initializeTools();
        this.yarns = YarnInitializer.initializeYarn();
        this.stitches = StitchInitializer.initializeStitches();
        this.tips = TipsInitializer.initializeTips();
    }

    public void aboutCrochet() {
        boolean exit = false;

        while (!exit) {
            System.out.println("****************************************");
            System.out.println("|              About Crochet           |");
            System.out.println("****************************************");
            System.out.println("  1. Crochet Tools");
            System.out.println("  2. Yarnology");
            System.out.println("  3. Stitch Library");
            System.out.println("  4. Tips and Tricks");
            System.out.println("----------------------------------------");
            System.out.println("  5. Exit");
            System.out.println("****************************************");
            System.out.println("  > Enter your choice (1-5): ");
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
                    crochetTools();
                    break;
                case 2:
                    yarnology();
                    break;
                case 3:
                    stitchLibrary();
                    break;
                case 4:
                    tipsAndTricks();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Please enter a valid choice from the menu.");
            }
            input.nextLine();
        }
        input.close();
    }

    public void crochetTools() {
        System.out.println("===============================================================================================");
        System.out.println("                             Welcome to the Crochet Tools & Materials");
        System.out.println("===============================================================================================");
        System.out.println("1. Hooks            2. Scissor              3. Stitch marker             4. Tapestry Needle");
        System.out.println("5. Measuring Tape   6. Yarn Winder          7. Safety Eyes & Nose        8. Stuffing (Polyfill)");
        System.out.println("9. Buttons          11. D-Ring or Buckle    10. Lobsters Claw or Hook              ");
        System.out.println("12. Keychain Ring (Metal Chain Links & Jump Rings)");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(" > Enter the number of the tool you want to learn ('0' to exit): ");

        int toolNumber = -1;

        try {
            toolNumber = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next(); //clear invalid input
            return;
        }
        if (toolNumber == 0) {
            return; //exit
        }
        else if (toolNumber >= 1 && toolNumber <= 12) {
            Tool tool = tools.get(toolNumber - 1);
            System.out.println("Tool/Material Name: " + tool.getName());
            System.out.println("Description: " + tool.getDescription());
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }

    public void yarnology() {
        System.out.println("====================================================================================");
        System.out.println("                               Welcome to the Yarn Library!");
        System.out.println("====================================================================================");
        System.out.println("    1. Cotton Yarn              2. Velvet Yarn               3. Indophil Yarn");
        System.out.println("    4. Chunky Yarn              5. Polyester Yarn            6. Acrylic Yarn");
        System.out.println("    7. Chenille Yarn            8. Mohair Yarn               9. T-Shirt Yarn");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(" > Enter the number of the stitch you want to learn ('0' to exit): ");

        int yarnNumber = -1;

        try {
            yarnNumber = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (yarnNumber == 0) {
            return;
        }
        else if (yarnNumber >= 1 && yarnNumber <= 9) {
            Yarn yarn = yarns.get(yarnNumber - 1);
            System.out.println("Yarn Name: " + yarn.getName());
            System.out.println("Description: " + yarn.getDescription());
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }

    public void stitchLibrary() {
        System.out.println("=======================================================================================");
        System.out.println("                              Welcome to the Stitch Library");
        System.out.println("=======================================================================================");
        System.out.println("Basic Stitches:");
        System.out.println("1. Chain Stitch             2. Slip Stitch                  3. Single Crochet");
        System.out.println("4. Half Double Crochet      5. Double Crochet               6. Treble Crochet");
        System.out.println("Intermediate Stitches:");
        System.out.println("7. Double Treble Crochet    8. Front Post Double Crochet    9. Back Post Double Crochet");
        System.out.println("10. Cluster Stitch          11. Shell Stitch                12. V-Stitch");
        System.out.println("13. Puff Stitch");
        System.out.println("Advanced Stitches:");
        System.out.println("14. Popcorn Stitch          15. Bobble Stitch               16. Spike Stitch");
        System.out.println("17. Catherine's Wheel       18. Star Stitch                 19. Crochet Cables");
        System.out.println("20. Basket Weave Stitch");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(" > Enter the number of the stitch you want to learn ('0' to exit): ");

        int stitchNumber = -1;

        try {
            stitchNumber = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (stitchNumber == 0) {
            return;
        }
        else if (stitchNumber >= 1 && stitchNumber <= 20) {
            Stitch stitch = stitches.get(stitchNumber - 1);
            System.out.println("Stitch Name: " + stitch.getName());
            System.out.println("Description: " + stitch.getDescription());
            System.out.println("Tutorial:\n" + stitch.getTutorial());
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }

    public void tipsAndTricks() {
        System.out.println("===============================================================================");
        System.out.println("                              Welcome to Tips & Tricks");
        System.out.println("===============================================================================");
        System.out.println("  1. Keep a Crochet Journal                 2. Practice Yarn Tension");
        System.out.println("  3. Blocking Your Work                     4. Learn Foundation Stitches");
        System.out.println("  5. Chain Loosely for Foundation Rows      6. Mind Your Edges");
        System.out.println("  7. Use a Yarn Bowl                        8. Practice Frogging");
        System.out.println("  9. Magic Circle                           10. Use Scraps for Smaller Projects");
        System.out.println("  11. Master the Invisible Decrease         12. Changing of Colors");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" > Enter the number of the stitch you want to learn ('0' to exit): ");

        int tipNumber = -1;

        try {
            tipNumber = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Please enter a valid choice from the list.");
            input.next();
            return;
        }

        if (tipNumber == 0) {
            return;
        }
        else if (tipNumber >= 1 && tipNumber <= 12) {
            Tips tips = tips.get(tipNumber - 1);
            System.out.println("Tip Name: " + tips.getName());
            System.out.println("Tip/Trick: " + tips.getTips());
        }
        else {
            System.out.println("Please enter a valid choice from the list.");
        }
    }
}
