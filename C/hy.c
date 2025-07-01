#include<stdio.h>

int main() {
    int row,col;
    printf("Enter row : ");
    scanf("%d", &row);
    printf("Enter col : ");
    scanf("%d", &col);
    int num1[row][col], num2[row][col], multi[row][col];
    
    printf("Enter matrix-1:\n");
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            scanf("%d", &num1[i][j]);
        }
    }

    printf("Enter matrix-2:\n");
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            scanf("%d", &num2[i][j]);
        }
    }
    
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            multi[i][j] = 0;
            for(int k = 0; k < row; k++) {
                multi[i][j] += num1[i][k] * num2[k][j];
            }
        }
    }

    printf("Product of matrix-1 and matrix-2:\n");
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            printf("%d ", multi[i][j]);
        }
        printf("\n");
    }

    return 0;
}
