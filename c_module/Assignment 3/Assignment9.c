//Check the given number is Palindrome number or not. Input: n = 121 Output: Palindrome

#include<stdio.h>

int main()
{
    int n=121;
    int r1;
    int temp=n;
    
    int rev=0;
    while(n>0)
    {
    r1=n%10;
    rev=rev*10+r1;
    n=n/10;
   // printf("%d ",rev);
    }
    if(temp==rev)
    {
    printf("no is palindrome");
    }
    else
    {
        printf("no is not palindrome");

    }

}
