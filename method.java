import java.util.*;
public class method {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)throws Exception{
        hotelChoosing();

        }

    public static void hotelChoosing(){
        System.out.println("...........CHOOSE HOTEL..............");
        System.out.println("\n1.PARADISE\n2.ANJAPPAR\n3.A2B\n4.EXIT");
        System.out.print("ENTER HOTEL NUMBER : ");
        int hotel_choice=sc.nextInt();
        switch(hotel_choice){
            case 1:
                System.out.println("\t\t\tYOU ARE IN PARADISE HOTEL SWIGGY SITE");
                dishChoosing();
                break;
                
            case 2:
                System.out.println("\t\t\t\t\tYOU ARE IN ANJAPPAR HOTEL SITE");
                dishChoosing();
                break;
                  
            case 3:
                System.out.println("\t\t\t\t\tYOU ARE IN A2B HOTEL SITE");
                dishChoosing();
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("invalid choice");
                break;
        }
    }


    public static void dishChoosing(){
        System.out.println(".........SELECT THE DISH.........");
        System.out.println("\n1.VEG\n2.NON-VEG\n3.EXIT");
        System.out.print("ENTER DISH NUMBER : ");
        int dish_choice=sc.nextInt();
        

        switch(dish_choice){
            case 1:
                System.out.println("\t\t\tYOU CHOOSED VEG");
                System.out.println(".........VEG DISHES MENU...........");
                System.out.println("\n1.VEG BRIYANI\n2.VEG RICE\n3.EXIT");
                System.out.print("ENTER DISH NUMBER : ");
                int veg_choice=sc.nextInt();
                break;
        
        

    }}
}
