import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;
class Shape{
    public void area(){
        System.out.println("the area is");
    }
}
class square extends Shape{
    public void area(int l, int b){
        System.out.println (l*b);
    }
}
class rectangle extends square{
    public void area(int r){
        System.out.println(3.14*r);
    }
}
    public class Main{
    public static void main(String[] agr){
     square s1 = new square();

     rectangle r1= new rectangle();
        s1.area();
        s1.area(20,55);
     r1.area();
     r1.area(3);
    }

}