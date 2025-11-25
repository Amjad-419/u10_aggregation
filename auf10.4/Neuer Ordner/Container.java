// u10_aggregation
// auf10.2

public class Container
{
   private int masse;
   private int eigenMasse;
   private String zielHafen;

   private Palette paletteAufPlatz1;
   private Palette paletteAufPlatz2;
   private Palette paletteAufPlatz3;

   public void setEigenMasse(int masse)
   {
      this.eigenMasse = masse;
   }

   public int getEigenMasse()
   {
      return this.eigenMasse;
   }

   public void setZielHafen(String hafen)
   {
      this.zielHafen = hafen;
   }

   public String getZielHafen()
   {
        return this.zielHafen;
   }

   public void belegePlatz(int nr, Palette palette)
   {
      switch (nr)
      {
         case 1: paletteAufPlatz1 = palette; break;
         case 2: paletteAufPlatz2 = palette; break;
         case 3: paletteAufPlatz3 = palette; break;
         default: System.out.println("Platz " + nr + " existiert nicht!");
      }
   }

   public Palette raeumePlatz(int nr)
   {
      Palette temp = null;
      switch (nr)
      {
         case 1: temp = paletteAufPlatz1; paletteAufPlatz1 = null; break;
         case 2: temp = paletteAufPlatz2; paletteAufPlatz2 = null; break;
         case 3: temp = paletteAufPlatz3; paletteAufPlatz3 = null; break;
         default: System.out.println("Platz " + nr + " existiert nicht!");
      }
      return temp;
   }

   public int gibGesamtMasse()
   {
      int masse = eigenMasse;
      if (paletteAufPlatz1 != null)
      {
          masse += paletteAufPlatz1.getMasse();
      }
      if (paletteAufPlatz2 != null) masse += paletteAufPlatz2.getMasse();
      if (paletteAufPlatz3 != null) masse += paletteAufPlatz3.getMasse();
      return masse;
   }
}
