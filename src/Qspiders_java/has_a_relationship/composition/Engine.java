package Qspiders_java.relationship;

public class Engine {
	//states
	private String stroke;
	private int hrs_power;
	
	//constructor
	private Engine() {}
	
	private Engine(String stroke,int hrs_power) {
		
		this.stroke=stroke;
		this.hrs_power=hrs_power;
	}
	//methods
	private void engineDetails() {
		System.out.println("\t\tDetails of the Engine");
		System.out.println("Engine stroke : "+stroke);
		System.out.println("Engine hrsPower : "+hrs_power);
	}
	
	//helper Methods
	public String getStroke() {
		return stroke;
	}
	public int getHraPower() {
		return hrs_power;
	}
	
	public static Engine getEngineObj() {
		return new Engine();
	}
	public static Engine getEngineObj(String stroke,int hrs_power) {
		return new Engine(stroke,hrs_power);
	}
	
	public void getEngineDetails() {
		 engineDetails();
	}
	
	
}
