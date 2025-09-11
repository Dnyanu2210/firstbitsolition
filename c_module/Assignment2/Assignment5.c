//Accept the price from user. Ask the user if he is a student (user may say y or n). 
//If he is a student and he has purchased more than 500 than discount is 20% otherwise discount is 10%.
//But if he is not a student then if he has purchased more than 600 discount is 15% otherwise there is not discount.


#include<stdio.h>

int main()
{
    double price,totalprice;
    printf("enter the price");
    scanf("%lf",&price);
    printf("if he is a student enter y");
    char isstudent;
    scanf("%c",&isstudent);
    double discount;
    if(isstudent=='y')
    {
        if(price>500)
          discount=price*0.20;
        else
            discount=price*0.10;
    }
    else
    { 
        if(price>600)
          discount=price*0.15;

    
    }
    totalprice=price-discount;

    printf("total price is%2.lf",totalprice);
}
