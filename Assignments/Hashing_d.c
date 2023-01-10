//Name: Osama Zaheer
//Faculty No. 20COB110

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int A[50][5];                           

int hash(int k)
{
    return k % 47;
}

int search(int k)
{
    int loc = hash(k);
    int i = 0;
    while (A[loc][i] != -1 || i == 5)
    {
        if (A[loc][i] == k)
        {
            return i;
        }
        i++;
    }
    return -1;
}
int insert(int k)
{
    int cd = search(k);
    int loc = hash(k);
    int i = 0;
    if (cd == -1)
    {
        for(;i<5;)
        {
            if (A[loc][i] == -1)
            {
                A[loc][i] = k;
                return i;
            }
            i++;
        }
        printf("\nBucket overflow!\n");
    }
}

void delete(int k)
{
    int cd=search(k);
    int loc=hash(k);
    if(cd!=-1)
    {
        A[loc][cd]=-1;
        printf("\n %d is deleted from location [%d][%d]\n",k,loc,cd);
    }
    else
    {
        printf("Element not found!\n");
    }
}

void print()
{
    for(int i=0;i<50;i++)
    {
        for(int j=0;j<5;j++)
        {
            printf("%d ",A[i][j]);
        }
        printf("\n");
    }
}

int main()
{
    for (int i = 0; i < 50; i++)          
    {
        for (int j = 0; j < 5; j++)
        {
            A[i][j] = -1;
        }
    }
    int j = 0;
    srand(time(0));
    for (int i = 0; i < 40; i++)             {
        j = rand() % 1000;
        int loc=hash(j);
        int k=insert(j);
        printf("Element %d is inserted at location : [%d][%d] \n", i+1, loc,k);
    }
    print();                              
    delete(j);                           
    return 0;
}