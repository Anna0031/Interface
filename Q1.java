package Interface;

import java.util.Scanner;

interface shape{
	void getArea();
	void getPerimeter();
}

class Circle implements shape{
	
	int radius;
	int area;
	int perimeter;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void getArea() {
		
		System.out.println("Enter the radius of circle to calculate area");
		radius=scanner.nextInt();
		area=(int) (3.14*radius*radius);
		System.out.println("Area of circle is: "+area);
		
	}

	@Override
	public void getPerimeter() {
		
		System.out.println("Enter the radius of circle to calculate perimeter");
		radius=scanner.nextInt();
		perimeter=(int) (2*3.14*radius);
		System.out.println("Perimeter of circle is: "+perimeter);
		
	}
	
}

class Rectangle implements shape{
	
	float length;
	float width;
	float area;
	float perimeter;
	Scanner scanner = new Scanner(System.in);

		
	@Override
	public void getArea() {
		
		System.out.println("Enter the length of Rectangle");
		length=scanner.nextFloat();
		System.out.println("Enter the width of Rectangle");
		width=scanner.nextFloat();
		area=length*width;
		System.out.println("Area of Rectangle is "+area);
		
		
	}

	@Override
	public void getPerimeter() {
		
		System.out.println("Enter the length of Rectangle");
		length=scanner.nextFloat();
		System.out.println("Enter the width of Rectangle");
		width=scanner.nextFloat();
		perimeter=(2*(length+width));
		System.out.println("Perimeter of rectangle is "+perimeter);
		
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		
//		Circle cc = new Circle();
//		cc.getArea();
//		cc.getPerimeter();

		Rectangle rr = new Rectangle();
		rr.getArea();
		rr.getPerimeter();
	}

}