#include <stdio.h>

int main() {
  
  const int groesse = 1001; 
  int prim[groesse];
  int i, j;
  int eingabe;
  
  
  printf("Bitte geben Sie eine Zahl zwischen 2 und 1000 ein\n");
  scanf("%i", &eingabe);
  
  for (i=2; i<groesse; i++) {
    prim[i] = 1;
  }

  if (eingabe >=  2 && eingabe <=1000 && eingabe % 1 == 0) { 
   for(i=2; i<=eingabe; i++) { 
    for(j= i*2; j<=eingabe; j+= i) {
     prim[j] = 0; 
    }
   } 

    printf("Die Primzahlen für die Zahl %i lauten:\n\n", eingabe);

    for (i=0; i<=eingabe; i++) {
      if (prim[i] == 1) {
          printf("%i,\t", i);
      }
    } 
  printf("\n\n\n");
  }
  
  else {

   printf("Der eingegebene Wert ist nicht korrekt!");
  }
  return 0;

  }
