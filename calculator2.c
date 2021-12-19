#include<stdio.h>

int main(void)
{
    int x,a,b, answer;

    printf("1.add\n 2.subtract\n 3. divide\n 4. multiply\n");
    scanf("%i",&x);
    scanf("%i", &a);
    scanf("%i", &b);

    switch(x)
    {
        case 1 :answer= a+b;
        break;

        case 2 : answer= a-b;
        break;
        case 3 : answer= a/b;
        break;

        case 4 : answer= a*b;
        break;

        default : printf("na karun!");
        break;
    }
    printf("%i\n", answer);
}