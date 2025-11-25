// u10_aggregation
// auf10.8

import java.util.*;
public class Raum
{
   private String bezeichnung;
   private ArrayList<Geraet> geraete;

   public Raum(String bezeichnung)
   {
      this.bezeichnung = bezeichnung;
      this.geraete = new ArrayList<>();
   }

   public void statteAusMit(Geraet g)
   {
      geraete.add(g);
   }

   public int gesamtLeistung()
   {
      int gesamt = 0;
      for (Geraet g : geraete)
      {
         gesamt += g.gesamtLeistung();
      }
      return gesamt;
   }

   public String getBezeichnung()
   {
      return bezeichnung;
   }
}
