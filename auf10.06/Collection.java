// u10_aggregation
// auf10.06

import java.util.*;

public class Collection<T>
{
   private ArrayList<T> liste = new ArrayList<>();
   
   public int length()
   {
      return liste.size();
   }
   
  /**
   * Der Index des ersten Elements ist 0.
   */
   public T get(int index)
   {
      return liste.get(index);
   }
   
   public void add(T objekt)
   {
      liste.add(objekt);
   }
}