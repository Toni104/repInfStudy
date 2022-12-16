#include <stdio.h>

int main (){

int i, j, zaehler1 = 0 , zaehler2 = 0, zaehler3;
const int laenge1 = 30;
const int laenge2 = 30;
char name1[laenge1];
char name2[laenge2];

  while(1) {

   printf("Programm zur Konkurrenzermittlung\n\n");

   printf("Bitte geben Sie den 1. Firmennamen ein :");
   scanf("%s", name1);
   printf("Bitte geben Sie den 2. Firmennamen ein :");
   scanf("%s", name2);



   for (i = 0; name1[i] != '\0' && name2[i] != '\0'; i++){
        if (name1[i] == name2[i]){
          zaehler1++;
          zaehler2++;
        }


      if (name1[i] != name2[i]){
          zaehler2++;
      }
   }

        if (zaehler1 == zaehler2){

          printf("%s und %s sind identisch\n", name1, name2);
        }
          else {

             printf("%s und %s sind nicht identisch\n", name1, name2);
          }
  }
 return 0;
}
