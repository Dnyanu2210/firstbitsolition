//Find factorial of given number. Input: n = 5 Output: 120

#include<stdio.h>
int main()
{
    int n=5; //5!=5*4*3*2*1
    int fact=1;
  int i=n;
    while(i>1)
    {
        fact=fact*i;
        i--;
    }
    printf("%d",fact);
}
