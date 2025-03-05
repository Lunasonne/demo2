package DomShapes;
/* создать List из нескольких разных фигур и посчитать суммарную площадь всех фигур в List
•	Напишите  метод,  есть ли заданная фигура в List
•	Написать метод, который формирует List из фигур, с площадью больше, чем заданное значение */

 import java.util.ArrayList;

public class MainShape {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Circle1",3.0);
        Circle circle2 = new Circle("Circle2", 7.0);

        Square square1 = new Square("Square1", 8.1);
        Square square2 = new Square("Square2", 5.0);

        Rectangle rectangle1 = new Rectangle("Rectangle1", 3.0, 5.0);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 10.0, 12.0);

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);

        double summ = 0;

        for (Shape item : shapes) {
            summ += item.calcArea();
        }
        String formatted = String.format("%.2f", summ);
        System.out.println("суммарная площадь всех фигур составляет: " + formatted + "кв.см");


        Circle circle3 = new Circle("Circle3", 4);

        for (Shape findShapes : shapes) {
            if (circle3.equals(findShapes)) {
                System.out.println("искомая фигура имеется");
                break;
            } else {
                System.out.println("искомая фигура не имеется");
                break;
            }
        }

   int  value = 100;
    ArrayList<Shape> maxArea  = new ArrayList<>();

        for (Shape shape : shapes) {
            double currentShape = shape.calcArea();

            if (value < currentShape) {
                maxArea.add(shape);
            }
        }
        System.out.println(" с площадью, больше, чем " +  value +" кв. см: "+ maxArea);
        System.out.println("1111111111 ");

}

}