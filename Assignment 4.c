//Write a c program to swap two numbers using a temporary third variable.


#include<stdio.h>

void main()
{
    int a,b,c;
    a=10,b=20;
    c=a;
    a=b;
    b=c;
    printf("value of a and b after swapping%d %d",a,b);
}