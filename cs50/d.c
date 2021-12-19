#include<stdio.h>
#include<stdlib.h>
struct node
{
    struct node *prev;
    struct node *next;
    int data;
};

int main(void)
{
    node *list = NULL;
    int data;
    node *n1 = malloc(sizeof(node));
    if(n1==NULL)
    {
        return 1;
    }
    n1->data = 1;
    n1->next = NULL;
    n1->prev = NULL;
    list = n1;


    node *list = NULL;
    int name;
    node *n2 = malloc(sizeof(node));
    if(n2==NULL)
    {
        return 1;
    }
    n2->data = 2;
    n2->next = NULL;
    n2->prev = n1;
    list = n2;


}
