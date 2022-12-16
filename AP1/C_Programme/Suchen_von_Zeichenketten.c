#include <stdio.h>


int sucheZeichen(const char s[], char c){

  int i, zaehler = 0;
 
  for(i=0; s[i] != '\0'; i++){
    if (c == s[i]){
      zaehler++;
    }
  }  
return zaehler;
}

int laengeZeichenkette(const char s[]){
  int i, zaehler;

  for(i=0; s[i]!= '\0'; i++){
    zaehler++;
  }
return i;
}  

int main(){

const int laenge = 50;  
char  name[laenge];
char eingabe;
int anzahl;
char zeichen;
int c;

  printf("Zeichenketten suchen\n");

  printf("Bitte geben Sie eine Zeichenkette ein:");
  fflush(stdin);
  scanf("%s", name);

  anzahl = laengeZeichenkette(name);
  printf("%s hat %i Zeichen\n", name, anzahl);
  
  while(1){

    printf("Möchtest du nach einem Buchstaben in %s suchen (j/n)?", name);
    scanf(" %c", &eingabe);

    switch(eingabe) {

      case 'j':
        
        printf("\nBitte gebe den Buchstaben ein:\n");
        scanf(" %c", &zeichen);
        c = sucheZeichen(name, zeichen);
        printf("Der Buchstabe %c kommt %imal vor\n\n", zeichen, c);
        break;     

      case 'n':
        
        printf("Auf Wiedersehen!\n");
        return 0;

      default:
        
        printf("Fehler! Eingabe falsch!\n");
        return 0;
    }
  }
return 0;  
}


