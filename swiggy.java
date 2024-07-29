import java.util.Scanner;
class Swiggy{
    static Scanner sc =new Scanner(System.in);
    public static void main(String[]args)throws Exception{
        //------------------------------------------------------------HOTEL CHOOSING------------------------------------------------------------------
        Boolean hotel_choosing_loop=true;
        while (hotel_choosing_loop) {
            System.out.println("...........CHOOSE HOTEL..............");
            System.out.println("\n1.PARADISE\n2.ANJAPPAR\n3.A2B\n4.EXIT");
            System.out.print("ENTER HOTEL NUMBER : ");
            int hotel_choice=sc.nextInt();
            
            switch(hotel_choice){
                case 1:{
                    System.out.println("\t\t\tYOU ARE IN PARADISE HOTEL SWIGGY SITE");
                    Boolean repeating_loop=true;
        while(repeating_loop){
        //System.out.println("\t\t\tPARADICE SWIGGY SITE");
        System.out.println(".........SELECT THE DISH.........");
        System.out.println("\n1.VEG\n2.NON-VEG\n3.EXIT");
        System.out.print("ENTER DISH NUMBER : ");
        int dish_choice=sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);

        
        switch(dish_choice){
            case 1:{

                //-------------------------------------------------------------VEG MEALS PAGE---------------------------------------------------------------

                Boolean veg_repeating=true;
                while(veg_repeating){
                System.out.println("\t\t\tYOU CHOOSED VEG");
                System.out.println(".........VEG DISHES MENU...........");
                System.out.println("\n1.VEG BRIYANI\n2.VEG RICE\n3.EXIT");
                System.out.print("ENTER DISH NUMBER : ");
                int veg_choice=sc.nextInt();
                
                
                    switch (veg_choice) {
                        case 1:{
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\tVEG BRIYANI PRICE:"+80);
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 2:{
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            System.out.println("\t\t\tVEG RICE PRICE:"+90);
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 3:{
                            System.out.println("REDIRECTING TO MAIN PAGE...");
                            Thread.sleep(3000);
                            veg_repeating=false;
                            break;
                        }  
                        default:{
                            System.out.println("INVALID NON-VEG CHOICE");
                            break;}
                    }
                }

                break;}
            case 2:{

                //-----------------------------------------------------------------------NON-VEG PAGE------------------------------------------------------------

                Boolean non_veg_repeating=true;
                while(non_veg_repeating){
                System.out.println("\t\t\tYOU CHOOSED NON-VEG");
                System.out.println("ENTER THE CHOICE");
                System.out.println("\n1.MUTTON BRIYANI\n2.CHICKEN BRIYANI\n3.EXIT");
                int non_veg_choice=sc.nextInt();
                
                
                    switch (non_veg_choice) {
                        case 1:{
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            System.out.println("MUTTON BRIYANI PRICE:"+380);
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 2:{
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            System.out.println("CHICKEN BRIYANI PRICE:"+190);
                            System.out.println("---------------------------------------------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 3:{
                            System.out.println("REDIRECTING TO MAIN PAGE...");
                            Thread.sleep(3000);
                            non_veg_repeating=false;
                            break;
                        }  
                        default:{
                            System.out.println("INVALID NON-VEG CHOICE");
                            break;}
                    }
                }
                break;}
            case 3:{
                System.out.println("\t\tREDIRECTING TO HOTEL CHOOSEING PAGE...");
                Thread.sleep(3000);
                repeating_loop=false;
                break;}
            default:{
                System.out.println("INVALID CHOICE");
                break;
            }            
        }
    }  
                break;}
                    case 2:{
                        System.out.println("\t\t\t\t\tYOU ARE IN ANJAPPAR HOTEL SITE");
                        Boolean repeating_loop=true;
        while(repeating_loop){
        System.out.println("\t\t\tANJAPPAR SWIGGY SITE");
        System.out.println("SELECT THE DISH");
        System.out.println("\n1.VEG\n2.NON-VEG\n3.EXIT");
        int dish_choice=sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);

        
        switch(dish_choice){
            case 1:{

                //-------------------------------------------------------------VEG MEALS PAGE---------------------------------------------------------------

                Boolean veg_repeating=true;
                while(veg_repeating){
                System.out.println("\t\t\tYOU CHOOSED VEG");
                System.out.println("ENTER THE CHOICE");
                System.out.println("\n1.VEG BRIYANI\n2.VEG RICE\n3.EXIT");
                int veg_choice=sc.nextInt();
                
                
                    switch (veg_choice) {
                        case 1:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("\tVEG BRIYANI PRICE:"+80);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 2:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("VEG RICE PRICE:"+90);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 3:{
                            System.out.println("REDIRECTING TO MAIN PAGE...");
                            Thread.sleep(3000);
                            veg_repeating=false;
                            break;
                        }  
                        default:{
                            System.out.println("INVALID NON-VEG CHOICE");
                            break;}
                    }
                }

                break;}
            case 2:{

                //-----------------------------------------------------------------------NON-VEG PAGE------------------------------------------------------------

                Boolean non_veg_repeating=true;
                while(non_veg_repeating){
                System.out.println("\t\t\tYOU CHOOSED NON-VEG");
                System.out.println("ENTER THE CHOICE");
                System.out.println("\n1.MUTTON BRIYANI\n2.CHICKEN BRIYANI\n3.EXIT");
                int non_veg_choice=sc.nextInt();
                
                
                    switch (non_veg_choice) {
                        case 1:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("MUTTON BRIYANI PRICE:"+380);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 2:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("CHICKEN BRIYANI PRICE:"+190);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 3:{
                            System.out.println("REDIRECTING TO MAIN PAGE...");
                            Thread.sleep(3000);
                            non_veg_repeating=false;
                            break;
                        }  
                        default:{
                            System.out.println("INVALID NON-VEG CHOICE");
                            break;}
                    }
                }
                break;}
            case 3:{
                System.out.println("\t\tREDIRECTING TO HOTEL CHOOSEING PAGE...");
                Thread.sleep(3000);
                repeating_loop=false;
                break;}
            default:{
                System.out.println("INVALID CHOICE");
                break;
            }            
        }    
    }  
                    break;}
                
                    case 3:{
                        System.out.println("YOU ARE IN A2B HOTEL SITE");
                        Boolean repeating_loop=true;
        while(repeating_loop){
        System.out.println("\t\t\tA2B SWIGGY SITE");
        System.out.println("SELECT THE DISH");
        System.out.println("\n1.VEG\n2.NON-VEG\n3.EXIT");
        int dish_choice=sc.nextInt();
        System.out.println("Processing...");
        Thread.sleep(3000);

        
        switch(dish_choice){
            case 1:{

                //-------------------------------------------------------------VEG MEALS PAGE---------------------------------------------------------------

                Boolean veg_repeating=true;
                while(veg_repeating){
                System.out.println("\t\t\tYOU CHOOSED VEG");
                System.out.println("ENTER THE CHOICE");
                System.out.println("\n1.VEG BRIYANI\n2.VEG RICE\n3.EXIT");
                int veg_choice=sc.nextInt();
                
                
                    switch (veg_choice) {
                        case 1:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("VEG BRIYANI PRICE:"+80);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 2:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("VEG RICE PRICE:"+90);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 3:{
                            System.out.println("REDIRECTING TO MAIN PAGE...");
                            Thread.sleep(3000);
                            veg_repeating=false;
                            break;
                        }  
                        default:{
                            System.out.println("INVALID NON-VEG CHOICE");
                            break;}
                    }
                }

                break;}
            case 2:{

                //-----------------------------------------------------------------------NON-VEG PAGE------------------------------------------------------------

                Boolean non_veg_repeating=true;
                while(non_veg_repeating){
                System.out.println("\t\t\tYOU CHOOSED NON-VEG");
                System.out.println("ENTER THE CHOICE");
                System.out.println("\n1.MUTTON BRIYANI\n2.CHICKEN BRIYANI\n3.EXIT");
                int non_veg_choice=sc.nextInt();
                
                
                    switch (non_veg_choice) {
                        case 1:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("MUTTON BRIYANI PRICE:"+380);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 2:{
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println("CHICKEN BRIYANI PRICE:"+190);
                            System.out.println("--------------------------------------------------------------------");
                            //-------------------------------------------------------PAYMENT CODE------------------------------------------------------------
        
        System.out.println("..........PAYMENT METHODS..........\n1.CASH\n2.UPI\n3.CARD");
        System.out.print("ENTER PAYMENT CHOICE NUMBER : ");
        int payment_choice=sc.nextInt();

        switch(payment_choice){
            case 1:{
                System.out.println("call waiter and pay the bill");
                break;}
            case 2:{
                System.out.println("\t\t\t\tOTP GENARATING.....");
                int otp=(int)(Math.random()*999+999);
                Thread.sleep(1000);
                System.out.println("\t\t\t-------------------------------");
                System.out.println("\t\t\t\tGENERATED OTP : "+otp);
                System.out.println("\t\t\t-------------------------------");
                System.out.print("ENTER THE GENERATED OTP HERE FOR BILL PAYING : ");
                int user_otp=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(1500);
                if(user_otp==otp){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                
                break;}
            case 3:{
                int card_pin=1234;
                System.out.print("ENTER THE PIN NUMBER:");
                int user_card_pin=sc.nextInt();
                System.out.println("PROCESSING...");
                Thread.sleep(2000);
                if(user_card_pin==card_pin){
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION SUCCESS");
                    System.out.println("\t\t\t-------------------------------");
                }else{
                    System.out.println("\t\t\t-------------------------------");
                    System.out.println("\t\t\t\tTRANSACTION FAILED");
                    System.out.println("\t\t\t-------------------------------");
                }
                break;}
            default :{
                System.out.println("INVALID PAYMENT METHOD");
                break;}            
        }
                            break;}
                        case 3:{
                            System.out.println("REDIRECTING TO MAIN PAGE...");
                            Thread.sleep(3000);
                            non_veg_repeating=false;
                            break;
                        }  
                        default:{
                            System.out.println("INVALID NON-VEG CHOICE");
                            break;}
                    }
                }
                break;}
            case 3:{
                System.out.println("\t\tREDIRECTING TO HOTEL CHOOSEING PAGE...");
                Thread.sleep(3000);
                repeating_loop=false;
                break;}
            default:{
                System.out.println("INVALID CHOICE");
                break;
            }            
        }    
    }  
                        break;}
                    case 4:{
                        System.out.println("EXITING....");
                        hotel_choosing_loop=false;
                        break;}
                    default:{
                        System.out.println("INVALID INPUT");
                        break;}
                } 
        System.out.println("\t\t\tTHANK YOU...");    
        }
    
    }    
}