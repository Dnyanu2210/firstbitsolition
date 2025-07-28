//Write a c program to input marks of five subject ,find the total marks,and calculate the percentage.

#include<stdio.h>

void main()
{

    int english=50;
    int maths=70;
    int history=70;
    int hindi=60;
    int physics=50;
   int total=english+maths+history+hindi+physics;
   
   printf("total marks %d",total);
   float percentage;
   percentage=(total/500.0)*100;
   printf("percentage %.2f",percentage);
}

