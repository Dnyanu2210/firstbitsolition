//Check the given number is Perfect number or not. Input: n = 28 Output: Perfect


#include<stdio.h>
int main()

{
    int num=102,sum=0,i;
    for(i=1;i<num;i++)
    {
        if(num%i==0)
        {
            sum=sum+i;
        }
    }    
        if(sum==num)
        {
         printf("no is perfect");
        } 
}