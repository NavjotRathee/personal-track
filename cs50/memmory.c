#include <stdlib.h>


void f(void)

{
    int *x = malloc(10 * sizeof(int));

}

int main(void)
{ 
    f();
    return 0;
}