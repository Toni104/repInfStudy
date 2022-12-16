#include <stdio.h>

int main() {

  printf("Programm Würfelspiel\n\n");

  const int groesseW = 5;
  const int groesseS = 6;
  
  int wuerfel[groesseW];
  int seiten[groesseS];
  int i, j;
  int win = 0;

  for (i=0; i<groesseW; i++) {
    printf("Würfel %d:", i+1);
        scanf("%d", &wuerfel[i]);
  }
  printf("Würfel\t\t");

  for(i=0; i<groesseW; i++){
    printf("%d\t\t", i+1);
    }
  
  printf("\nAugenzahl\t");

  for(i=0; i<groesseW; i++){
    printf("%d\t\t", wuerfel[i]);
  }
  printf("\n");
   

  //Vergleichen der Würfel
  

  for (i=0; i<groesseS; i++) {
    seiten[i] = 0;
  } 
  for(i=0; i<groesseW; i++) {
    seiten[wuerfel[i]-1]++;
  }
  
  for(i=0; i<groesseS; i++) {
    printf("Ich habe %d mal die %d gewürfelt.\n", seiten[i], i+1);  
  }

  for(i=0; i<groesseS; i++) {

    switch (seiten[i]) {
  
       case 5: 
          printf("Gewonnen! Grand!\n");

          win = 1;
          break;
        
       case 4:
          printf("Gewonnen! Poker!\n");
          
          win = 1;
          break;

       case 3:

          for(j=0; j<groesseS; j++) {

            if (wuerfel[j]== 2) {
                printf("Gewonnen! Full House!\n");
                win = 1;
            } 
          }        
          break;  
           
     default:
          break;
   }       
  } 
  
  if(win!=1) {
    printf("Leider nix gewonnen\n");
  }
  
  return 0;
}
