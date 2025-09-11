//Find Sum of first and last digit of given number. Input: n = 12345 Output: 6 (1 + 5)


#include<stdio.h>

int main()
{
    int n=12345;
    int last, first;
    
    last=n%10;
    printf("last number:%d",last);
    while(n>=10)
    {
    n=n/10;
    }
    first=n;
     printf("\nfirst number %d",first);
    int sum=first+last;
    printf("\nSum of first and last digit of given number= %d",sum);


}
