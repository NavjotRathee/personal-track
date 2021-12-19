#include<stdio.h>

int main(void)
{
int c;

    while ((c=getchar()) != 'a')
    {
       // putchar(c);
        c = getchar();
        putchar(c);
    }

   // putchar(c);
    c=getchar();


    putchar(c);

























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


}