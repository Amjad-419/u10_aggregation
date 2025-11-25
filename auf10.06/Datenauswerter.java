// u10_aggregation
// auf10.06

public class Datenauswerter
{
   private int                     lesegeraetId;
   private Collection<Mitarbeiter> colMitarbeiter;  
   
   public Datenauswerter(int                     lesegeraetId,
                         Collection<Mitarbeiter> colMitarbeiter)
   {
      this.lesegeraetId   = lesegeraetId;
      this.colMitarbeiter = colMitarbeiter;
   }
   
   //----------------------------------------------------------
   // Benutzen Sie nur typisierte Collections (wie oben).
   // Fuegen Sie hier Ihren Loesungscode ein:

   public boolean zutrittspruefung(int  MA_ID, int  bereichs_ID, int  wochentag, Time uhrzeit)
   {
      boolean zutritt = false;
    
      // Durch die Mitarbeiter-Collection iterierern
      for(int i = 0; i < colMitarbeiter.length(); i++)
      {
         Mitarbeiter aktuellerMitarbeiter = colMitarbeiter.get(i);

         // Bei jedem Mitarbeiter aus der Collection pruefen
         // ob es der Mitarbeiter aus dem Attribut iset.
         // ( ... ob MA_ID == id des aktuellen Mitarbeiters)
         if(MA_ID == aktuellerMitarbeiter.getId())
         {
            // Wenn der Mitarbeiter MA_ID gefunfden wurde ...
            Collection<Rolle> alleRollen = aktuellerMitarbeiter.getRollen();

            // durch seine Rollen iteriern.
            for(int j = 0; j < alleRollen.length(); j++ )
            {
               Rolle aktuelleRolle = alleRollen.get(j);

               Collection<Zutrittsberechtigung> alleRechte = aktuelleRolle.getZutrittsberechtigung();

               // Bei jeder Rolle durch die zutrittsberschtigung iterieren.
               for(int k = 0; k < alleRechte.length(); k++ )
               {
                  Zutrittsberechtigung aktuelleBerechtigung = alleRechte.get(k);

                  // Bei jeder Berechtigung pruefen, ob 
                  // bereichs_id ==  bereichs_ID und 
                  // aktueller wochentag == wochentag der Berechtigung und
                  // vonZeit <= aktuelle uhrzeit und  akteelle uhrzeit <= bisZeit.
                  if(bereichs_ID       == aktuelleBerechtigung.getBereichs_id()       &&
                     wochentag         == aktuelleBerechtigung.getWochentag()         &&
                     uhrzeit.getZeit() >= aktuelleBerechtigung.getVonZeit().getZeit() &&
                     uhrzeit.getZeit() <= aktuelleBerechtigung.getBisZeit().getZeit()   )
                  {
                     // Falls alle Bedingungen erfuellt sind, return true.
                     zutritt =  true;
                  }
               }
            }
         }
         
      }

      return zutritt;
   }



   
   
   //----------------------------------------------------------
}