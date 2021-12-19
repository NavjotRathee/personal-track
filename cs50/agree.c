
#include<stdio.h>
int main(void)
{
    char c;
    scanf("%c", &c);

    if (c=='y' ||c=='Y')
    {
        printf("Agreed,\n");
    }
    else if (c=='n'||c=='N')
    {
        printf("Disagreed,\n");
    }
}
