#include<stdio.h>
#define LOWER   0
#define UPPER   300
#define STEP    20
int main(void)
{

    {
    printf("Temperature Table\n");
    }

    int fahr;


    for (fahr=LOWER;fahr<=UPPER;fahr = fahr + STEP)
    {

    printf("%i\t%i\n",fahr,((5)*(fahr-32)/(9)));


    }
}