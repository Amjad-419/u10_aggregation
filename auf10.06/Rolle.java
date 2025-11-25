// u10_aggregation
// auf10.06

public class Rolle
{
   private Collection<Zutrittsberechtigung> zutrittsberechtigung;
   
   public Rolle(Collection<Zutrittsberechtigung> zutrittsberechtigung)
   {
      this.zutrittsberechtigung = zutrittsberechtigung;
   }
   
   public Collection<Zutrittsberechtigung> getZutrittsberechtigung()
   {
      return zutrittsberechtigung;
   }
}