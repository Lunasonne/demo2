package DomShapes;


public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "прямоугольникиииииииииииииии " + sideA + " см x " + sideB + " см";

    }
}

