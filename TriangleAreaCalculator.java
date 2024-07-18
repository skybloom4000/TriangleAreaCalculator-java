package java_methods;

import java.util.Scanner;

public class TriangleAreaCalculator {

    private double base;
    private double height;

    // Method to ask the user to enter the base and height of the triangle
    public void inputTriangleDimensions() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        this.base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        this.height = scanner.nextDouble();
    }

    // Method to compute the area of the triangle
    public double computeTriangleArea() {
        return 0.5 * this.base * this.height;
    }

    // Method to display the area of the triangle
    public void displayTriangleArea() {
        double area = computeTriangleArea();
        System.out.println("The area of the triangle is: " + area);
    }

    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.inputTriangleDimensions();
        calculator.displayTriangleArea();
    }
}

