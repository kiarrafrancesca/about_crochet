package crochet;

public class Yarn {
    private String name;
    private String description;
    private String hookSize;

    public Yarn(String name, String description, String hookSize) {
        this.name = name;
        this.description = description;
        this.hookSize = hookSize;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getHookSize() {
        return hookSize;
    }
}
