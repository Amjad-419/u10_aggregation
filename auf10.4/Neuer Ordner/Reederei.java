// u10_aggregation
// auf10.2

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
      
      container1.setMasse(1000);
      container2.setMasse( 800);
      container3.setMasse( 500);
      
      schiff1.setEigenMasse(10000);            //  10000 kg

      int gesamtMasse = 0;
      
      gesamtMasse = schiff1.gibGesamtMasse();  //  10000 kg
      System.out.println("Schiff 1: " +
                          gesamtMasse + " kg");
      System.out.println();
      
      schiff1.beladePlatz1(container1);        // + 1000 kg
      schiff1.beladePlatz2(container2);        // +  800 kg
                                               // ---------
                                               //  11800 kg
      
      schiff2.setEigenMasse(10000);            //  10000 kg
      schiff2.beladePlatz1(container3);        // +  500 kg
                                               // ---------
                                               //  10500 kg
      
      gesamtMasse = schiff1.gibGesamtMasse();  //  11800 kg
      System.out.println("Schiff 1: " +
                          gesamtMasse + " kg");
      
      gesamtMasse = schiff2.gibGesamtMasse();  //  10500 kg
      System.out.println("Schiff 2: " +
                          gesamtMasse + " kg");
      System.out.println();
      
      // Umladen
      
                                               //  11800 kg
      container4 = schiff1.entladePlatz1();    // - 1000 kg
                                               // ---------
                                               //  10800 kg

                                               //  10500 kg
      schiff2.beladePlatz2(container4);        // + 1000 kg
                                               // ---------
                                               //  11500 kg
      
      gesamtMasse = schiff1.gibGesamtMasse();  //  10800 kg
      System.out.println("Schiff 1: " + 
                          gesamtMasse + " kg");
      
      gesamtMasse = schiff2.gibGesamtMasse();  //  11500 kg
      System.out.println("Schiff 2: " +
                          gesamtMasse + " kg");
    }
}
