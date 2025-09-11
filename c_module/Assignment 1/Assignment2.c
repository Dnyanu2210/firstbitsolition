// Write a c program to check given 3 digit number is palindrome or not.

#include<stdio.h>

int main()
{
    int a=101;
    int r1=a%10;
    int b2=a/10;
    int r2=b2%10;
    int r3=b2/10;
    int rev=r1*100+r2*10+r3;
    if(a==rev)  // palindrome means given number is equal to the reverse of that number.
    { 
        printf("no is palindrome");
    }
    else
    {
        printf("no is not palindrome");
    }


}