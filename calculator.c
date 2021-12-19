#include<stdio.h>

int main(void)
{
    int x,a,b;
    printf("1.add\n 2.subtract\n 3. divide\n 4. multiply\n");
    scanf("%i",&x);

    if (x==1)
    {
    scanf("%i", &a);
    scanf("%i", &b);
    printf("result: %d",(a+b));
    }
     else if (x==2)
    {
    scanf("%i", &a);
    scanf("%i", &b);
    printf("result: %d",(a-b));
    }
    else if (x==3)
    {
    scanf("%i", &a);
    scanf("%i", &b);
    printf("result: %d",(a/b));
    }
    else if (x==4)
    {
    scanf("%i", &a);
    scanf("%i", &b);
    printf("result: %d",(a*b));
    }
    else
    {
    printf("wrong input");
    }
}