// u10_aggregation
// auf10.8

public class Geraet
{
   private String bezeichnung;
   private int    leistung;
   private Bauteil steckplatzA;
   private Bauteil steckplatzB;
   private Bauteil steckplatzC;

   public Geraet(String bezeichnung, int leistung)
   {
      this.bezeichnung = bezeichnung;
      this.leistung     = leistung;
      this.steckplatzA = null;
      this.steckplatzB = null;
      this.steckplatzC = null;
   }
  
   public void baueEinInSteckplatzA(Bauteil b)
   {
      this.steckplatzA = b;
   }

   public void baueEinInSteckplatzB(Bauteil b)
   {
      this.steckplatzB = b;
   }

   public void baueEinInSteckplatzC(Bauteil b)
   {
      this.steckplatzC = b;
   }

   public Bauteil entferneBauteilVonSteckplatzA()
   {
      Bauteil temp = steckplatzA;
      steckplatzA = null;
      return temp;
   }

   public Bauteil entferneBauteilVonSteckplatzB()
   {
      Bauteil temp = steckplatzB;
      steckplatzB = null;
      return temp;
   }

   public Bauteil entferneBauteilVonSteckplatzC()
   {
      Bauteil temp = steckplatzC;
      steckplatzC = null;
      return temp;
   }

   public int gesamtLeistung()
   {
      int gesamt = leistung;
      if (steckplatzA != null) gesamt += steckplatzA.getGesamtLeistung();
      if (steckplatzB != null) gesamt += steckplatzB.getGesamtLeistung();
      if (steckplatzC != null) gesamt += steckplatzC.getGesamtLeistung();
      return gesamt;
   }

   public String getBezeichnung()
   {
     return bezeichnung;
   }
}
