#include<stdio.h>
/* print fahr-cel table
0,20,....300*/
int main()
{
    {printf("'Temperature Table'\n");
    printf("celsius\tfahr\n");
}

    int fahr;
    int celsius;
    int lower, upper, step;
    lower=0;
    upper=100;
    step=10;

    celsius=lower;
    while( celsius<=upper)
    {
    fahr=9*(celsius+32)/5;
    printf("%d\t%d\n",celsius, fahr);
    celsius=celsius+step;
    }
}




