import java.util.*;
public class primePalindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        System.out.print("Enter starting range : ");
        int start=sc.nextInt();
        System.out.print("Enter ending range : ");
        int end=sc.nextInt();
        System.out.println("--------------------------------------------------------");
        System.out.println("\tPRIME PALINDROME NUMBERS FROM THE RANGE "+start+" - "+end);
        System.out.println("--------------------------------------------------------");
        for(int k=start;k<=end;k++){
            int num=k;

        /*-------------prime program-----------------------
        System.out.print("\t\t\t Enter the value : ");
        int num=sc.nextInt();*/
        boolean ans=true;
        if(num==0 || num==1){
            ans=false;
        }else{
            for(int i=2;i<num;i++){
                if(num%i==0){
                    ans=false;
                }
            }
            //---------------palindrome---------------
            if(k>99){
            if(ans){
                
                int rev=0,temp=k,pal_num=k;
                while(pal_num>0){
                    rev=rev*10+(pal_num%10);
                    pal_num/=10;
                }if(temp==rev){
                    
                    System.out.println("\t\t"+rev);
                }
            }}
            
        }

        }
        
    }
}
