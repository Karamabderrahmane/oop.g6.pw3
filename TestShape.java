
public class TestShape {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(9,4) ;

        //Rectangle
        System.out.println("Rectangle's area: " + r1.getArea() + "\nRectangle's permiter: " + r1.getPermiter());

        Circle c1 = new Circle(8) ;

        //Circle
        System.out.printf("Circle's area: %.2f\nCircle's permiter: %.2f", c1.getArea() , c1.getPermiter());

    }
}