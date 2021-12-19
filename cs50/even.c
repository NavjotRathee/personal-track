#include<stdio.h>
#include<cs50.h>

int main(void)
{
    int x = get_int("Enter the value: ");

    if(x%2==0)
    {
         printf("number is even\n");
    }
    else
    {
         printf("number is odd\n");
    }



}