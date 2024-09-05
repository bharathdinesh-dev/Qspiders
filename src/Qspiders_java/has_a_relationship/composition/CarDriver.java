package Qspiders_java.has_a_relationship.composition;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1=Car.getcarObj("bmw","white",9000000,Engine.getEngineObj("2stroke",4900));
		Car c2=Car.getcarObj("RR","Black",1900000,Engine.getEngineObj("4stroke",8900));
		System.out.println("*************************************");
		System.out.println(c1.getName());
		System.out.println(c1.getColor());
		System.out.println(c1.getPrice());
		System.out.println(c1.getOwner());
		System.out.println("*************************************");
		c1.getCarDetails();
		System.out.println("*************************************");
		System.out.println(c1.getE().getStroke());
		System.out.println(c1.getE().getHraPower());
		System.out.println("*************************************");
		c1.getE().getEngineDetails();
		System.out.println("*************************************");
		System.out.println("*************************************");
		System.out.println(c2.getName());
		System.out.println(c2.getColor());
		System.out.println(c2.getPrice());
		System.out.println(c2.getOwner());
		System.out.println("*************************************");
		c2.getCarDetails();
		System.out.println("*************************************");
		System.out.println(c2.getE().getStroke());
		System.out.println(c2.getE().getHraPower());
		System.out.println("*************************************");
		c2.getE().getEngineDetails();
	
	}

}
