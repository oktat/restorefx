/*
* File: MainController.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-07
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField eancodeField;

    @FXML
    private TextField d;

    @FXML
    private TextField zField;

    @FXML
    void onSaveButton(ActionEvent event) {
        System.out.println("Mentés...");
        //Ellenőrizzük van-e adat
        if (eancodeField.getText().isEmpty() || d.getText().isEmpty() || zField.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Hiba! Kötelező kitölteni a mezőket!");
            alert.show();
            return;
        }

        //Ellenőrizzük, hogy az eancode 10 karakter és csak szám?
        if(eancodeField.getText().length() != 10 || !eancodeField.getText().matches("\\d+")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Hiba! Az eancode csak 10 karakter lehet, azonosító!");
            alert.show();
            return;
        }

        //Ellenőrizzük, hogy a név megfelelő?
        if(!d.getText().matches("[a-zA-ZáéóöőúüűíÁÉÓÖŐÚÜŰÍ]+")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Hiba! A nev csak betük lehet!");
            alert.show();
            return;
        }
        
        //Ellenőrizzük, hogy szám?
        if(!zField.getText().matches("\\d+")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Hiba! A mennyiség csak szám lehet!");
            alert.show();
            return;
        }
        // Példányosítjuk a terméket
        StoreTermek pr = new StoreTermek();
        pr.be = eancodeField.getText();
        pr.a = d.getText();
        pr.zi = Integer.parseInt(zField.getText());
        Save s = new Save();
        s.te(pr);
    }
}
