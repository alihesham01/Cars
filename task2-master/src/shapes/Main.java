package shapes;

public class Main {

    public static void displayShape(Shape s){
        System.out.println(s.getShapeName()  +
                " area: " + s.getArea() +
                " parameter: " + s.getParameter());
    }

    public static void main(String[] args){

        Circle c1 = new Circle(5);
        Square s1 = new Square(4);
        displayShape(c1);
        displayShape(s1);

    }
}
