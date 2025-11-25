// u10_aggregation
// auf10.8

public class Prozessor
{
   private String bezeichnung;
   private int leistung;   // watt

   public Prozessor(String bezeichnung, int leistung)
   {
      this.bezeichnung = bezeichnung;
      this.leistung = leistung;
   }

   public String getBezeichnung()
   {
      return bezeichnung;
   }

   public int getLeistung()
   {
      return leistung;
   }
}
