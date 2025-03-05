package DomShapes;


public class Square extends Shape {
    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    public double calcArea(){
        return sideA * sideA;
    }

    @Override
    public String toString() {
        return
                "квадрат " +  sideA + " см x " + sideA+ " см";
    }
}