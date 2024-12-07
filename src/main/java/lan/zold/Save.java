/*
* File: Save.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-07
* Github: https://github.com/oktat/
* Licenc: MIT
*/

// A lan.zold csomag neve. A zold.lan domainnévből:
package lan.zold;

//Importok jönnek

import java.io.FileWriter;
import java.io.IOException;

public class Save {
  /*
   * Elgondolkodtató, hogy legyen itt adatbázisba, vagy esetleg
   * REST API-ba mentés? Az adatábzis az manapság menő.
   * A REST API még menőbb. 
   */


  /* Termék tárolása fájlban */ 
  public void te(StoreTermek a) {
    try {
      /* Az i változó egy példány a FileWriter osztályból */
      FileWriter i = new FileWriter("products.txt", true);
      i.write(a.be);
      /* Ki kell írni kettőspontot is */
      i.write(":");
      i.write(a.a);
      /* Ki kell írni kettőspontot is újra*/
      i.write(":");
      i.write(String.valueOf(a.zi));
      i.write("\n");
      //A fájl lezárása jól jöhet
      i.close();   
    } catch (IOException e) {
      System.err.println("Hiba! A fájl írása sikertelen!");
      System.err.println(e.getMessage());
    }
  }
}
