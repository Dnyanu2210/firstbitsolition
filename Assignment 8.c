//Write a c program to input length and width of rectangle and fid its perimeter.

#include<stdio.h>

void main()
{
    int length,width,area,perimeter;
    length=10;
    width=20;
    area=length*width;
    perimeter=2*(length+width);
    printf("area is %d",area);
    printf("perimeter is %d",perimeter);

}