//Accept the age and check if the person is:
//Child (age < 12),Teenager (12to19),Adult (20to59),Senior (60 and above)

#include<stdio.h>

int main()
{
    int age;
    printf("enter age");
    scanf("%d",&age);

    if(age<12)
    {
        printf("child");
    }
    else if(age<19)
    {
        printf("teenager");
    }
    else if(age<59)
    {
        printf("Adult");
    }
    else if(age>=60)
    {
        printf("senior");
    }
}
