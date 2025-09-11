//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations.

#include<stdio.h>
 int main()
 {  
    int num1;
    int num2;
    char operator;
    int result;
    printf("enter first number");
    scanf("%d",&num1);
    printf("enter operators are +,-,*,/ ");
    scanf(" %c",&operator);
    printf("enter second number");
    scanf("%d",&num2);
    if(operator=='+')
    {
      result=num1+num2;
    }
    else if(operator=='-')
    {
     result=num1-num2;   
    }
   else if(operator=='*')
    {
      result=num1*num2;
    }
   else if(operator=='/')
    {
      result=num1/num2;
    }
   else if(operator=='%')
    {
       result=num1%num2;
    }
    printf("%d",result);
 }