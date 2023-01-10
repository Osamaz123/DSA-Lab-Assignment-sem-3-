//Name: Osama Zaheer
//Faculty No.: 20COB110

/***********Unordered Array************/

#include<stdio.h>
#include <stdlib.h>
#define N 10
int q[N];
int front = -1;
int rear = -1;

void enqeue(int x){
if(rear==N-1)      //Array is full
printf("Over flow\n");
else if (front==-1&&rear==-1)   //there is no element in the array
{
    front=rear =0;
    q[rear]=x;
}
else{
    rear++;
    q[rear]=x;
}

}
int DEqeue(){
    int item;
    if(front==-1&&rear==-1){
    printf("Under flow!!!!\n");
}
else if (front==0&&rear==0)
{
  int item = q[front];
  printf("Element deleted is %d and now queue is empty,\n",item);
  front--;
  rear--;
    
}

else{
    int i;
    int max =0;
    for(i=0;i<=rear;i++){
if(q[max]<q[i]){
    max = i;
 }
 }

     item = q[max];
     printf("\nElement deleted %d \n",q[max]);

        q[max] = q[rear];   
        rear = rear - 1;
        return item;
}
}
void display(){
    if(front==-1&&rear==-1){
    printf("Under flow!!!!\n");
}
 else{
     printf("Unordered Array -> ");
     for(int i =front;i<=rear;i++){
        printf("%d ",q[i]);
    }
    printf("\n");
}
}
int main(){
    int choice,x;
    while(1){
        printf("Enter your choice\n");
        printf("1 Insert the data in qeue\n2 Delete\n3 Display\n4 Exit\n");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
           printf("Enter the data to be added in queue :  ");
           scanf("%d",&x); 
           enqeue(x); 
            break;
         case 2:
         DEqeue();
         break;
         case 3:
         display();
         break;
         case 4:
         exit(0);
         default:
           printf("Incorrect choice\n");
        }
    }

}