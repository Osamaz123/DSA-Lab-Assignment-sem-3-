//Name: Osama Zaheer
//Faculty No.: 20COB110

/************Multiple Array************/
#include<stdio.h>
#include<stdlib.h>
#define n 5
int front[n] = {-1,-1,-1,-1,-1};
int rear[n] = {-1,-1,-1,-1,-1};
int pq[n][n]={
    
    {'_','_','_','_','_'},
    {'_','_','_','_','_'},
    {'_','_','_','_','_'},
    {'_','_','_','_','_'},
    {'_','_','_','_','_'}
    
};


void enque(){
    int temp;
    int pr;
    printf("Enter element to insert\n");
    scanf("%d",&temp);
    printf("Enter priority from range 1 to 5\n");
    scanf("%d",&pr);
    pr--;         
    if(rear[pr]==n-1){
    printf("Over flow\n");
    }
    else{
        if(rear[pr]==-1){
            front[pr]=0;
            rear[pr]=0;
        }else{
            rear[pr]++;
        
        }
        pq[pr][rear[pr]] =temp;
      
    } 
}
 void deque(){
    for(int i =0;i<n;i++){
        for(int j =0;j<n;j++){
            if(pq[i][j]!='_'){
               
                printf("%d is deleted!!\n",pq[i][j]);
                 pq[i][j]='_';
                 return;
            }
        }
    }
      printf("No element is to be deleted\n");
}
void display(){
    for(int i =0;i<n;i++){
        for(int j =0;j<n;j++){
            if(pq[i][j]=='_')printf("_ ");
            else printf("%d ",pq[i][j]);
        }
        printf("\n");
    }
    printf("\n");
}
int main(){
   
    int choice;
    int x;
while(1){
         
printf("1. Insert Element\n2. Delete Element\n3. Display Array\n4. Exit\n");

    printf("Enter your choice\n");
     scanf("%d",&choice);
     
     switch(choice){
         case 1:
         printf("Enter no of elements you wants to insert\n");
         scanf("%d",&x);
         for(int i=0;i<x;i++)
         enque();
         
         break;
         case 2:
         deque();
         break;
         case 3:
         display();
         break;
         case 4:
         exit(0);
         default:
         printf("Enter correct choice\n");
     }
     }
  
    
    return 0;
}
