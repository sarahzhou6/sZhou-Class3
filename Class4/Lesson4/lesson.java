public class Lesson{
  public static void main (String[]args){
    /*
    String str = new String();
    Student student1 = new Student("Mike");
    System.out.println(student1.getName());
    Student student2 = new Student(80);
    System.out.println(student2.getGrade());
    */
    Circle circle1 = new Circle(3);
    Circle circle2 = new Circle("blue");
    System.out.println(circle1.getRadius());
    System.out.println(circle1.getArea());
    System.out.println(circle2.getPerimeter());
    System.out.println(circle2.getColor());
    System.out.println(circle1.setRadius());
    System.out.println(circle1);
  }
}
class Circle {
  int radius;
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
  public String toString(){
    return "radius:" + radius + "color:" + color;
  }
}


//int, char, boolean --> practice types
//str.length()
    // parenthesis means function
//OBJECTS VS INSTANCES
//Students
//Fruits
    // Apple, Pear
//Houses

//string str=new String ()
    // str --> instance of String

//class name
    // static properties (variables)
        // dynamic behaviors (functions)
//Student
    // int grade
    // string name
    // string classes
        // set grade
        // get grade
        // change classes
