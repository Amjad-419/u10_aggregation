// u10_aggregation
// auf10.4

/*************************************************************
 *                                                           *
 *      Diese Testklasse darf nicht veraendert werden.       *
 *                                                           *
 *      Sie darf aber schrittweise aktiviert werden.         *
 *      Dazu wird zunaechst der groesste Teil des Codes der  *
 *      Testklasse per Kommentarzeichen deaktiviert.         *
 *      Je nach Arbeitsfortschritt werden dann immer         *
 *      groessere Teile des Test-Codes wieder aktiviert.     *
 *                                                           *
 *************************************************************/
public class Reederei
{
   public static void main(String[] args)
   {
      Schiff schiff1 = new Schiff();
      Schiff schiff2 = new Schiff();
      
      Container container1 = new Container();
      Container container2 = new Container();
      Container container3 = new Container();
      Container container4 = null;
      
      Palette palette1 = new Palette();
      Palette palette2 = new Palette();
      Palette palette3 = new Palette();
      Palette palette4 = new Palette();
      Palette palette5 = new Palette();
      Palette palette6 = new Palette();
      Palette palette7 = null;
      
      palette1.setLadung("Kleider");
      palette1.setMasse(400);
      palette2.setLadung("Bananen");
      palette2.setMasse(500);
      palette3.setLadung("Trainer");
      palette3.setMasse(600);
      palette4.setLadung("Bier");
      palette4.setMasse(700);
      palette5.setLadung("Kabel");
      palette5.setMasse(800);
      palette6.setLadung("Motoren");
      palette6.setMasse(900);
      
      container1.setEigenMasse(1000);      //  1000 kg
      container1.belegePlatz(1, palette1); // + 400 kg
      container1.belegePlatz(2, palette5); // + 800 kg
      container1.raeumePlatz(2);           // - 800 kg
                                           // --------
                                           //  1400 kg
      
      container2.setEigenMasse(1000);      //  1000 kg
      container2.belegePlatz(1, palette2); // + 500 kg
      container2.belegePlatz(3, palette3); // + 600 kg
      container2.raeumePlatz(0);           // Platz 0 ungueltig
      palette7 = container2.raeumePlatz(1);//  -500 kg
                                           // --------
                                           //  1600 kg
      
      container3.setEigenMasse(1000);      //  1000 kg
      container3.belegePlatz(2, palette4); // + 700 kg
      container3.belegePlatz(3, palette6); // + 900 kg
      container3.belegePlatz(5, palette7); // Platz 5 ungueltig
      container3.belegePlatz(1, palette7); // + 500 kg
                                           // --------
                                           //  3100 kg
      
      schiff1.setEigenMasse(10000);        //  10000 kg
      schiff1.beladePlatz1(container1);    // + 1400 kg
      schiff1.beladePlatz2(container2);    // + 1600 kg
                                           // ---------
                                           //  13000 kg
      
      schiff2.setEigenMasse(10000);        //  10000 kg
      schiff2.beladePlatz1(container3);    // + 3100 kg
                                           // ---------
                                           //  13100 kg
      
      int gesamtMasse = 0;
      
      gesamtMasse = schiff1.gibGesamtMasse();  //  13000 kg
      System.out.println("Schiff 1: " +
                          gesamtMasse + " kg");
      
      gesamtMasse = schiff2.gibGesamtMasse();  //  13100 kg
      System.out.println("Schiff 2: " +
                          gesamtMasse + " kg");
      System.out.println();
      
      // Umladen
                                               //  13000 kg
      container4 = schiff1.entladePlatz1();    // - 1400 kg
                                               // ---------
                                               //  11600 kg
                                               
                                               //  13100 kg
      schiff2.beladePlatz2(container4);        // + 1400 kg
                                               // ---------
                                               //  14500 kg
      
      gesamtMasse = schiff1.gibGesamtMasse();  //  11600 kg
      System.out.println("Schiff 1: " +
                          gesamtMasse + " kg");
      
      gesamtMasse = schiff2.gibGesamtMasse();  //  14500 kg
      System.out.println("Schiff 2: " +
                          gesamtMasse + " kg");
    }
}
