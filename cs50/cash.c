#include<stdio.h>
#include<cs50.h>

int main(void)
{
    int x=get_int("Total amount:");

    if (x>=25)
    {

        printf("Number of quarters -- %d\n", x/25);
        x = x%25;

    }
    if(x >=10){
        printf("Number of dimes -- %d\n",x/10);
        x = x%10;
}

     if(x >=5){
        printf("Number of nickles -- %d\n",x/5);
        x = x%5;
}

     if(x >=1){
        printf("Number of pennies -- %d\n",x/1);
        x = x%1;
}


}