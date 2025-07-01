#include<stdio.h>

void printHello(); // declaration/prototype 

int main() {

    printHello(); // function call
    printHello();
    printHello();
    return 0;
}

// function definition
void printHello() {

    printf("Hello! \n");
    printf("My name is Milan \n");
}