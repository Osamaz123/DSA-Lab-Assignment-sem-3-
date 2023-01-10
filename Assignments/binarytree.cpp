//Name: Osama Zaheer
//Faculty No.: 20COB110

#include<bits/stdc++.h>   //includes every standard library
using namespace std;
#define MAX 1000
class seq_representation   //class for sequential representation
{
  public:
  int  tree[MAX];
  void initialize()
  {
   for(int i=1;i<=MAX;i++)
    {
     tree[i]=0;
    }
}
int findindex(int tree[])
{
    for(int i=MAX;i>=1;i--)
        if(tree[i]!=0)
        return i; 
}
int root(int r)
{
     if(tree[1] !=0)
        cout << "Tree had root already";
    else if(tree[1]==0)
        tree[1] = r;
    return 0;
}
void Create(int pLoc,char side,int value)
{

    if(side=='L'|| side=='l')
    {
        tree[2*pLoc]=value;
    }
    else if(side=='R'|| side=='r')
    {
        tree[2*pLoc+1]=value;
    }

}
void Display()
{
    for(int i=1;i<=MAX;i++)
    {
        if(tree[i]!=0)
        { 
          int checkR=0;
          int checkL=0;
            cout<<tree[i]<<" is at location "<<i<<"\n";
          if(tree[2*i]!=0)
            {  
                checkL=1;
                 cout<<"Left child is at location "<<2*i<<"\n";
            }
          if(tree[2*i+1]!=0)
            {
               checkR=1;
                cout<<"Right child is at location "<<2*i+1<<"\n";
            }
            if(checkR==0)
            {
                cout<<"No right child\n";
            }
            if(checkL==0)
            {
                cout<<"No left child\n";
            }
        }
    }
    cout<<"\n";
}
void Delete(int pos)
{
    
    if(tree[2*pos]==0 && tree[2*pos+1]==0)
    {
        tree[pos]=0;
    }
    else if(tree[2*pos]!=0 || tree[2*pos+1]!=0)
    {

            int findlastindex=findindex(tree);
            tree[pos]=tree[findlastindex];
            tree[findlastindex]=0;

    }

}
void Search(int v)
{
    int check=0;
    for(int i=1;i<=MAX;i++)
    {
        if(tree[i]==v)
        {  
            check=1;
            cout<<"Present at location "<< i<<"\n";
            if(i/2!=0)
            {
                cout<<"Parent at location "<< i/2<<"\n";
            }
            if(i/2==0)
            {
                 cout<<"This node is itself the root node of the binary tree\n";
            }

        }
    }
    if(check==0)
    {
        cout<<"Node with value "<<v <<" not found in binary tree\n";
    }

}
};


class linked_representation //class for linkedlist representation
{
 public:
 int tree2[MAX];
 int left[MAX];
 int right[MAX];
  void initializeL()
{
    for(int i=1;i<=MAX;i++)
    {
        tree2[i]=0;
        left[i]=0;
        right[i]=0;
    }

}
int findindexL(int tree2[])
{
    for(int i=MAX;i>=1;i--)
    if(tree2[i]!=0)
    return i;
        
    
}

int root2(int r)
{
     if(tree2[1] !=0)
        cout << "Tree already had root";
    else if(tree2[1]==0)
        tree2[1]=r;
        left[1]=2;
        right[1]=3;
    return 0;
}
void createL(int loc,char side,int val)
{
    if(side=='L'|| side=='l')
    {
        tree2[left[loc]]=val;
        left[left[loc]]=2*left[loc];
        right[left[loc]]=2*left[loc]+1;
    }
    else if(side=='R'|| side=='r')
    {
       tree2[right[loc]]=val;
       left[right[loc]]=2*right[loc];
        right[right[loc]]=2*right[loc]+1;
    }

}
void displayL()
{
    for(int i=1;i<=MAX;i++)
    {  if(tree2[i]!=0)
      {



        int checkR=0;
          int checkL=0;
            cout<<tree2[i] <<" is at location "<<i<<"\n";
          if(tree2[2*i]!=0)
            {  checkL=1;
                 cout<<"left child is at location "<<2*i<<"\n";
            }
          if(tree2[2*i+1]!=0)
            {
               checkR=1;
                cout<<" right child is at location "<<2*i+1<<"\n";
            }
            if(checkR==0)
            {
                cout<<"No right child\n";
            }
            if(checkL==0)
            {
                cout<<"No left child\n";
            }
      }
    }
    cout<<"\n";
}

void delete2(int pos)
{
     if(right[pos]==0 && left[pos]==0)
    {
        tree2[pos]=0;
    }
    else if(right[pos]!=0 || left[pos]!=0)
    {

            int findlastindex=findindexL(tree2);
            tree2[pos]=tree2[findlastindex];
            tree2[findlastindex]=0;

    }

}
void search2(int val)
{

    int check=0;
    for(int i=1;i<=MAX;i++)
    {
        if(tree2[i]==val)
        {  check=1;
            cout<<" present at location "<< i<<"\n";
            if(i/2!=0)
            {
                cout<<" parent  at location "<< i/2<<"\n";
            }
            if(i/2==0)
            {
                 cout<<"This node is itself the root node of the binary tree\n";
            }
        }
    }
    if(check==0)
    {
        cout<<"Node with value "<<val <<"not found in entire binary tree\n";
    }
}

};

int main()
{

    int rootvalue,choice,freq,c;
   cout<<"Enter choice 1 or 2\n";
   cout<<"1)Sequential representation\n";
   cout<<"2)Linked representation\n";
   cin>>choice;
   if(choice==1)
   {    
        seq_representation node;
          node.initialize();
          cout<<"Enter the root value\n";
          cin>>rootvalue;
           node.root(rootvalue);
            cout<<"Enter no of time you want to perform opertions \n";
            cin>>freq;
            while(freq--)
            {
                cout<<"Enter your choice \n";
          cout<<"1) create a node     2) delete a node       3) display       4) search a node \n";
          cin>>c;
          switch(c)
          {
          case 1 :

            int loc;
             char side;
             int val;
            cout<<"Enter the location of parent  node\n";
            cin>>loc;
            cout<<"Enter L for placing as left child and R as placing as right child\n";
             cin>>side;
             cout<<"Enter the value to be inserted in the node\n";
            cin>>val;
            node.Create(loc,side,val);
             break;
          case 2 :
              int pos;
              cout<<"Enter the position of node to be deleted\n";
              cin>>pos;
              node.Delete(pos);
            break;
          case 3:
           cout<<"Level wise binary tree is as follows:-\n";
              node.Display();
            break;
         case 4 :
          cout<<"Enter the value of node to search :-\n";
           cin>>val;
           node.Search(val);
           break;
        default :
        
           cout<<"Enter correct option please\n";
        }

            }

   }
   else if(choice==2)
   {

           int c;
           linked_representation node1;
          node1.initializeL();
          int freq;
          cout<<"Enter the root value of the binary tree\n";
          cin>>rootvalue;
           node1.root2(rootvalue);
            cout<<"Enter the no of times you want to perform opertion \n";
            cin>>freq;
            while(freq--)
            {
            cout<<"Enter the operation you want to perform \n";
          cout<<"1)For creating a node     2)For deleting a node \n         3)For displaying \n           4)For searching  node \n";
          cin>>c;
          switch(c)
          {
          case 1 :

           int loc;
             char side;
             int val;
            cout<<"Enter the location of parent in the node\n";
            cin>>loc;
            cout<<"Enter L for placing as left child and R as placing as right child\n";
             cin>>side;
             cout<<"Enter the value to be inserted in the node\n";
            cin>>val;
            node1.createL(loc,side,val);
            break;
          case 2 :
          
              int pos;
              cout<<"Enter the pos of node to be deleted\n";
              cin>>pos;
              node1.delete2(pos);
              break;
          case 3 :
           cout<<"Level wise binary tree is as follows:\n";
              node1.displayL();
            break;
         case 4 :
          cout<<"Enter the value of node to search :\n";
           cin>>val;
          node1.search2(val);
          break;
        default :
        
           cout<<"Enter correct option !!!\n";
        
      }

        }
   }
   else
   {
       cout<<"Enter the correct choice !!!\n";
   }

    return 0;

}
