#include<stdio.h>

void square(int n);
void _square(int* n);

int main() {

    // pointer
    /*
    
    int age = 22;
    int *ptr = &age;

    printf("%d\n", age);

    printf("%d\n", *ptr);

    printf("%d\n", *(&age));
    */

    // pointer to pointer
    /*
    float price = 100.0;
    float *ptr = &price;
    float **pptr = &ptr;

    printf("%f\n", **pptr);
    */

    int number = 4;
    square(number);
    printf("number = %d\n", number);

    _square(&number);
    printf("number = %d\n", number);

    return 0;

}

// call by value
void square(int n) {
    n = n * n;
    printf("square = %d\n", n);
}

void _square(int* n) {
    *n = (*n) * (*n);
    printf("square = %d\n", *n);
}