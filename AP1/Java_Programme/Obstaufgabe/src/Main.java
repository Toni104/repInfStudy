public class Main {

    public static void main(String[] args) {
        String[] VictorsLieblingsObst = {"Birne", "Apfel" ,"Kiwi"}; //initialisiert Array mit 3 Strings

        System.out.println(VictorsLieblingsObst[1]);        //printed den 2 ten Wert im Array [1]

        int [] VictorsLieblingsZahlen = new int [7];        //initialisiert Array mit 7 ints
        VictorsLieblingsZahlen[0]=7;                        //Der erste Wert im Array ist 7


        for(int i =1; i<VictorsLieblingsZahlen.length;i++){
            VictorsLieblingsZahlen[i]=i+3;                  //Victorslieblingszahlen[1]=4,[2]=5...
        }

        System.out.printf("%nVictors Lieblingszahlen: ");
        for(int each: VictorsLieblingsZahlen)
            System.out.print(each + " ");                   //printed die gerade berechneten zahlen
        // also 7(Am Anfang Gesetzt),4,5,6

        int[] KohlsLieblingsZahlen ={2, 5, 58,4,3,444,25};  //initialisiert Array mit vorgegebenen Zahlen
        VictorsLieblingsZahlen = KohlsLieblingsZahlen;      //Setzt den Wert von Victors Zahlen auf den Wert von Kohls Zahlen
        //nachdem Victors zahlen ausgegeben wurden

        VictorsLieblingsZahlen[1]=100;                      //Der Zweite Wert in VictorsZahlen wird mit 100 überschrieben
        //Weil jedoch victorszahlen = kohls zahlen, ist auch bei kohl[1]=100
        System.out.printf("%nKohls Lieblingszahlen: ");
        for(int each: KohlsLieblingsZahlen)                 //printed Kohls zahlen
            System.out.print(each + " ");

    }
}
