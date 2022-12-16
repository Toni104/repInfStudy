#include <stdio.h>
#include <string.h>
int main() {
    const int anzahlEintraege = 10, laengeArtikel = 10;
    int eingabe = 0, lagerbestand = 0, j;
    char eingabe_artikel[laengeArtikel], eingabe_anzahl;
    struct Artikel {
        char artikel[laengeArtikel];
        int anzahl;
    };
    struct Artikel lager[anzahlEintraege];
    for (int i = 0; i < anzahlEintraege; i++) {
        lager[i].artikel[0] = '\0';
        lager[i].anzahl = 0;
    }
    while (eingabe >= 0 && eingabe <= 5) {
        printf("\n(1) Artikel hinzufuegen.\n");
        printf("\n(2) Artikel entnehmen.\n");
        printf("\n(3) Artikel suchen.\n");
        printf("\n(4) Lager ausgeben\n");
        printf("\n(5) Programm beenden.\n");
        printf("\nWas moechten Sie tun? :\n");
        scanf("%i", &eingabe);
        switch (eingabe) {
            case 1:
                printf("\nArtikel:\n");
                fflush(stdin);
                scanf("%s", eingabe_artikel);
                printf("\nAnzahl:\n");
                fflush(stdin);
                scanf("%i", &eingabe_anzahl);
                for (int i = 0; i < anzahlEintraege; i++) {
                    if (lager[i].artikel[0] == '\0') {
                        for (j = 0; eingabe_artikel[j] != '\0' && j < laengeArtikel; j++) {
                            lager[i].artikel[j] = eingabe_artikel[j];
                        }
                        lager[i].artikel[j] = '\0';
                        lager[i].anzahl += eingabe_anzahl;
                        printf("\nArtikel erfolgreich hinzugefuegt!\n");
                        break;
                    }
                    else if (strcmp(lager[i].artikel, eingabe_artikel) == 0) {
                        lager[i].anzahl += eingabe_anzahl;
                        printf("\nArtikelbestand erfolgreich hinzugefuegt!\n");
                    }

                    else {
                        if (i == anzahlEintraege-1) {
                            printf("\nDas Lager ist voll!\n");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                break;
            case 2:
                printf("\nArtikel:\n");
                fflush(stdin);
                scanf("%s", eingabe_artikel);
                printf("\nAnzahl:\n");
                fflush(stdin);
                scanf("%i", &eingabe_anzahl);
                for (int i = 0; i < anzahlEintraege; i++) {
                    if (strcmp(lager[i].artikel, eingabe_artikel) == 0 ) {
                        if (eingabe_anzahl < lager[i].anzahl) {
                            lager[i].anzahl -= eingabe_anzahl;
                            printf("\nEs wurden erfolgreich %i Elemente entnommen !\n", eingabe_anzahl);
                            break;
                        }
                        else if (eingabe_anzahl > lager[i].anzahl) {
                            printf("\nDer eingegebene Artikel ist nicht in der gewuenschten Menge vorhanden!\n");
                            break;
                        }
                        else if (eingabe_anzahl == lager[i].anzahl) {
                            lager[i].artikel[0] = '\0';
                            lager[i].anzahl = 0;
                            printf("\nDer Artikel wurde erfolgreich, komplett aus dem Lager entnommen!\n");
                            break;
                        }
                        else {
                            break;
                        }
                    }
                    else {
                        if (i == anzahlEintraege-1) {
                            printf("\nArtikel nicht gefunden!\n");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                break;
            case 3:
                printf("\nArtikel:\n");
                fflush(stdin);
                scanf("%s", eingabe_artikel);
                for (int i = 0; i < anzahlEintraege; i++) {
                    if(strcmp(lager[i].artikel, eingabe_artikel) == 0 ) {
                        printf("\nDer eingegebene Artikel hat einen Bestand von: %i\n", lager[i].anzahl);
                        break;
                    }
                    else {
                        if (i == anzahlEintraege-1) {
                            printf("\nArtikel nicht gefunden!\n");
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
                break;
            case 4:
                for (int i = 0; i < anzahlEintraege; i++) {
                    lagerbestand += lager[i].anzahl;
                }
                printf("%-5s%-12s%-10s\n", "Nr.", "Artikel", "Anzahl");
                for (int i = 0; i < anzahlEintraege; i++) {
                    printf("%-5i%-12s%-10i\n", i+1, lager[i].artikel, lager[i].anzahl);
                }
                printf("\nGesamter Lagerbestand: %i\n", lagerbestand);
                break;
            case 5:
                return 0;
            default:
                break;
        }
    }
    return 0;
}
