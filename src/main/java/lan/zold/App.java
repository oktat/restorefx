/*
* File: App.java
* Author: Sallai András
* Copyright: 2024, Sallai András
* Group: szit.hu
* Date: 2024-12-07
* Github: https://github.com/oktat/
* Licenc: MIT
*/

package lan.zold;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainScene"));
        stage.setScene(scene);
        stage.show();
    }

    static void trySetRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    public static void setRoot(String fxml) {
        try {
            trySetRoot(fxml);
        } catch (IOException e) {
            System.err.println("Hiba! A fájl betöltése sikertelen!");
            System.err.println(e.getMessage());
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }// a loadFXML vége

    public static void main(String[] args) {
        launch();
    } //a main függvény vége

}