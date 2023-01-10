//Name: Osama Zaheer
//Faculty No. 20COB110

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int A[50];

int hash(int k)
{
    return k % 47;
}

int search(int k)
{
    int loc = hash(k);
    int i = 0;
    while (A[loc] != -1)
    {
        if (A[loc] == k)
        {
            return loc;
        }
        loc = hash(loc + i * i);
        i++;
    }
    return -1;
}

void insert(int k)
{
    int cd = search(k);
    int loc = hash(k);
    int probes = 0;
    int i = 0;
    if (cd == -1)
    {
        while (A[loc] != -1)
        {
            loc = hash(loc + i * i);
            i++;
            probes++;
        }
        if (A[loc] == -1)
        {
            A[loc] = k;
            printf("key %d is inserted at location %d after %d collision \n", k, loc, probes);
        }
    }
    else
    {
        printf("key %d already inserted\n",k);
        return;
    }
}

void delete (int k)
{
    int cd = search(k);
    if (cd != -1)
    {
        A[cd] = -2;
        printf("%d is deleted from location : %d\n", k, cd);
    }
    else
    {
        printf("Element not found!\n");
    }
}

void print()
{
    for (int i = 0; i < 50; i++)
    {
        printf("%d, ", A[i]);
    }
    printf("\n");
}

int main()
{
    for (int i = 0; i < 50; i++) 
    {
        A[i] = -1;
    }
    print();
    int x = -1;
    srand(time(0));
    for (int i = 0; i < 40; i++) 
    {
        x = rand() % 1000;
        printf("%d) ", i + 1);
        insert(x);
    }
    print();
    delete (x);
    return 0;
}