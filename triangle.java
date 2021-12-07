package project1;

public class triangle {
	double base;
	double height;
	double hypotunuse;
	

	void area() {
		double Area;
		Area = base * height;
		
	System.out.println(+Area);
		
	}
	void perimeter() {
		double Perimeter;
		Perimeter = base + height + hypotunuse;
		System.out.println(+Perimeter);
	}

public static void main(String args[])
{
	triangle tri = new triangle();
	
	tri.base = 3;
	tri.height = 4;
	tri.hypotunuse = 5;
	System.out.println("base="  + tri.base);
	System.out.println("height="  + tri.height);
	System.out.println("hypotunuse="  + tri.hypotunuse);
	 tri.area();
	 tri.perimeter();
	 
	
}}
 