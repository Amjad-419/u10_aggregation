// u10_aggregation
// auf10.9

public class Palette
{
   private Ladung ladung;
   private int eigenMasse;

   // Masse wird im Konstruktor gesetzt
   public Palette(int eigenMasse)
   {
      this.eigenMasse = eigenMasse;
   }

   // Palette mit Ladung beladen
   public void beladeMit(Ladung neueLadung)
   {
      this.ladung = neueLadung;
   }

   // Ladung entfernen
   public Ladung entlade()
   {
      Ladung temp = this.ladung;
      this.ladung = null;
      return temp;
   }

    // Gesamtmasse = Eigenmasse + Ladungsmasse
    public int getMasse()
   {
      if (ladung != null)
      {
         return eigenMasse + ladung.gibGesamtmasse();
      }
      return eigenMasse;
    }

}
