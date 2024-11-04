import java.util.Scanner;
class Circle
{
    private double radius;
    public Circle(double radius){
        // set the instance variable radius
        this.radius = radius;

    }
    public void setRadius(double radius){
        // set the radius
        this.radius = radius;


    }
    public double getRadius()    {
        // return the radius
        return this.radius;

    }
    public double calculateArea()  { // complete the below statement
        return Math.PI*radius*radius;

    }
    public double calculateCircumference()    {
        // complete the statement
        return  2*Math.PI*radius;
    }
}
class week41{
    public static void main(String[] args)  {
        int r;
        Scanner sc= new Scanner(System.in);
        r=sc.nextInt();
        Circle c= new Circle(r);
        System.out.println("Area = "+String.format("%.2f", c.calculateArea()));
        // invoke the calculatecircumference method
        System.out.println("Circumference = "+String.format("%.2f",c.calculateCircumference()));

    }
}
