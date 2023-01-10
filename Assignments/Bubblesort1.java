import java.util.Arrays;

public class Bubblesort1 {
    public static void main(String[] args) {
        int arr[] = {1,-9,98,-7,7,0,-3,12,75,90,-54,-54};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int [] arr){
        //run the steps n-1 times
        for(int i=0;i<arr.length; i++){

            //for each steps max item will come at the last respective index
            for(int j=1; j<arr.length-i;j++){
                //swap if the item is smaller than the previous one
                if(arr[j]<arr[j-1]){
                    swap(arr,j, j-1);
                    // int temp= arr[j];
                    // arr[j]= arr[j-1];
                    // arr[j-1]= temp;
                }
            }
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
            }
    
}
