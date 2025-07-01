#include<stdio.h>

int main() {
    int cd,cm,cy;
    printf("Enter today date : ");
    scanf("%d", &cd);
    scanf("%d", &cm);
    scanf("%d", &cy);

    int d,m,y;
    printf("enter your date of birth : ");
    scanf("%d", &d);
    scanf("%d", &m);
    scanf("%d", &y);

    int ad,am,ay;
    ay = cy - y;

    if(cm==m) {
        am=0;
    }
    else if(cm>m) {
        am = cm - m;
    }
    else {
        ay = ay-1;
        am = 12-(m-cm);
    }

    if(cd==d) {
        ad=0;
    }
    else if(cd>d) {
        ad = cd-d;
    }
    else {
        am = am-1;
        ad = d-cd;
    }

    printf(" you are %d years, %d months, %d days old.", ay,am,ad);


}