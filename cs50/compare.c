#include<stdio.h>
#include<cs50.h>

int main(void)
{
    //int i = get_int("i: ");
    //int j = get_int("j: ");

    char *s = get_string("s: ");
    char *t = get_string("t: ");

   printf("%p\n", s);
   printf("%p\n", t);
}