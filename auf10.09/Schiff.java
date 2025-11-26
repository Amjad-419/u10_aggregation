// u10_aggregation
// auf10.5

public class Schiff
{
   private int eigenMasse;
   private Container containerAufPlatz1;
   private Container containerAufPlatz2;

   public void setEigenMasse(int masse)
   {
      this.eigenMasse = masse;
   }

   public int getEigenMasse()
   {
      return this.eigenMasse;
   }

   public void beladePlatz1(Container container)
   {
      this.containerAufPlatz1 = container;
   }

   public Container entladePlatz1()
   {
      Container temp = containerAufPlatz1;
      containerAufPlatz1 = null;
      return temp;
   }

   public void beladePlatz2(Container container)
   {
      this.containerAufPlatz2 = container;
   }

   public Container entladePlatz2()
   {
      Container temp = containerAufPlatz2;
      containerAufPlatz2 = null;
      return temp;
   }

   public int gibGesamtMasse()
   {
      int gesamt = eigenMasse;

      if (containerAufPlatz1 != null)
         gesamt += containerAufPlatz1.gibGesamtMasse();

      if (containerAufPlatz2 != null)
         gesamt += containerAufPlatz2.gibGesamtMasse();

      return gesamt;
   }

   public void containerVonPlatz1UmladenAuf(Schiff zielSchiff, int platzNr)
   {
      if (containerAufPlatz1 == null)
      {
          System.out.println("Containerplatz 1 ist leer");
          return;
      }

      // Zielplatz prüfen
      if (zielSchiff.platzBelegt(platzNr))
      {
         System.out.println("Platz " + platzNr + " auf dem Zielschiff ist besetzt!");
         return;
      }

      // Umladen durchführen
      Container temp = this.entladePlatz1();
      zielSchiff.platzBelegen(platzNr, temp);
   }

   public void containerVonPlatz2UmladenAuf(Schiff zielSchiff, int platzNr)
   {
      if (containerAufPlatz2 == null)
      {
         System.out.println("Containerplatz 2 ist leer");
         return;
      }

      if (zielSchiff.platzBelegt(platzNr))
      {
         System.out.println("Platz " + platzNr + " auf dem Zielschiff ist besetzt!");
         return;
      }

      Container temp = this.entladePlatz2();
      zielSchiff.platzBelegen(platzNr, temp);
   }

   // Hilfsmethoden (nicht öffentlich)
   private boolean platzBelegt(int nr)
   {
      if (nr == 1) return containerAufPlatz1 != null;
      if (nr == 2) return containerAufPlatz2 != null;

      System.out.println("Platz " + nr + " existiert nicht!");
      return true; // gilt als belegt, um Fehler zu verhindern
   }

   private void platzBelegen(int nr, Container c)
   {
      if (nr == 1) containerAufPlatz1 = c;
      else if (nr == 2) containerAufPlatz2 = c;
      else System.out.println("Platz " + nr + " existiert nicht!");
   }
}
