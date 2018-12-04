package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;


public class Controller {

    @FXML
    private GridPane gpane;

    @FXML
    public void initialize() throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("fxml/buttons.fxml"));
        Pane pane = new Pane();
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MenuScreen menuScreen = loader.getController();
        menuScreen.setController(this);
        setScreen(pane);
    }

    public void setScreen(Pane pane) {
        gpane.getChildren().add(pane);
    }
}
