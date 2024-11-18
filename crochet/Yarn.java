package crochet;

import java.util.ArrayList;
import java.util.List;

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

class YarnInitializer {
    public static List<Yarn> initializeYarn() {
        List<Yarn> yarns = new ArrayList<>();
        yarns.add (new Yarn(
            "Cotton Yarn",
            "A soft, durable, and breathable natural fiber yarn with a smooth texture that showcases stitch definition.",
            "Typically works well with hooks 2.25 mm to 4.0 mm, depending on the thickness."
        ));
        yarns.add (new Yarn(
            "Velvet Yarn",
            "Luxurious and plush with a velvety feel, often slippery and hide stitches.",
            "Generally pairs well with hooks around 6.0 mm to 8.0 mm."
        ));
        yarns.add (new Yarn(
            "Indophil Yarn",
            "a cotton-polyester blend with vibrant colors and a smooth, lightweight texture.",
            "Typically works well with hooks 4.0 mm to 5.0 mm."
        ));
        yarns.add (new Yarn(
            "Chunky Yarn",
            "Thick and cozy, offering quick results and a soft cushy fabric.",
            "For a thicker yarn like this, 8.0 mm to 12.0 mm are usually best."
        ));
        yarns.add (new Yarn(
            "Polyester Yarn",
            "Strong and durable, resistant to wrinkles and shrinking, with a smooth finish.",
            "Typically works well with hooks 4.0 mm to 5.5 mm."
        ));
        yarns.add (new Yarn(
            "Acrylic Yarn",
            "Affordable and versatile, lightweight with wool-like feel and a wide color range.",
            "Typically works well with hooks 4.0 mm  to 6.5 mm."
        ));
        yarns.add (new Yarn(
            "Chenille Yarn",
            "Soft and fuzzy with a thick, velvety texture, creating cuddly feel.",
            "Typically works well with hooks 6.0 mm to 8.0 mm."
        ));
        yarns.add (new Yarn(
            "Mohair Yarn",
            "Silky and lightweight, known for its warmth and luxurious sheen.",
            "For a lightweight and fuzzy yarn like this, 2.5 mm to 3.5 mm are usually best."
        ));
        yarns.add (new Yarn(
            "T-Shirt Yarn",
            "Thich, eco-friendly yarn made from recycled T-shirts, offering a unique texture.",
            "For a bulky yarn like this, 10.0 mm to 15.0 mm are usually best."
        ));
        return yarns;
    }
}