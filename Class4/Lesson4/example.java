public class Example {
  CircleC1 = newCircle(4);
  System.out.println(C1.toString());
}
public String toString(){
  return "radius:" + radius + "color" + color;
}
class Circle {
  private int radius;

  class Circle {
    private int radius;
    String color;
    double perimeter;
    double area;
    public Circle(int r){
      radius = r;
    }
    public Circle(String c){
      color = c;
    }
    public int getRadius(){
      return radius;
    }
    public double getArea(){
      area= radius*radius*Math.PI;
      return area;
    }
    public double getPerimeter(){
      perimeter= radius*2*Math.PI;
      return perimeter;
    }
    public String getColor(){
      return color;
    }
    public int setRadius(){
      return radius;
    }
  }

}
