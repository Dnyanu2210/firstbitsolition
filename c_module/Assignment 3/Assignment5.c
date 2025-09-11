//Check the given number is Armstrong number or not.. Input: n = 153 Output: Armstrong

#include<stdio.h>

int main()
{
    int n=153;
    int r1;
    int count=0;
    int i=1;
    int temp=n;
int sum=0;
    while(temp>0)
    {
    	count++;
    temp=temp/10;
    }
    temp=n;
    while(temp>0)
    {
    r1=temp%10;
    // sum=sum+res;
    int res=1;
    for(i=1;i<=count;i++)
    {
    //int res=1;
    res=res*r1;
    }
    sum=sum+res;
    temp=temp/10;
    }
    if(sum==n)
    {
    printf("no is armstrong");
    }
    else
    {
        printf("no not is armstrong");

    }

}
