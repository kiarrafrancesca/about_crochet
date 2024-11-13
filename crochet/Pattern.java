package crochet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pattern {
    public void pattern() {
        Scanner input = new Scanner(System.in);
        PatternManager manager = new PatternManager(); // Pattern management

        System.out.println("Choose a project to learn: ");
        for (ProjectType type : ProjectType.valyes()) {
            System.out.println(type);
        }

        // Ask the user for a project type by name
        String choice = input.nextLine().toUpperCase();
        ProjectType selectedProjectType = null;
        
        try {
            selectedProjectType = ProjectType.valueOf(choice);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Please choose a valid project type.");
            return;
        }
    
        // Ask for a free or premium pattern
        System.out.println("Do you wish to view the free or premium patterns?: ");
        String patternChoice = input.nextLine().toLowerCase();
        boolean isPremium = patternChoice.equals("premium");

        // Get the patterns of the selected type and choice
        List<Pattern> selectedPatterns = manager.getPatternsByType(selectedProjectType, isPremium);

        if (selectedPatterns.isEmpty()) {
            System.out.println("No patterns found for this selection.");
            return;
        }

        // Display patterns
        System.out.println("Patterns for " + selectedPatterns + ":");
        for (Pattern pattern : selectedPatterns) {
            pattern.displayInfo();
        }
    }

    public class PatternManager {
        private List<Pattern> patterns;

        public PatternManager() {
            patterns = new ArrayList<>();
            patterns.add(new FreePattern("Flower Hat", ProjectType.HAT));
        }

        public List<Pattern> getPatternsByType(ProjectType projectType, boolean isPremium) {
            List<Pattern> result = new ArrayList<>();
            for (Pattern pattern : patterns) {
                if (pattern.getProjectType() == projectType) {
                    if (isPremium && pattern instanceof PremiumPattern) {
                        result.add(pattern);
                    }
                    else if (!isPremium && pattern instanceof FreePattern) {
                        result.add(pattern);
                    }
                }
            }
            return result;
        }
    }

    public class ProjectPattern {
        private String name;
        private ProjectType projectType;

        public Pattern(String name, ProjectType projectType) {
            this.name = name;
            this.projectType = projectType;
        }

        public String getName() {
            return name;
        }

        public ProjectType getProjectType() {
            return projectType;
        }

        public void displayInfo() {
            System.out.println(name + " - Project Type: " + projectType);
        }
    }

    public class FreePattern extends ProjectPattern {
        public FreePattern(String name, ProjectType projectType) {
            super(name, projectType);
        }

        @Override
        public void displayInfo() {
            System.out.println(getName() + " (Free) - Project Type: " + getProjectType());
        }
    }

    public class PremiumPattern extends ProjectPattern {
        private boolean highQuality;

        public PremiumPattern(String name, ProjectType projectType, boolean highQuality) {
            super(name, projectType);
            this.highQuality = highQuality;
        }

        @Override
        public void displayInfo() {
            String quality = highQuality ? "High Quality" : "Standard Quality";
            System.out.println(getName() + " (Premium) - Project Type: " + getProjectType);
        }
    }
}
