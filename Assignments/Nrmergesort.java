import java.util.Arrays;
class MergeSorts
{
 public static void merge(int [] a,int iLeft, int iMiddle, int iRight,int[] tmp)
   {
      int i, j, k;

      i = iLeft;
      j = iMiddle;
      k = iLeft;  

      while ( i < iMiddle || j < iRight )
      {
         if ( i < iMiddle && j < iRight )
         {  // Both array have elements                            
          
            if ( a[i] < a[j] )
               tmp[k++] = a[i++];
            else
               tmp[k++] = a[j++];
         }
         else if ( i == iMiddle )
            tmp[k++] = a[j++];     // a is empty
         else if ( j == iRight )
            tmp[k++] = a[i++];     // b is empty
      }
      
   }

   public static void sort(int [] a,int[] tmp)
   {
      int size;

      for ( size = 1; size < a.length; size = 2*size )
      {
        // Combine sections of array a of size "size"
         int i;

         for ( i = 0; i < a.length; i = i + 2*size )
         {
            int left, middle, right;

	    left = i;
	    middle = i+ size;
	    right  = i + 2*size;

            merge( a, left, middle, right, tmp );

         }
        

         
	    for ( i = 0; i < a.length; i++ )
            a[i] = tmp[i];

       	 System.out.println("\nAfter "+size+" iter: " + Arrays.toString(a) );
      }
   }
}

public class Nrmergesort {
    public static void main(String[] args) {
       int[] a = {6, 3,41,12,0,15,17,23} ;
       int[]tmp = new int[a.length];
  
        System.out.println("Before sort:  " + Arrays.toString(a) );
  
        MergeSorts.sort( a,tmp );  // Merge sort
  
        System.out.println("\nAfter sort:   " + Arrays.toString(a) );
    
    }
}
