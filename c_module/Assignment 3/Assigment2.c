//Print table for given number. Input: n = 5 Output: 5 10 15 20 25 30 35 40 45 50


#include<stdio.h>

int main()
{
    int no=5;
    int i=1;
    int table;
    printf("table of 5 is");
    while(i<=10)
    {
        table=no*i;
        printf(" %d ",table);
        i++;
    }

}