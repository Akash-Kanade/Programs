class Shape
{
  double area()
  {
	return 0;
  }
}

class Circle extends Shape
{
 double area()
 {
	return Math.PI  * 5 * 5;
 }
  
}

class Rectangle extends Shape
{
	double area()
	{
		return 4 * 6;
	}
}

class Demo{
	public static void main(String[] args)
	{
		System.out.println(new Circle().area());
		
		System.out.println(new Rectangle().area());

	}
	
}