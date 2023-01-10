//Name: Osama Zaheer
//Faculty No.: 20COB110
//Enrollment No.: GJ8966
//Class and S.No: A2CO-11
import java.util.Arrays;
public class nonrecursivemergsort {
    public static void main(String[] args) {
        int[] a ={12,1,17,20,4,5,0,1};
        System.out.println(("Array before sorting"));
        System.out.println(Arrays.toString(a));
        int[] temp =new int [a.length];
        int len =1;
        int l1;   
        int r1;
        int l2;
        int r2;
        while(len<a.length){
            int i=0;
            while(i<a.length){
                l1=i;
               r1=i+len-1;
               l2=i+len;
               r2= i+2*len-1;
               if(l2>=a.length)break;

               if(r2>=a.length){
                   r2=a.length-1;
               }
               temp = mergFunc(a, l1, r1, l2, r2);
               for(int j=0;j<r2-l1+1;j++){
                   a[i+j]=temp[j];
               }
               i=i+2*len;


            }
            len= 2*len;
           
         System.out.println("\nAfter coparing in each  "+len+" elements sized sub arrays: " + Arrays.toString(a) );
        }
        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(a));
    }
    static int[] mergFunc(int[] a,int l1,int r1, int l2,int r2){
        int[] temp= new int[a.length];
        int i =0;
        while(l1<=r1&&l2<=r2){
            if(a[l1]<=a[l2]){
                temp[i]=a[l1];
                i=i+1;
                l1=l1+1;
            }else{
temp[i]= a[l2];
i=i+1;
l2=l2+1;
            }
        }
        while(l1<=r1){
            temp[i]=a[l1];
            i=i+1;
            l1=l1+1;

        }
        while(l2<=r2){
            temp[i]=a[l2];
            i=i+1;
            l2=l2+1;

    }
        return temp;
}
    }

