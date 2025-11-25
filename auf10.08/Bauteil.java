// u10_aggregation
// auf10.8

public class Bauteil
{
   private String    bezeichnung;
   private int       leistung;    // Watt
   private Prozessor prozessor;

   public Bauteil(String bezeichnung, int leistung)
   {
      this.bezeichnung = bezeichnung;
      this.leistung = leistung;
      this.prozessor = null;
   }

   public void setzeEin(Prozessor pr)
   {
      this.prozessor = pr;
   }

   public int getGesamtLeistung()
   {
      int gesamt = leistung;
      if (prozessor != null)
      {
         gesamt += prozessor.getLeistung();
      }
      return gesamt;
   }

   public String getBezeichnung()
   {
      return bezeichnung;
   }
}
