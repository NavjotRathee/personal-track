#include<stdio.h>
#include<stdlib.h>



struct node
{
    int value;
    struct node *next;
    struct node *prev;
};
void display(struct node *head);
void insert(struct node *head, int position);


int main(void)
{
    struct node *head, *p, *prev,*N;
    int n,i ;
    int value=0;
    int position=0;

    printf("Number of nodes: ");
    scanf("%d",&n);
    head = NULL;
    for(i=0;i<n;i++)
    {
        p = malloc(sizeof(struct node));
        scanf("%d",&p->value);
        p->next=NULL;

        if(head==NULL)
        head = p;
        else
        prev->next=p;
        prev = p;
    }

    display(head);

    int y=0;
   printf("need more node?:");
    scanf("%d",&y);

    printf("give position to insert: ");
    scanf("%i", &position);

    insert(head, position);
    display(head);
}


void display(struct node *head)
{
    struct node *tmp;
    tmp = head;
    while (tmp!=NULL)
    {
    printf("%d\n",tmp->value);

    tmp=tmp->next;
    }

}


void insert(struct node *head,int position){
    struct node *tmp, *tmp2, *N;

    int value, i;
    printf("value: ");
    scanf("%d",&value );

    tmp = head;
    for(i=1;i<position-1;i++)
    {
        tmp=tmp->next;
    }
    {
       N = malloc(sizeof(struct node));
        N->value=value;

        tmp2=tmp->next;
        tmp->next=N;
        N->next=tmp2;

    }
}

