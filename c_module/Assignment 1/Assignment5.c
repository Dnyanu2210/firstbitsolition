//Write a program to check whether a given character is vowel or consonant.

#include<stdio.h>

int main()
{
    char ch='a';
    if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
    {
        printf("character is vowel");
    }
    else
    {
        printf("character is consonant.");
    }
}