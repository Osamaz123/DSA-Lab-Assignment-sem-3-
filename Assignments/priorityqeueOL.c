//Name: Osama Zaheer
//Faculty No.: 20COB110

/**********Ordered Linked list***********/
#include <stdio.h>
#include <stdlib.h>

struct node{
    int pnr;
    int info;
    struct node *link;
}
*front = NULL;

void display(){
    struct node*p;
    p =front;
 
    if(front ==NULL)
    printf("Queue is empty\n");
    else{
        
         printf("Queue of ordered Linkedlist: \n");
         printf("priority        Item\n");
         while(p!=NULL){
        
         printf("%5d         %5d\n",p->pnr,p->info);
         p=p->link;
        }
    }
}
void insert(int data,int pnr){
    struct node*temp,*q;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->info =data;
    temp->pnr=pnr;
 if(front==NULL||pnr<front->pnr){
    temp->link=front;
    front = temp;
}else{
    q= front;
    while(q->link!=NULL&&(q->link->pnr)<=pnr)
       q=q->link;
        temp->link=q->link;
        q->link=temp;
    
}
}

void delete(){
    struct node *temp;
    if(front==NULL){
        printf("Queue underflow\n");

    }
    else{
        temp =front;
        printf("Deleted item is %d\n",temp->info);
        front=front->link;
        free(temp);

    }
}

int main(){
    int choice,data,pnr;
   
    do{ 
        printf("Enter Your choice\n");
        printf("1 Insert the data in Queue\n2 Delete\n3 Display\n4 Exit\n");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
        printf("Enter the data to be added in queue :  ");
       scanf("%d",&data);
        printf("Enter its priority: ");
        scanf("%d",&pnr);
        insert(data,pnr);        
      break;
        case 2:
        delete();
        break;
        case 3:
        display();
        break;
        case 4:
        break;
        default:
           printf("Incorrect choice\n");
        }
    }while(choice!=4);
    
   return 0; 
}
