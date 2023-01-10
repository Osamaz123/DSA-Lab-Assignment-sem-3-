//Name: Osama Zaheer
//Faculty No. 20COB110
//Enrollment No. GJ8966

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

struct Node{
    char data;
    struct Node *link;
}*top=NULL, *postS= NULL;

void insertPostfx(char c){
    struct Node *a, *b;
    b = (struct Node *)malloc(sizeof(struct Node));
    b->link =NULL;
    b->data=c;
    a =postS;
    if(postS==NULL){
        postS=b;
    }else{
        while(a->link!=NULL)
        a=a->link;
        a->link=b;
    }
}
void push(char c){
struct Node *tmp;
tmp =(struct Node*)malloc(sizeof(struct Node));
if(tmp ==NULL)
printf("Stack overflow\n");
else{
    tmp->data = c;
    tmp->link = top;
    top=tmp;
}
}
char pop(){
struct Node *tmp;
char c;
if(top==NULL){
printf("Stack is empty\n");
return 0;
}
else{
    tmp =top;
    top = top->link;
    c = tmp->data;
    free(tmp);
    tmp = NULL;
    return c;
}

}

void displaypost()    //To display elements un the output stack
{
    struct Node *d;
    if(postS==NULL){
        printf("Stack overflow!!!");
    }else{ 
    d= postS;
    while(d!=NULL){
        printf("%c",d->data);
        d=d->link;
    }
    }
}

int precedence(char c)   //To check precedence of operator
{
if(c =='^')
return 4;
else if(c=='/'||c== '*')
return(3);
else if(c== '+'||c=='-')
return (2);
else
return (1);
}
void inTopost(char infix[]){
    int l;
    int i=0;
    char symbol, temp;
   l = strlen(infix);            //length of infix expression
   printf("Output Stack: \n");
   while(l>i){
       symbol = infix[i];
       switch(symbol){
           case '(':
           push(symbol);
       
           break;
           case ')':
           temp = pop();
       
           while(temp!='(')
           {
               insertPostfx(temp);
               temp = pop();
               displaypost();       
               printf("\n");

            }
             break;
             case '^':
             case '*':
             case '/':
             case '+':
             case '-':
             if(top ==NULL){
               push(symbol);
               displaypost();       
               printf("\n");
            }
           else{
               while(top!=NULL &&(precedence(top->data)>=precedence(symbol))){
                   temp = pop(); 
                   insertPostfx(temp);
                   displaypost();       
                   printf("\n");

               }
               push(symbol);
               displaypost();       
               printf("\n");
           }
           break;
           default:
        
           insertPostfx(symbol);
           displaypost();       
           printf("\n");
       }
       i++;
   }
   while(top!=NULL){
       temp = pop();
       insertPostfx(temp);
   }
  
   return;

}
int main(){
  char infix[30];
  printf("Enter the infix expression: ");
  gets(infix);               //To store the infix expression
  
  inTopost(infix);
   printf("\nFinal postfix Expression is: ");
   displaypost();
 
  return 0;
}