#include <stdio.h>

int main () {

  int eingabe;

  //Eingabe der Jahreszahl 
  printf("Programm Schaltjahr\n\n");
  printf("Bitte geben Sie eine Jahreszahl ein:\t");
  scanf("%i", &eingabe);
  
  //Bedingung dafür das die eingegebene Zahl ein Schaltjahr ist und Ausgabe
  if (eingabe % 4 == 0 && eingabe % 100 != 0 || eingabe % 400 == 0)  {
      printf("%i ist ein Schaltjahr!\n", eingabe);
  }
     else {
      printf("%i kein Schaltjahr!\n", eingabe);  
     }
     return 0;
  }
