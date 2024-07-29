import java.util.*;
public class string_program {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        //special character counting
        /*
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){

            }else if(ch[i]>='A' && ch[i]<='Z'){

            }else if(ch[i]>='0' && ch[i]<='9'){

            }else {
                count++;
            }
        }
        System.out.println(count);*/

        //palindrome

        /*String res="";
        for(int i=ch.length-1;i>=0;i--){
            res+=ch[i];
        }
        if(s.equalsIgnoreCase(res))
        {
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }*/

        //input=AbCdE output=aBcDe

        /*String ans="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i] <='z'){
                char res=(char)(ch[i]-32);
                ans+=res;
            }else if(ch[i]>='A' && ch[i]<='Z'){
                char res=(char)(ch[i]+32);
                ans+=res;
            }
        }System.out.println(ans);*/

        //input=biriyani output=barayana

        /*for(int i=0;i<s.length();i++){
            if(ch[i]=='i'){
             ch[i]='a';   
            }
        }System.out.println(ch);*/

        // count uppercase and lower case
        
        /*int lower_case_count=0,upper_case_count=0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                lower_case_count++;
            }else if(ch[i]<='Z' && ch[i]>='A'){
                upper_case_count++;
            }
        }
        System.out.println("lower case :"+lower_case_count);
        System.out.println("upper case :"+upper_case_count);*/

        //sum the numbers in the string

       /* int sum=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='0' && ch[i]<='9'){
                sum+=ch[i]-48;
            }
        }System.out.println(sum); */

        //count the reapeated charactor 'a'

       /* int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                count++;
            }

        }System.out.println(count);*/ 

        

    }
    
}