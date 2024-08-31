package Qspiders_java.relationship.aggregation;
import java.util.Scanner;
public class MobileDriver {
	static Scanner sc=new Scanner(System.in);
	Sim s=new Sim("Bsnl","5G",999);
	Mobile m=new Mobile("oppo","8gb",19999,s);
	MobileDriver(){}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Mobile m=new Mobile();
		MobileDriver driver = new MobileDriver();
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\t\t\t WELCOME TO SIM DETECTOR ");
		System.out.println("------------------------------------------------------------------------------");
		boolean loop=true;
		do {
			System.out.println("******************************************************************************");
			System.out.println("1.Insert Sim\n2.Remove Sim\n3.Check sim present or not\n4.Details of Sim\n5.Insert Mobile Details\n6.Remove Mobile\n7.isMobilePresnt\n8.Details of Mobile\n9.Exit");
			System.out.println("******************************************************************************");
			System.out.print("Enter the option : ");
			int option=sc.nextInt();
			switch(option) {
			case 1:{
				if(driver.s==null) {
				System.out.print("Enter the sim name : ");
				String name=sc.next();
				System.out.print("Enter the network type(eg.3G/4G/5G) : ");
				String network=sc.next();
				System.out.print("Enter the recharge Amount : ");
				int rs=sc.nextInt();
				Sim s=new Sim(name,network,rs);
				driver.s=s;
				driver.m.insertSim(s);}
				else {
					System.out.println(driver.s.operator+" already present");
				}
				break;
				}
			case 2:{
				if(driver.s!=null) {
				driver.s=null;
				driver.m.removeSim();}
				else {
					System.out.println("Sim not found in the tray");
				}
				break;
				}
			case 3:{
				boolean simPresent = driver.m.isSimPresent();
				String res=(simPresent)?driver.s.operator+" sim present":"Sim not present";
				System.out.println(res);
				break;
				}
			case 4:{
				if(driver.s!=null) {
				driver.s.detailsOfSim();}
				else {
					System.out.println("First insert the sim");
				}
				break;
				}
			case 5:{
				if(driver.m==null) {
				System.out.print("Enter name of the Mobile : ");
				String mobileName=sc.next();
				System.out.print("Enter ram of the Mobile : ");
				String ram=sc.next();
				System.out.print("Enter price of the Mobile : ");
				double mobilePrice=sc.nextDouble();
			    driver.m=new Mobile(mobileName,ram,mobilePrice,driver.s);}
				else {
					System.out.println(driver.m.name+" mobile already present");
				}
				break;}
			case 6:{
				if(driver.m!=null) {
				System.out.println(driver.m.name+" mobile removed");
				driver.m=null;}
				else {
					System.out.println("Fisrt insert the mobile");
				}
				break;}
			case 7:{
				if(driver.m!=null) {
					System.out.println(driver.m.name+" present");
				}else {
					System.out.println("Mobile not found");
				}
				break;}
			case 8:{
				if(driver.m!=null) {
				driver.m.detailsOfMobile();}
				else {
					System.out.println("Fisrt insert the Mobile");
				}
				break;
				}
			case 9:{
				loop=false;
				System.out.println("Exiting.....");
				break;
				}
			}
		}
		while(loop);
	}
}
