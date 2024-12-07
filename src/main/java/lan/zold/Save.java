/*
* File: Save.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-07
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
  /*
   * Elgondolkodtató, hogy legyen itt adatbázisba, vagy esetleg
   * REST API-ba mentés? Az adatábzis az manapság menő.
   * A REST API még menőbb. 
   */

  public void te(StoreTermek a) {
    try {
      FileWriter i = new FileWriter("products.txt", true);
      i.write(a.be);
      i.write(":");
      i.write(a.a);
      i.write(":");
      i.write(String.valueOf(a.zi));
      i.write("\n");
      i.close();        
    } catch (IOException e) {
      System.err.println("Hiba! A fájl írása sikertelen!");
      System.err.println(e.getMessage());
    }
  }
}
