
/* 3 класса геометрических фигур: круг (Circle), квадрат(Square) и прямоугольник (Rectangle).
У круга есть радиус, у квадрата и прямоугольника -стороны. В каждом классе должен быть метод
расчета площади фигуры calcArea().

*/

package DomShapes;

public class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double calcArea(){
        return 0;
    }


}
