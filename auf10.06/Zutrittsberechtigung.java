// u10_aggregation
// auf10.06

public class Zutrittsberechtigung
{
   private int  bereichs_id;
   private int  wochentag;   // Mo = 1
   private Time vonZeit;
   private Time bisZeit;
   
   public Zutrittsberechtigung(int  bereichs_id,
                               int  wochentag,
                               Time vonZeit,
                               Time bisZeit)
   {
      this.bereichs_id = bereichs_id;
      this.wochentag   = wochentag;
      this.vonZeit     = vonZeit;
      this.bisZeit     = bisZeit;
   }
      
   public int getBereichs_id()
   {
      return bereichs_id;
   }
   
   public int getWochentag()
   {
      return wochentag;
   }
   
   public Time getVonZeit()
   {
      return vonZeit;
   }
   
   public Time getBisZeit()
   {
      return bisZeit;
   }
}