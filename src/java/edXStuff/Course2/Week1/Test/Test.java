package edXStuff.Course2.Week1.Test;

public class Test{

    public static void main(String[] args){

        Circle circle = new Circle (3, "myCircle");

        System.out.println(circle.toString());

        System.out.println("My perimeter is: "+ circle.calculatePerimeter());

        System.out.println("My area is: " + circle.calculateArea());


  }

}
