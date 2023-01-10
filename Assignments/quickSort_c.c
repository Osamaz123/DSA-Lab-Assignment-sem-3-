//Name: Osama Zaheer
//Faculty No.: 20COB110

#include<stdio.h>
#include<stdlib.h>

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
int partitionR(int arr[],int p, int r){
int pIndex= p + rand()%(r-p+1);

int pivote;
int i= p-1;
int j;
pivote= arr[pIndex];
swap(arr,pIndex,r);
for(j=p;j<r;j++){
    if(arr[j]<pivote){
        i++;
        swap(arr,i,j);
    }
    printf("pivote element is:%d--> ",pivote);
    printArray(arr,n);
}
swap(arr,i+1,r);
return i+1;

}
void quickSort(int arr[],int p,int q)
{
   int j;
    if(p<q)
    {
      j=partitionR(arr,p,q);
      quickSort(arr,p,j-1);
      quickSort(arr,j+1,q);
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
printf("Intermediate output\n");
quickSort(arr,0,n-1);
printf("Sorted Array:\n");
printArray(arr,n);
}