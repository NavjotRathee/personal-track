#include<stdio.h>
#include<stdlib.h>


struct node {
    int data;
    struct node *next;
    struct node *prev;
};

void create(struct node *head, struct node *ptr)
{
    struct node *newnode = NULL;


        newnode = (struct node*) malloc(sizeof(struct node));
        printf("enter data:");
        scanf("%d",&newnode->data);
        newnode->prev = newnode->next = NULL;

        if(head==NULL)
        {
            head=newnode;
            ptr=newnode;
        }
        else
        {
            ptr->next=newnode;
            newnode->prev=ptr;
            ptr=newnode;
        }

         }

         int y=0;
   printf("need more node?:");
    scanf("%d",&y);

     p=malloc(sizeof(struct node));
        scanf("%d",&p->data);
        p->next=NULL;

        if(head==NULL)
            head=p;
        else
            prev->next=p;
        prev=p;
    }




