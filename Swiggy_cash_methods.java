import java.util.Scanner;
public class Swiggy_cash_methods {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)throws Exception {

        //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\tGENERATED OTP:"+otp);
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("TRANSACTION SUCCESS");
                }else{
                    System.out.println("TRANSACTION FAILED");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("TRANSACTION SUCCESS");
                }else{
                    System.out.println("TRANSACTION FAILED");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }

    }
    

}
