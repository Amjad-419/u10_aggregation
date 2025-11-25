// u10_aggregation
// auf10.06

public class Mitarbeiter
{
   private int               id;
   private Collection<Rolle> rollen;
   
   public Mitarbeiter(int id, Collection<Rolle> rollen)
   {
      this.id     = id;
      this.rollen = rollen;
   }
   
   public int getId()
   {
      return id;
   }
   
   public Collection<Rolle> getRollen()
   {
      return rollen;
   }
}