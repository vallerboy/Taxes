package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    Button buttonClickMe;

    @FXML
    Label labelShowSentence;

    String[] sentenceArray = {"Dzień jak codzień", "Uśmiech to podstawa", "Pieniądze szczęścia nie dają", "Swiat jest piękny"};
    Random random = new Random();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonClickMe.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                labelShowSentence.setText(sentenceArray[random.nextInt(sentenceArray.length)]);
            }
        });
    }
}
