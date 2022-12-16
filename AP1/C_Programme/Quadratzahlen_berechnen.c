#include<stdio.h>

int main (){
    int x;
    int i =0;
    printf("Wie viele Quadratzahlen sollen berechnet werden?");
    scanf("%i",&x);
    printf("Hier die %i Quadratzahlen",x);
    for(i=0;i<=x;i++){
        if(i==x){
            printf("%i",i*i);
            printf("\nDas wars!");
        }
        else 
        printf("%i,",i*i);
    }



    return 0;
}