#include<stdio.h>

int main(void)
{
    int answer = 0;
    char chr;
    printf("%i", answer);
    //printf("or bhi krega?:");
    scanf("%c", &chr);

     if(chr=='n' || chr=='N')
    {
        printf("going to shutdown!");
    }
}