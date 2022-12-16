#include <stdio.h>

int main () {

  
  printf("Programm Notenspiegel\n\n");
  
  const int groesse = 5; 
  int notenanzahl[groesse];
  int i, j, notensumme = 0;
  float durchschnitt = 0, gesamtanzahl = 0, quote = 0;
  
  //einlesen der Notenanzahl in das Array
  for (i=0; i<groesse; i++){

    printf("Bitte geben Sie die Anzahl der Arbeiten mit der Note %i ein:", i+1);
      scanf("%i", &notenanzahl[i]);
        gesamtanzahl += notenanzahl[i];
        notensumme += notenanzahl[i]*(i+1);
  }

  //Ausgabe der Tabelle
   
  printf("Note\t");
  
  for (i=0; i<5; i++) {
    printf("%i\t", i+1);
  } 
  
  printf("Gesamt\n");
  printf("Anzahl\t");
  
  for(i=0; i<5; i++){
    printf("%i\t", notenanzahl[i]);
  }
  printf("%2.0f\n\n", gesamtanzahl);
 
  //Berechnung der Durchschnittsnote und der Durchfallquote

  durchschnitt = notensumme / gesamtanzahl;
  quote = 100 / gesamtanzahl * notenanzahl[4];
  printf("Durchschnittsnote: %3.2f\n", durchschnitt);
  printf("Durchfallquote   : %3.1f %\n", quote);
  return 0;
}

