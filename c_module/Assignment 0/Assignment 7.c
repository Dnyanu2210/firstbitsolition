//Write a c program to convert minutes into hours and remaining minutes.
#include<stdio.h>

void main()
{
int min,hr;
min=160;
hr=min/60;
min=min%60;
printf(" %d hours",hr);
printf(" %d min",min);

}