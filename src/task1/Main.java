package task1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Area();

        System.out.println("Rectangle area: " + String.format("%.2f", shape.rectangleArea(5.75, 2.25)));
        System.out.println("Circle area: " + String.format("%.2f", shape.circleArea(2.25)));
        System.out.println("Square area: " + String.format("%.2f", shape.squareArea(5.75)));
    }
}
