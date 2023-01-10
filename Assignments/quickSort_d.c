//Name: Osama Zaheer
//Faculty No.: 20COB110

#include<stdio.h>
int n;
void swap(int arr[],int i,int j){
int t = arr[i];
arr[i]= arr[j];
arr[j]= t;
}
void printArray(int arr[],int n){
for(int i=0;i<n;i++){
    printf("%d ",arr[i]);

}
printf("\n");
}
int partition(int arr[],int lb,int ub){
    int mid =(lb+ub)/2;
    int pivote = arr[mid];
    int s =lb;
    int e = ub;
    
    while(s<mid&&e>mid){
        while(s<mid&&arr[s]<=pivote)
        s++;
        while(e>=mid&&arr[e]>pivote)
        e--;
        if(s<mid&&e>mid)
        swap(arr,s,e); 
   printArray(arr,n);
    }
    swap(arr,mid,e);
    return e;
    
}
void quickSort(int arr[],int lb,int ub){
    if(lb<ub){
      int p= partition(arr,lb,ub);
      quickSort(arr,lb,p-1);
      quickSort(arr,p+1,ub);
    }

}
int main(){
    
    int arr[30];
    printf("Enter the size of array: ");
    scanf("%d",&n); 
    printf("Enter the elements of array:\n");
    for(int i=0;i<n;i++){
    scanf("%d",&arr[i]);
}
printf("Unsorted array:\n");
printArray(arr,n);
printf("\n");
printf("Intermediate output\n");
quickSort(arr,0,n-1);
printf("Sorted Array:\n");
printArray(arr,n);


}