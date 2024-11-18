package crochet;

import java.util.ArrayList;
import java.util.List;

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

class StitchInitializer {
    public static List<Stitch> initializeStitches() {
        List<Stitch> stitches = new ArrayList<>();
        stitches.add (new Stitch(
            "Chain Stitch (ch)",
            "The foundation stitch used to begin most crochet projects.",
            "1. Start with a slip know on your hook." +
            "2. Yarn over by wrapping the yarn around the hook from back to front." +
            "3. Pull the yarn through the loop on the hook." +
            "4. Repeat until you have your desired number of chains."
        ));
        stitches.add (new Stitch(
            "Slip Stitch (sl st)",
            "A short, tight stitch often used for joining or finishing.",
            "1. Insert the hook into the stitch you want to slip stitch into." +
            "2. Yarn over and pull through both the stitch and the loop on your hook in one motion."
        ));
        stitches.add (new Stitch(
            "Single Crochet (sc)",
            "A simple creating a dense, firm fabric.",
            "1. Insert the hook into the next stitch." +
            "2. Yarn over and pull up a loop (you should have two loops on your hook)." +
            "3. Yarn over again and pull through both loops on the hook."
        ));
        stitches.add (new Stitch(
            "Half Double Crochet (hdc)",
            "Taller than a single crochet, with a softer texture.",
            "1. Yarn over, then insert the hook into the next stitch." +
            "2. Yarn over and pull up a loop (you should have three loops on your hook)" +
            "3. Yarn over again and pull through all three loops on the hook in one go."
        ));
        stitches.add (new Stitch(
            "Double Crochet (dc)",
            "Taller than a half double crochet, creating an open, flexibile fabric.",
            "1. Yarn over, then insert the hook into the next stitch." +
            "2. Yarn over again and pull up a loop (you should have three loops on your hook)." +
            "3. Yarn over and pull through the first two loops on the hook (you'll now have two loops left on the hook)." +
            "4. Yarn over again and pull through the remaining two loops."
        ));
        stitches.add (new Stitch(
            "Treble Crochet (tr)",
            "Or Triple Crochet, is a tall stitch providing an airy, open look.",
            "1. Yarn over twice, then insert the hook into the next stitch." +
            "2. Yarn over and pull up a loop (you should have four loops on your hook)." +
            "3. Yarn over and pull through the first two loops (you'll now have three loops left on the hook)." +
            "4. Yarn over again and pull through the next two loops (you'll now have two loops left on the hook)." +
            "5. Yarn over one last time and pull through the final two loops."
        ));
        stitches.add (new Stitch(
            "Double Treble Crochet (dtr)",
            "An even taller stitch with an open, lace-like effect.",
            "1. Yarn over three times." +
            "2. Insert the hook into the next stitch." +
            "3. Yarn over and pull up a loop (you should have five loops on the hook)." +
            "4. Yarn over and pull through the first two loops (you'll have four loops left)." +
            "5. Yarn over and pull through the next two loops (you'll now have three loops left)." +
            "6. Yarn over and pull throug the next two loops (you'll now have two loops left)." +
            "7. Yarn over and pull through the last two loops to complete the stitch."
        ));
        stitches.add (new Stitch(
            "Front Post Double Crochet (fpdc)",
            "A textured stitch worked around the post of a stitch.",
            "1. Yarn over, then insert the hook around the post of the next stitch (go in from the front, around the back of the post, and back to the front)." +
            "2. Yarn over and pull up a loop (three loops on the hook)." +
            "3. Yarn over and pull through the first two loops (two loops remain)" +
            "4. Yarn over again and pull through the remaining two loops."
        ));
        stitches.add (new Stitch(
            "Back Post Double Crochet (bpdc)",
            "Similar to FPdc but worked from the back for raised texture.",
            "1. Yarn over, then insert the hook around the post of the next stitch from the back (go in from the back, around the front of the post, and back out to the back)." +
            "2. Yarn over and pull up a loop (three loops on the hook)." +
            "3. Yarn over and pull through the first two loops (two loops remain)." +
            "4. Yarn over and pull through the remaining two loops."
        ));
        stitches.add (new Stitch(
            "Cluster Stitch",
            "A group of stitches worked together at the top, creating a thick texture.",
            "1. Yarn over, insert the hook into the next stitch, yarn over, and pull up a loop." +
            "Yarn over and pull through two loops (you'll have two loops left)." +
            "2. Repeat step 1, two or three more times, each time inserting the hook into the same stitch, until you have the desired number of loops (usually 4-5)." +
            "3. Yarn over and pull through all loops on the hook at once."
        ));
        stitches.add (new Stitch(
            "Shell Stitch",
            "A fan-like stitch formed by working multiple stitches into a single stitch.",
            "1. Work five double crochets (or another specified number) into the same stitch or space."
        ));
        stitches.add (new Stitch(
            "V-Stitch",
            "A V-shaped stitch created by working two double crochets in the same space.",
            "1. Work one double crochet, one chain, and another double crochet into the same stitch or space."
        ));
        stitches.add (new Stitch(
            "Puff Stitch",
            "A raised, rounded stitch made by drawing up loops multiple times.",
            "1. Yarn over, insert the hook into the stitch, yarn over, and pull up a loop (three loops on the hook)." +
            "2. Repeat step 1, three to five times (or as specified), pulling up a loop each time (you'll have multiple loops on the hook)." +
            "3. Yarn over and pull through all loops on the hook, then chain one to secure the puff."
        ));
        stitches.add (new Stitch(
            "Popcorn Stitch",
            "A 3D, textured stitch formed by grouping several stitches in one place.",
            "1. Work five double crochets in the same stitch." +
            "2. Remove your hook from the loop, insert it into the first dc of the five-dc group." +
            "3. Reinsert the hook into the dropped look and pull it through the first dc, closing the popcorn."
        ));
        stitches.add (new Stitch(
            "Bobble Stitch",
            "Similar to the puff stitch but denser, adding significant texture.",
            "1. Yarn over, insert the hook into the next stitch, yarn over, and pull up a loop." +
            "Yarn over and pull through two loops (two loops left)." +
            "2. Repeat step 1, three to four times (you should have 5-6 loops on the hook)." +
            "3. Yarn over and pull through all loops on the hook at once."
        ));
        stitches.add (new Stitch(
            "Spike Stitch",
            "Worked into stitches in rows below, creating an elongated effect.",
            "1. Insert the hook into a stitch one or more rows below the current row." +
            "2. Yarn over and pull up a loop to the height of the current row." +
            "3. Yarn over and pull through the both loops on the hook (if working a single crochet spike stitch)."
        ));
        stitches.add (new Stitch(
            "Catherine's Wheel",
            "A decorative stitch pattern that resembles wheels or circles.",
            "1. To start the wheel, work 5 double crochets in one stitch (this forms a shell)." +
            "2. Skip several stitches (usually 3-5 depending on pattern), single crochet to anchor." +
            "3. In the next stitch, skip the single crochet and work another shell stitch." +
            "4. Offset the shells in the next row to create the circular 'wheel' effect."
        ));
        stitches.add (new Stitch(
            "Star Stitch",
            "A decorative, intricate stitch that resembled stars or flowers.",
            "1. Insert the hook into the 2nd chain from the hook, yarn over, and pull up a loop." +
            "Repeat into the next four chains (you should have six loops on the hook)." +
            "2. Yarn over a pull through all six loops. Chain one to complete the first star." +
            "3. For subsequent stars, insert the hook into the eye of the last star and pull up a loop, repeating around the previous star."
        ));
        stitches.add (new Stitch(
            "Crochet Cables",
            "Raised stitches that create a cable effect, similar to knitted cables.",
            "1. Work FPDC stitches across selected stitches to create the look of cables." +
            "2. For crossing cables, skip stitches in front and then work FPDC behind, or work them in a twisted order."
        ));
        stitches.add (new Stitch(
            "Basket Weave Stitch",
            "Alternating front and back post stitches for a woven look.",
            "1. Work rows of alternating FPDC and BPDC stitches." +
            "2. After a few rows, switch the FPDC and BPDC positions to create the woven look."
        ));
        return stitches;
    }
}