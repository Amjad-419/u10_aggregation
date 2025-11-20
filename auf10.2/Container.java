// u10_aggregation
// auf10.2

public class Container
{
   private int    masse;
   private String zielhafen;

   public void setMasse(int masse)
   {
      this.masse = masse;
   }

   public int gebGesamtMasse()
   {
      return this.masse;
   }

   public void setZielHafen(String hafen)
   {
      this.zielhafen = hafen;
   }

   public String getZielHafen()
   {
      return this.zielhafen;
   }
}
