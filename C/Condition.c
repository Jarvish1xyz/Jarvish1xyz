#include<stdio.h>

int main(){

    /*
    int age;
    printf("enter age : ");
    scanf("%d", &age);
    */

    /*   (If-else)
    if(age > 18) {
        printf("Adult \n");
        printf("they can vote \n");
        printf("they can drive \n");
    }
    else if(age > 13 && age < 18) {
        printf("teenager \n");
    }
    else {
        printf("child");
    }
    */

    /*   (ternary)
    age >= 18 ? printf("adult \n") : printf("not adult \n");
    */

    /*
    char day; //m-monday; t-tuesday; w-wednesday; T; f; s; S;
    printf("enter day : ");
    scanf("%s", &day);

    switch (day) {
        case 'm' : printf("monday \n");
            break;
        case 't' : printf("tuesday \n");
            break;
        case 'w' : printf("wednesday \n");
            break;
        case 'T' : printf("thursday \n");
            break;
        case 'f' : printf("friday \n");
            break;
        case 's' : printf("saturday \n");
            break;
        case 'S' : printf("sunday \n");
            break;
        default : printf("not a valid day \n");
    }
    */

    int number;
    printf("enter a number : ");
    scanf("%d", &number);

    if(number >= 0) {
        printf("positive \n");
        if(number % 2 ==0) {
            printf("even \n");
        }
        else {
            printf("odd \n");
        }
    }
    else {
        printf("negative \n");
    }


    return 0;
}