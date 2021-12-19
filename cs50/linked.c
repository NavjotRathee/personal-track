#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<cs50.h>

typedef struct node
{
    string name;
    struct node *next;
}
node;

int main(void)
{
    node *list = NULL;
    int name;
    node *n = malloc(sizeof(node));
    if(n==NULL)
    {
        return 1;
    }
    n->name = 1;
    n->next = NULL;
    list = n;

    n = malloc(sizeof(node));
    if(n==NULL)
    {
        return 1;
    }

    n->name = 2;
    n->next = NULL;
    list->next = n;

    n = malloc(sizeof(node));
    if(n == NULL)
    {
        return 1;
    }

    n->name = 3;
    n->next = NULL;
    list->next->next = n;

    n = malloc(sizeof(node));
    if(n==NULL)
    {
        return 1;
    }
    n->name = 4;
    n->next = NULL;
    list->next->next->next = n;

      n = malloc(sizeof(node));
    if(n==NULL)
    {
        return 1;
    }
    n->name = 5;
    n->next = NULL;
    list->next->next->next->next = n;

    for (node *tmp = list; tmp!=NULL; tmp = tmp->next)
    {
        printf("%s\n", tmp->name);
    }

    while(list != NULL)
    {
        node *tmp = list->next;
        free(list);
        list = tmp;
    }
}