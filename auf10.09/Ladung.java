// u10_aggregation
// auf10.9

public class Ladung
{
   private String bezeichnung;
   private int masse;

   public Ladung(String bez, int masse)
   {
      this.bezeichnung = bez;
      this.masse = masse;
   }

   public int gibGesamtmasse()
   {
      return masse;
   }

   public String getLadung()
   {
      return this.bezeichnung;
   }
}
