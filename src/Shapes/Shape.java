package Shapes;

abstract class Shape {
    protected String color="red";
    protected boolean filled=true;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    protected abstract double getArea();
    protected abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color" + color + "filled" +filled ;
    }

}
class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {

        return super.toString()+"Radius:"+radius;
    }
}
class  Rectangle extends Shape{
    protected double length;
    protected double width;

    public Rectangle(double length , double width){

    }
    public double getLength(){
        return  length;
    }

    public double setLength(double length) {
        this.length = length;
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double setWidth(double width) {
        this.width = width;
        return width;
    }
    @Override
    public double getArea(){
        return length * width ;
    }
    @Override
    public double getPerimeter(){
        return 2 *(length * width) ;
    }

    @Override
    public String toString() {

        return super.toString()+"length" + length +"width:" + width;
    }
}
class Square extends Rectangle{
    protected double slide;

    public Square(double slide ,double length, double width, String color, boolean filled) {
        super(length, width);
    }

    public  double getSlide(){
        return slide;
    }
    public void setSlide(double slide){
        this.slide=slide;
    }

    @Override
    public double setWidth(double width) {
        return width;
    }

    @Override
    public double setLength(double length) {
        return length;
    }

    @Override
    public String toString() {
        return super.toString()+ "slide:" + slide;
    }
}
class Main{
    public static void main(String[] args) {
        Circle cir = new Circle (1.0);
        Rectangle rec = new Rectangle(1.0 ,1.0);
        System.out.println("Circle:");
        System.out.println("Area: " + cir.getArea());
        System.out.println("Perimeter: " + cir.getPerimeter());


        System.out.println("\nRectangle:");
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());
    }
}

