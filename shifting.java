import java.util.*;
public class shifting {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.print("Enter the n value : "); 
       System.out.println("------------------------------------------------------------------------------------");
       int n=sc.nextInt();

       int[] a={2,3,4,5,6};//{3,4,}
       int[] b={11,22,33,44,55,66};

       System.out.println("Given array of a : "+Arrays.toString(a));
       System.out.println("Given array of b : "+Arrays.toString(b));
       System.out.println();
       System.out.println("------------------------------------------------------------------------------------");
       System.out.println();

       shifting_fun(a,b,n);
    }
    public static void shifting_fun(int[]a,int[]b,int n) {
        
        for(int k=1;k<=n;k++){
            int first=a[0];
            int last=b[b.length-1];
            for(int i=0;i<a.length-1;i++){
                a[i]=a[i+1];

            }
            a[a.length-1]=first;
            for(int j=b.length-1;j>0;j--){
                b[j]=b[j-1];
            }
            b[0]=last;
        }
        int [] rev_b=new int[b.length];
        for(int i=a.length,j=0;i>=0;i--,j++){
            rev_b[j]=b[i];
        }
        
        System.out.println("Shiftted array of a : "+Arrays.toString(a));
        System.out.println("Shiftted array of b : "+Arrays.toString(b));
        System.out.println("Reversed array of b : "+Arrays.toString(rev_b));
        System.out.println();

        int[] merged_arr=new int[a.length+b.length];
        for(int j=0;j<a.length;j++){
            merged_arr[j]=a[j];
        }
        int bcount=a.length;
        for(int l=0;l<rev_b.length;l++){
            merged_arr[bcount]=rev_b[l];
            bcount++;
        }
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Merged array of a and reversed b : "+Arrays.toString(merged_arr));
        System.out.println("------------------------------------------------------------------------------------");
    }
    
}
