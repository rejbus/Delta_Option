package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuScreen {

    @FXML
    private Pane appPane;
    private Controller controller;

    @FXML
    public void openApplication() {
    FXMLLoader loader = new FXMLLoader(this.getClass().getResource("fxml/appScreen.fxml"));
    Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }controller.setScreen(pane);
    }

    @FXML
    void openCount() {

    }

    @FXML
    void exit() {

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}