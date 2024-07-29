
//--------------------------------------shift zeros to last--------------------------------

import java.util.*;
public class Rotation {
    public static void main(String[] args) {
        int [] a={2,0,0,4,0,0,8,1};
        int[] res=rotate(a);
        System.out.println(Arrays.toString(res));

    }
    public static int[] rotate(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
            if(a[j]==0){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }}
        }
        return a;
    }
}
