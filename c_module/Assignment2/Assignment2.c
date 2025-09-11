//Accept three sides of a triangle from the user and determine whether the triangle is equilateral, isosceles, or scalene.

#include<stdio.h>
int main()
{
    int a=10,b=9,c=10;
    if(a==b||b==c)
    {
        printf("triangle is equilateral");
    }
    else if (a==b||b==c||c==a)
    {
        printf("triangle is isosceles");
    }
    else
    {
        printf("triangle is scalene");
    }


}