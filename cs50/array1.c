#include<stdio.h>
#include<cs50.h>
#include<string.h>

int main(void)

{
    string s = get_string("Input :");
    printf("Output:");
    // int n = strlen(s);
    for (int i = 0, n = strlen(s); i < n; i++)
    {
        printf("%c", s[i]);
    }

    {
        printf("\n");
    }
}