package shapes;

public class Square implements Shape{
 private double side;

    public Square(double side) {
        if (side >0)
            this.side = side;
        else System.out.println("side can't be negative or zero");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side >0)
            this.side = side;
        else System.out.println("side can't be negative or zero");
    }

    @Override
    public String getShapeName() {
        return "Sqaure";
    }

    @Override
    public double getArea(){
        return side*side;
    }

    @Override
    public double getParameter(){
        return side*4;
    }
}
