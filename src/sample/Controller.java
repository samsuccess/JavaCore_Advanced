package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML public TextArea textArea;
    @FXML public TextField textfield;

    public void clickSend(ActionEvent actionEvent) {
        textArea.appendText(textfield.getText() + "\n");
        textfield.clear();
        textfield.requestFocus();
    }
}
