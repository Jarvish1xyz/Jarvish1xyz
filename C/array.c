#include<stdio.h>

int main() {

    int mark[3];
    printf("enter phy : ");
    scanf("%d", &mark[0]);

    printf("enter chem : ");
    scanf("%d", &mark[1]);

    printf("enter math : ");
    scanf("%d", &mark[2]);

    printf("phy = %d, chem = %d, math = %d", mark[0], mark[1], mark[2]);

    return 0;
}