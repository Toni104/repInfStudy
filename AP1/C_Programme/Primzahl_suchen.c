#include <stdio.h>

int main () {
  int i;
  int a[1001];
  int eingabe;
  int zahl;


  printf("Programm zur Berechnung von Primzahlen\n");

  //Eingabe der Zahl zur Berechnung
  printf("Bitte geben Sie eine Zahl zwischen 2 und 1000 ein :");
  scanf("%i", &eingabe);
 
  //Berechnung der Primzahl und Bedingung für das Zahlenintervall
  if (eingabe >= 2 && eingabe <= 1000) {
  
  for (i=2; i <= eingabe; i++) {
      a[i]=1;
  }
  
    for (i=2; i <= eingabe; i++){
        for (zahl = i*2; zahl <= eingabe; zahl += i) {
            a[zahl] = 0;
        }
    }
  
    //Ausgabe der Primzahl falls keine falsche Eingabe erfolgte
    for (i=2; i <= eingabe; i++) {
      if (a[i] != 0) {
        printf("%i\n", i);
      }  
    }
  }
  //Ausgabe für eine falsch getätigte Eingabe
  else {
    printf("Es wurde eine falsche Eingabe getätigt!\n");
  } 

  return 0;
}
