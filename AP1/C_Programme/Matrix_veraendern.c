#include <stdio.h>
#include <stdlib.h>

int main () {
 

  int i, j, option, spalteneingabe, zeileneingabe;
  char matrix[5][5];  
 

//Standardausgabe der Matrix  
  for (i=0; i < 5; i++) {
    for (j=0; j < 5; j++) {
      matrix[i][j]  = '+'; 
    }
  }
 for (i=0; i < 5; i++) {
   for (j=0; j < 5; j++) { 
   printf ("%c ", matrix[i][j]); 
   }
   printf ("\n");
 }  
 //Menü für die Matrix mithilfe einer While-Schleife
 while(1) {

  printf("\n");
  printf("Optionen:\n");
  printf("(1) Fülle alle Felder mit 0\n");
  printf("(2) Fülle die beiden Diagonalen mit 0\n");
  printf("(3) Fülle ein spezielles Feld mit 0 (Spalte, Zeile)\n");
  printf("(4) Refresh: Fülle alle Felder wieder mit +\n");
  printf("(5) Ausgabe der Matrix auf dem Bildschirm\n");
  printf("(6) Ende des Programms\n");
  
  scanf("%i", &option);

switch (option) {
 
 //Füllt alle Felder der Matrix mit '0' 
  case 1: 
    for (i=0; i < 5; i++) {
      for (j=0; j < 5; j++) {
        matrix[i][j] = '0';
      }
    } break;

 //Füllt alle Felder der Matrix mit '+' bevor die Diagonalen mit '0' gefüllt werden
  case 2:  
   for (i=0; i < 5; i++) {
     for (j=0; j < 5; j++) {
       matrix[i][j]  = '+';
    }
 } 

   //Diese for-schleife beinhaltet einen Algorithmus um die beiden Diagonalen der Matrix mit 0 zu füllen   
   for (i=1; i < 6; i++) {
     for (j=1; j < 6; j++) {
          matrix[i][j] = '+';
            if (i==j || i + j == 6) {
              matrix [i-1][j-1] = '0';
            }    
        }      
      }; break;

 //Füllt eine bestimmte Stelle der Matrix (Zeile/Spalte) mit 0
  case 3:
     printf("Geben Sie eine Spalte und eine Zeile ein\n");
     printf("Spalte:");
     scanf("%i", &spalteneingabe);
     printf("Zeile:");
     scanf("%i", &zeileneingabe);
        
     matrix[zeileneingabe-1][spalteneingabe-1] = '0';
     break;
 
 //Setzt die Matrix auf Ursprungszustand zurück
  case 4:
    for (i=0; i < 5; i++) {
      for (j=0; j < 5; j++) {
        matrix[i][j] ='+';
      }
    }
    break;

 //Ausgabe der Matrix auf dem Bildschirm
  case 5:
    for (i=0; i < 5; i++) {
      for (j=0; j < 5; j++) {
 	     printf ("%c ", matrix[i][j]);
      } 
       printf ("\n");
    }
    break;
 
 //Ende des Programms
  case 6:
    exit(0);
    break;
}     
}
 //Ausgabe der Matrix nach Auswahl eines Menüpunkts
  for (i=0; i < 5; i++) {
    for (j=0; j < 5; j++) {
   	 printf ("%c ", matrix[i][j]);
   	 }
 	    printf ("\n");
}
    return 0;
}
