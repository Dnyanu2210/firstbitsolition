//Check the given number is prime or not. Input: n = 7 Output: Prime

#include<stdio.h>
int main()
{
int i=2;
int no=3;
 int status=0;
while(i<=no/2)

{

if( no%i==0)
{   
status=1;
printf("no is not prime");
break;
}
i++;
}
if(status==0)
{
printf("no is prime");
}
return 0;
}
