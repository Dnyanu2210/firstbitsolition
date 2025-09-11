//Write a program to check whether a given year is a leap year.

#include<stdio.h>
int main()


{
    int year=2001;

    if(year%4==0 && year%100!=0 || year%400==0)
    {
        printf("the year is leap year");
    }
    else
    {
        printf("the year is not leap year.");

    }
}