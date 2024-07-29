import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int[]a={2,3,2,4,5,6,4,7,5,8,6,9};
        int count=0;
        remove_duplicates(a,count);
    }
    public static void remove_duplicates(int[] a,int count){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]&&a[i]!=Integer.MIN_VALUE){
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
        }
        int[] c=new int[a.length-count];
        for(int i=0,j=0;i<a.length;i++){
            if(a[i]!=Integer.MIN_VALUE){
            c[j]=a[i];
            j++;}
        }
        System.out.println(Arrays.toString(c));
    }
}
