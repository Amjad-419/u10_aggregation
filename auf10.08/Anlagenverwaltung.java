// u10_aggregation
// auf10.8

public class Anlagenverwaltung
{
   public static void main(String[] args)
   {
      Raum      raum1    = new Raum("Buero");
      
      Geraet    geraet1  = new Geraet("PC 1"   , 200);
      Geraet    geraet2  = new Geraet("PC 2"   , 300);
      Geraet    geraet3  = new Geraet("Drucker", 800);
      
      Bauteil   bauteil1 = new Bauteil("Soundkarte"   , 100);
      Bauteil   bauteil2 = new Bauteil("Grafikkarte 1", 200);
      Bauteil   bauteil3 = new Bauteil("Mainboard X"  ,  20);
      Bauteil   bauteil4 = new Bauteil("Grafikkarte 2", 150);
      Bauteil   bauteil5 = new Bauteil("Festplatte"   ,  15);
      Bauteil   bauteil6 = new Bauteil("Mainboard Y"  ,  10);
      Bauteil   entfernt = null;
      
      Prozessor cpu1     = new Prozessor("Sempron", 100);
      Prozessor cpu2     = new Prozessor("Pentium", 200);
      Prozessor cpu3     = new Prozessor("Xeon"   , 250);
      
      bauteil3.setzeEin(cpu1);
      bauteil6.setzeEin(cpu2);
      
      geraet1.baueEinInSteckplatzA(bauteil1);
      geraet1.baueEinInSteckplatzB(bauteil2);
      geraet1.baueEinInSteckplatzC(bauteil3);
      geraet2.baueEinInSteckplatzA(bauteil4);
      geraet2.baueEinInSteckplatzB(bauteil5);
      geraet2.baueEinInSteckplatzC(bauteil6);
      
      raum1.statteAusMit(geraet1);                               // 620 Watt
      raum1.statteAusMit(geraet2);                               // 675 Watt
      raum1.statteAusMit(geraet3);                               // 800 Watt
      
      System.out.println(geraet1.getBezeichnung() + ": " +
                         geraet1.gesamtLeistung() + " Watt");
      System.out.println(geraet2.getBezeichnung() + ": " +
                         geraet2.gesamtLeistung() + " Watt");
      System.out.println(geraet3.getBezeichnung() + ": " +
                         geraet3.gesamtLeistung() + " Watt");
      System.out.println(raum1.getBezeichnung()   + ": " +
                         raum1.gesamtLeistung()   + " Watt");
      System.out.println();
      
      entfernt = geraet1.entferneBauteilVonSteckplatzA();      // - 100 Watt
      System.out.println("Entfernt: " + entfernt.getBezeichnung());
      System.out.println();
      bauteil6.setzeEin(cpu3);                                 // +  50 Watt
      
      System.out.println(geraet1.getBezeichnung() + ": " +
                         geraet1.gesamtLeistung() + " Watt");
      System.out.println(geraet2.getBezeichnung() + ": " +
                         geraet2.gesamtLeistung() + " Watt");
      System.out.println(geraet3.getBezeichnung() + ": " +
                         geraet3.gesamtLeistung() + " Watt");
      System.out.println(raum1.getBezeichnung()   + ": " +
                         raum1.gesamtLeistung()   + " Watt");
   }
}
