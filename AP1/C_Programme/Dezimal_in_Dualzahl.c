#include <stdio.h>

int main () {

  int bit[8]={0};
  int i;
  int zahl;

  //Eingabe der Dezimalzahl
  printf("Programm Dualzahl\n");
  printf("Geben Sie bitte eine Zahl ein:\n");
  scanf("%i", &zahl);
  
  //Bedingung ob die Eingabe richtig ist und Berechnung des Restwertes mit einer for-Schleife 
  if (zahl <= 255 && zahl >= 0) {
     for (i=0; zahl > 0; i++) {
        bit[i] = zahl % 2;
        zahl = zahl / 2;
     }
  //Ausgabe des Arrays (rückwärts), da der Restwert von unten an gezählt wird        
     printf("Ausgabe im Dualsystem: ");
     for (i=7; i >= 0; i--)
       printf("%i", bit[i]);
  }   
  //Fehlermeldung bei falscher Eingabe 
    else  {
        printf("Fehler, die Zahl ist zu groß oder zu klein!\n");
      }
return 0;
}
        
