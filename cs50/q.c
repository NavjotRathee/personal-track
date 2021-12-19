#include<stdio.h>
#include<stdlib.h>
void insert(struct node* prev_node, int new_data)
{

    if (prev_node == NULL)
    {
    printf("the given previous node cannot be NULL");
    return;
    }


    struct node* new_node =(struct node*) malloc(sizeof(struct node));
    new_node->data = new_data;


    new_node->next = prev_node->next;

    prev_node->next = new_node;
}