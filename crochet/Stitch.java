package crochet;

public class Stitch {
    private String name;
    private String description;
    private String tutorial;

    public Stitch (String name, String description, String tutorial) {
        this.name = name;
        this.description = description;
        this.tutorial = tutorial;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTutorial() {
        return tutorial;
    }
}
