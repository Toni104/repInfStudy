#include<stdio.h>

int main(){
	int a[5];//Array mit 5 Einträgen 0,1,2,3,4
	int i, min; //Zähler und kleinster Wert
	int summe = 0; //Ich hab hier nur einen Wert eingetragen, weil += in meiner forschleife nen Fehler gibt 
	int index = 1; //Stelle im Array, wird hier auf 1 gesetzt, damit die 1 Stelle 1 und nicht 0 heißt
	for(i=0;i<=4;i++){
		printf("Bitte %d-tes Element eingeben: ",i+1);//am ende i+1, da i bei 0 Startet um einen wert in a[0] zu kriegen
		scanf("%d",&a[i]);
		summe = summe + a[i];//hier könnte man eig. += machen, aber bei mir spackt das rum
	}
	printf("Die Array Elemente heißen: ");
	for(i=0;i<=4;i++){
		printf("%d, ",a[i]);
	}
	min = a[0];//Der Algorithmus den wir schon kennen, die erste Zahl ist die kleinste, bis wir eine kleinere finden
	for(i=0;i<=4;i++){
		if(a[i]<min)/*Falls die Zahl im array kleiner als die aktuell kleinste ist*/
		{
			min = a[i];//setze die kleinste Zahl = die Zahl im Array 
			index = i+1;//Hier wieder +1, da "0-te" Stelle komisch klingt
		}
	}
	printf("\nDie kleinste Zahl heißt: %d und ist and Position %d im Array\n",min, index);
	printf("Die Sumem aller Zahlen im Array lautet %d\n",summe);
	return 0;
	
}