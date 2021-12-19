#include<stdio.h>
#include<cs50.h>
#include<string.h>

typedef struct
{
    string name;
    string number;
}

person;

int main(void)

{

    person people[4];

    people[0].name = "NAVJOT";
    people[0].number = "1262-292124";

     people[1].name = "NAVDEEP";
    people[1].number = "1262-72124";

     people[2].name = "GULLU";
    people[2].number = "1262-272124";

     people[3].name = "BABLU";
    people[3].number = "1262-297295";


    //string names[4] = {"NAVJOT", "NAVDEEP", "GULLU", "BABLU"};
    //string numbers[4]={"1262-292124","1262-72124","1262-272124","1262-297295"};

        for (int i=0;i<4;i++)
            {
                if(strcmp(people[i].name,"GULLU")==0)
                {
                    printf("%s\n",people[i].number);
                    return 0;
                }

                }
            printf("Not found\n");
            return 1;

}