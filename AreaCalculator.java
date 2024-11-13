// Write your name here

public class AreaCalculator {

    // Write your code here

    public static void main(String[] args) {
        // Circle
        double circleRadius = 5.0;
        double circleArea = area(circleRadius);
        System.out.println("Area of the circle: " + circleArea);

        // Rectangle
        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        double rectangleArea = area(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        // Trapezoid
        double trapezoidBase1 = 3.0;
        double trapezoidBase2 = 7.0;
        double trapezoidHeight = 5.0;
        double trapezoidArea = area(trapezoidBase1, trapezoidBase2, trapezoidHeight);
        System.out.println("Area of the trapezoid: " + trapezoidArea);
    }
}
