public class Circle
{
   private double radius;
   private String color ;
   Circle()
   {
       radius = 1.0;
       color = "red";
   }
    Circle(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI*getRadius()*getRadius();
    }
}
