#include<stdio.h>

int main() {
    
    for(int i=1; i<=4; i++) {
        for(int k=3;k>=i;k--) {
            printf(" ");    
        }
        for(int j=1;j<=i;j++) {
                printf(" *");
        }
        printf("\n");
    }
    for(int i=3;i>=1;i--) {
        for(int k=i;k<=3;k++) {
            printf(" ");
        }
        for(int j=i;j>=1;j--) {
            printf(" *");
        }
        printf("\n");
    }
}