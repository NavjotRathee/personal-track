#include<stdio.h>
#include<cs50.h>

int main(void)
{


    int n=get_int("n:\n");
    switch (n)


    {
    case 5:
        printf("five,");
    case 4:
        printf("four,");
    case 3:
        printf("three,");
    case 2:
        printf("two,");
    case 1:
        printf("one,");
    }
}