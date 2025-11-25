// u10_aggregation
// auf10.06

/************************************************************
 *                                                          *
 *      Diese Testklasse darf nicht veraendert werden.      *
 *                                                          *
 ************************************************************/
public class TestDatenauswerter
{
   public static void main(String[] args)
   {
      final Time                             T8;
      final Time                             T20;
      final Time                             T10;
      final Time                             T22;
      final int                              MO;
      final int                              DI;
            Zutrittsberechtigung             z1; 
            Zutrittsberechtigung             z2; 
            Zutrittsberechtigung             z3; 
            Zutrittsberechtigung             z4;
            Zutrittsberechtigung             z5;
            Collection<Zutrittsberechtigung> berechtigungen1;
            Collection<Zutrittsberechtigung> berechtigungen2;
            Collection<Zutrittsberechtigung> berechtigungen3;
            Rolle                            r1;
            Rolle                            r2;
            Rolle                            r3;
            Collection<Rolle>                rollen1;
            Collection<Rolle>                rollen2;
      final int                              JAN;
      final int                              EVA;
            Mitarbeiter                      jan;
            Mitarbeiter                      eva;
            Collection<Mitarbeiter>          mitarbeiter;
            Datenauswerter                   d;
            boolean                          ok01;
            boolean                          ok02;
            boolean                          ok03;
            boolean                          ok04;
            boolean                          ok05;
            boolean                          ok06;
            boolean                          ok07;
            boolean                          ok08;
            boolean                          ok09;
            boolean                          ok10;
            boolean                          ok11;
            boolean                          ok12;
            boolean                          ok13;
            boolean                          ok14;
      
      T8  = new Time(800);
      T20 = new Time(2000);
      T10 = new Time(1000);
      T22 = new Time(2200);
      
      MO  = 1;
      DI  = 2;
      
      z1  = new Zutrittsberechtigung(1, MO, T8, T20);  // 1 Mo
      z2  = new Zutrittsberechtigung(2, MO, T8, T20);  // 2 Mo
      z3  = new Zutrittsberechtigung(3, MO, T8, T20);  // 3 Mo
      z4  = new Zutrittsberechtigung(4, MO, T8, T20);  // 4 Mo
      z5  = new Zutrittsberechtigung(4, DI, T8, T20);  // 4 Di
      
      berechtigungen1 = new Collection<>();   // 1, 2, 3 Mo
      berechtigungen2 = new Collection<>();   // 4       Mo,Di
      berechtigungen3 = new Collection<>();   // 1       Mo
      berechtigungen1.add(z1);
      berechtigungen1.add(z2);
      berechtigungen1.add(z3);
      berechtigungen2.add(z4);
      berechtigungen2.add(z5);
      berechtigungen3.add(z1);
      
      r1 = new Rolle(berechtigungen1);         // 1, 2, 3 Mo
      r2 = new Rolle(berechtigungen2);         // 4       Mo,Di
      r3 = new Rolle(berechtigungen3);         // 1       Mo
      
      rollen1 = new Collection<Rolle>();       // 1-4 Mo, 4 Di
      rollen2 = new Collection<Rolle>();       // 1   Mo
      rollen1.add(r1);
      rollen1.add(r2);
      rollen2.add(r3);
      
      JAN = 1;
      EVA = 2;
      jan = new Mitarbeiter(JAN, rollen1);     // 1-4 Mo, 4 Di
      eva = new Mitarbeiter(EVA, rollen2);     // 1   Mo
      
      mitarbeiter = new Collection<Mitarbeiter>();
      mitarbeiter.add(jan);
      mitarbeiter.add(eva);
      
      d = new Datenauswerter(1, mitarbeiter);
      // Der erste Parameter ist die Lesegeraet-ID.
      // Diese hat im Weiteren keine funktionelle Bedeutung.
      
      ok01 = d.zutrittspruefung(JAN, 1, MO, T8 ); // true
      ok02 = d.zutrittspruefung(JAN, 2, MO, T10); // true
      ok03 = d.zutrittspruefung(JAN, 3, MO, T10); // true
      ok04 = d.zutrittspruefung(JAN, 4, MO, T10); // true
      ok05 = d.zutrittspruefung(JAN, 4, DI, T10); // true
      ok06 = d.zutrittspruefung(JAN, 1, MO, T22); // false T22
      ok07 = d.zutrittspruefung(JAN, 1, DI, T10); // false 1&DI
      
      ok08 = d.zutrittspruefung(EVA, 1, MO, T10); // true
      ok09 = d.zutrittspruefung(EVA, 2, MO, T10); // false 2
      ok10 = d.zutrittspruefung(EVA, 3, MO, T10); // false 3
      ok11 = d.zutrittspruefung(EVA, 4, MO, T10); // false 4
      ok12 = d.zutrittspruefung(EVA, 4, DI, T10); // false 4,DI
      ok13 = d.zutrittspruefung(EVA, 1, MO, T22); // false T22
      ok14 = d.zutrittspruefung(EVA, 1, DI, T10); // false DI
      
      System.out.println("Soll: true    Ist: " + ok01);
      System.out.println("Soll: true    Ist: " + ok02);
      System.out.println("Soll: true    Ist: " + ok03);
      System.out.println("Soll: true    Ist: " + ok04);
      System.out.println("Soll: true    Ist: " + ok05);
      System.out.println("Soll: false   Ist: " + ok06);
      System.out.println("Soll: false   Ist: " + ok07);
      System.out.println();
      
      System.out.println("Soll: true    Ist: " + ok08);
      System.out.println("Soll: false   Ist: " + ok09);
      System.out.println("Soll: false   Ist: " + ok10);
      System.out.println("Soll: false   Ist: " + ok11);
      System.out.println("Soll: false   Ist: " + ok12);
      System.out.println("Soll: false   Ist: " + ok13);
      System.out.println("Soll: false   Ist: " + ok14);
   }
}