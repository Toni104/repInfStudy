import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Geldautomat Testautomat = new Geldautomat(0);
        Testautomat.Kontostandmethode();
    }
}


class Konto {
    double Kontostand;

    public Konto(double dKontostand){
        Kontostand = dKontostand;

    }

    public double getKontostand() {
        System.out.println("Ihr Kontostand beträgt " + Kontostand);
        return Kontostand;
    }

    public void einzahlen(double betrag) {
        Kontostand = Kontostand + betrag;
    }

    public double abheben(double betrag) {
        Kontostand = Kontostand - betrag;

        if (betrag > Kontostand)
            System.out.println("Der Betrag ist zu hoch");

        return Kontostand;
    }
}
class Geldautomat{
    double dBetrag;                                      //Variablen deklarieren
    int eingabe;
    double dKontostand = 0;
    boolean hilfe = true;
    Scanner myObj = new Scanner(System.in);

    Konto userKonto = new Konto(dKontostand);        //Konto Objekt anlegen

    public Geldautomat(double dKontostand){
        this.dKontostand=dKontostand;

    }

    public void Kontostandmethode(){
        while(hilfe)
        {
            System.out.println("(1) Kontostand einsehen");    //simples Menü
            System.out.println("(2) Geld einzahlen");
            System.out.println("(3) Geld abheben");
            System.out.println("(4) Prozess abbrechen");
            eingabe = myObj.nextInt();
            //switch case

            switch (eingabe) {
                case 1:
                    userKonto.getKontostand();
                    break;
                case 2:
                    System.out.println("Wie viel möchten sie einzahlen?");
                    dBetrag = myObj.nextDouble();
                    userKonto.einzahlen(dBetrag);
                    break;
                case 3:
                    System.out.println("Wie viel möchten sie abheben?");
                    dBetrag = myObj.nextDouble();
                    userKonto.abheben(dBetrag);
                    break;
                case 4:
                    hilfe=false;
            }
        }
    }
}