class Vehicle{
	String color = "Red";
	String company = "Toyota";
	
	void showDetails()
	{
		System.out.println(color + "" + company);
	}
}

class Car extends Vehicle
{	
	void showDetails()
	{
		System.out.println("Car "+color + " " + company);
	}
}

class MotorCycle extends Vehicle
{	
	void showDetails()
	{
		System.out.println("MotorCycle "+color + " " + company);
	}
}


class VehicleInheritance{
	public static void main(String[] args)
	{
		new Car().showDetails();
		new MotorCycle().showDetails();
		
	}
}