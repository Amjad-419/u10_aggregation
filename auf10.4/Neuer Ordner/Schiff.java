// u10_aggregation
// auf10.4

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
}
