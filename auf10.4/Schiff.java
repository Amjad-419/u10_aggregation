// u10_aggregation
// auf10.2

public class Schiff
{
   private int eigenMasse;
   private Container containerAufPlatz1;
   private Container containerAufPlatz2;

   public void setEigenMasse(int masse)
   {
      this.eigenMasse = masse;
   }

   public int getEigenMasee()
   {
      return this.eigenMasse;
   }

   public void beladePlatz1(Container container)
   {
      this.containerAufPlatz1 = container;
   }

   public Container entladePlatz1()
   {
      return this.containerAufPlatz1;
   }

   public void beladePlatz2(Container container)
   {
      this.containerAufPlatz2 = container;
   }

   public Container entladePlatz2()
   {
      return this.containerAufPlatz2;
   }

   public int  gibGesamtMasse()
   {
      int gesamtMasse = this.eigenMasse;
      if(this.containerAufPlatz1 != null)
      {
         gesamtMasse += this.containerAufPlatz1.gebGesamtMasse();
      }

      if(this.containerAufPlatz2 != null)
      {
         gesamtMasse += this.containerAufPlatz2.gebGesamtMasse();
      }
      return gesamtMasse;
   }
}