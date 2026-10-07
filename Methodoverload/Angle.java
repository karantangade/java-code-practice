// Question 17: Write a Java program to implement an Area Calculator using Method Overloading.
// Create a class AreaCalculator and overload method area():
// - area(int side) => Calculate area of square
// - area(int length, int breadth) => Calculate area of rectangle
// - area(int base, int height, int type) => Calculate area of triangle

package Methodoverload;

class Ang{
    public void Area(int side){
        System.out.println("Area of Square is : "+side*side);
    }
    public void Area(int len ,int breath){
        System.out.println("Area of Rectangle  is : "+len*breath);
    }
    public void Area(int base ,int hieght ,int type){
        System.out.println("Area of Triangle is : " + ((base * hieght) / 2));;
    }
}

public class Angle {
    public static void main(String[] args) {
        Ang pd=new Ang();
        pd.Area(2);
        pd.Area(2, 3);
        pd.Area(3,4, 5);
    }
}
