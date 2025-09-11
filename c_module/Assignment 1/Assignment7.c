 //Calculating total salary based on basic. If basic <=5000 da, ta and hra will be 10%,20% and 25% respectively otherwise da, ta and hra will be 15%,25% and 30% respectively.
 
 
 #include<stdio.h>
int main()
{
    
 double bs=8000;
 double da,ta,hra;
 double total_salary;
 if(bs<=5000)
 {
  da=bs*0.10;
  ta=bs*0.20;
  hra=bs*0.25;

 }
 else{
    da=bs*0.15;
  ta=bs*0.25;
  hra=bs*0.30;
 }
 total_salary=bs+da+ta+hra;
 printf(" total salary %lf",total_salary);
}



