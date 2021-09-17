package shapes;

public class Circle implements Shape{

    private double radius;


    public Circle(double radius) {
        if (radius >0)
            this.radius = radius;
        else System.out.println("radius can't be negative or zero");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >0)
            this.radius = radius;
        else System.out.println("radius can't be negative or zero");
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getParameter(){
        return 2*Math.PI*radius;
    }

}
