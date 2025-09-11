//Ask the user to enter marks. Then show the result based on these rules:
//If marks are more than 75 → show "Distinction"
//If marks are more than 65 → show "First Class"
//If marks are more than 55 → show "Second Class"
//If marks are 40 or more → show "Pass Class"
//If marks are less than 40 → show "Fail"

#include<stdio.h>

int main()
{
    int marks;
    printf("enter marks of student");
    scanf("%d",&marks);


    if(marks>=75)
    {
        printf("student is  pass with distinction");
    }
    else if(marks>=65)
    {
         printf("student is  pass with firstclass");
    }
    else if(marks>=55)
    {
          printf("student is  pass with second class");
    }
    else if(marks>=40)
    {
          printf("student is  pass with pass class");
    }
    else 
    {
       printf("student is fail");
    }
    
}  