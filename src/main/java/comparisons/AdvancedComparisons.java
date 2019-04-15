package comparisons;

public class AdvancedComparisons {
    AdvancedComparisons() {
        Car blueCar = new Car("blue");
        Car blueCar2 = new Car("blue");
        Car redCar = new Car("red");

        logEqualsMethodComparison(blueCar, blueCar2);
        logEqualsMethodComparison(blueCar, redCar);
        logEqualsMethodComparison(redCar, redCar);

        logEqualsOperatorComparison(blueCar, blueCar2);
        logEqualsOperatorComparison(blueCar, redCar);
        logEqualsOperatorComparison(redCar, redCar);
    }

    private <T> void logEqualsMethodComparison(T a, T b) {
        if (a.equals(b)) {
            System.out.println("Variables are equal!");
        } else {
            System.out.println("Variables are NOT equal!");
        }
    }

    private <T> void logEqualsOperatorComparison(T a, T b) {
        if (a == b) {
            System.out.println("Variables are equal!");
        } else {
            System.out.println("Variables are NOT equal!");
        }
    }

    private class Car {
        private String color;
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        Car(String color) {
            this.color = color;
        }
    }
}
