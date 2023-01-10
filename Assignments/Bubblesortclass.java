//Name: Osama zaheer
//Faculty No. : 20COB110

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort{
     private
    int a[] = new int[5];

    private void inputarray(){
        
        System.out.println("Enter the 5 elements of array");
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
             a[i] = sc.nextInt();
        }
    }
   
    public void bblsort(){
        inputarray();
        display();
        for(int i=0;i<5; i++){
            for(int j=1; j<5-i;j++) {
                if(a[j]<a[j-1]){
                swap(a,j,j-1);
            }
        } 
        } 
        System.out.println("Array after sorting"); 
    }
    public void display(){
        
        System.out.println(Arrays.toString(a));
}
    public void swap(int[] a, int f,int s){
int temp = a[f];
a[f]= a[s];
a[s]= temp;
    }
    
BubbleSort(){
            }
}

public class Bubblesortclass {
    
  public static void main(String[] args) {
    BubbleSort b1 = new BubbleSort();
    
    b1.bblsort();
    b1.display();
   
  }

}