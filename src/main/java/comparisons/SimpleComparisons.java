package comparisons;

public class SimpleComparisons {
    SimpleComparisons() {
        String starWars = "Star Wars";
        String starTrek = "Star Trek";
        String starWars2 = "Star Wars";

        if (starWars.equals(starTrek)) {
            System.out.println("Variables are equal!");
        } else {
            System.out.println("Variables are NOT equal!");
        }

        if (starWars.equals(starWars2)) {
            System.out.println("Variables are equal!");
        } else {
            System.out.println("Variables are NOT equal!");
        }

        if (starWars == starWars2) {
            System.out.println("Variables are equal!");
        } else {
            System.out.println("Variables are NOT equal!");
        }

        if ("Death Star" == "Death Star") {
            System.out.println("Variables are equal!");
        } else {
            System.out.println("Variables are NOT equal!");
        }
    }
}
