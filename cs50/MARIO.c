#include<stdio.h>
#include<cs50.h>
int main(void)

{

    int x=get_int("Height:");
    draw height;
    
  
    {
    for(int i=1;i<=x;i++)
    {
        for(int j=1;j<=x-i;j++)
        printf(" ");

        for(int k=1;k<=i;k++)
        printf("#");


        printf(" ");

        for(int k=1;k<=i;k++)
        printf("#");

        printf("\n");


    }
}

}