package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML public TextArea textArea;
    @FXML public Button plus;

    public void clickPlus(ActionEvent actionEvent) {
        textArea.appendText("+");
//        textArea.clear();
//        textArea.requestFocus();
    }

    public void clickMinus(ActionEvent actionEvent) {
        textArea.appendText("-");
    }

    public void clickMulty(ActionEvent actionEvent) {
        textArea.appendText("*");
    }

    public void clickSplit(ActionEvent actionEvent) {
        textArea.appendText("/");
    }

    public void clickSeven(ActionEvent actionEvent) {
        textArea.appendText("7");
    }

    public void clickEight(ActionEvent actionEvent) {
        textArea.appendText("8");

    }

    public void clickNine(ActionEvent actionEvent) {
        textArea.appendText("9");
    }

    public void clickFour(ActionEvent actionEvent) {
        textArea.appendText("4");
    }

    public void clickFive(ActionEvent actionEvent) {
        textArea.appendText("5");
    }

    public void clickSex(ActionEvent actionEvent) {
        textArea.appendText("6");
    }

    public void clickClear(ActionEvent actionEvent) {
        textArea.clear();
    }

    public void clickOne(ActionEvent actionEvent) {
        textArea.appendText("1");
    }

    public void clickTwo(ActionEvent actionEvent) {
        textArea.appendText("2");
    }

    public void clickThree(ActionEvent actionEvent) {
        textArea.appendText("3");
    }

    public void clickEqually(ActionEvent actionEvent) {
    }

    public void clickZero(ActionEvent actionEvent) {
        textArea.appendText("0");
    }

    public void clickDouble(ActionEvent actionEvent) {
        textArea.appendText(".");
    }
}
