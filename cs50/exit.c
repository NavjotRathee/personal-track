#include<stdio.h>
#include<cs50.h>
#include<ctype.h>

int main(int argc, string argv[])

{
    if(argc !=2)
    {
    printf("Command-line argument missing\n");
    return 1;
    }
    printf("Hello,%s\n",argv[1]);
    //return 0;

    char Test[] = {'a'};

    int offset = isupper(Test[0]) ? 65 : 97;


    printf("%i", offset);
}