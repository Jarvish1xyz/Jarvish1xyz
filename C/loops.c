#include<stdio.h>

int main() {

    /*
    for(int i = 1; i<=5; i++)
    {
        printf("%d", i);
        printf("-Hello World \n");
    }
    */

    /*
    for(char ch='a'; ch<='z'; ch++)
    {
        printf("%c \n", ch);
    }
    */

    /*
    int i=1;
    while(i<=5)
    {
        printf("%d \n", i);
        i++;
    }
    */

    /*
    int i=1;
    do
    {
        printf("%d \n", i);
        i++;
    }
    while(i<=5);
    */

    /*
    for(int i=1; i<=5; i++)
    {
        if(i == 3){
            break;
        }
        printf("%d \n", i);
    }
    */

    for(int i=1; i<=5; i++)
    {
        if(i ==3 ){
            continue;
        }
        printf("%d \n", i);
    }

    return 0;

}