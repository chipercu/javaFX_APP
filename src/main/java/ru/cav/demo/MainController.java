package ru.cav.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class MainController {

    @FXML
    private TextArea allMessege;

    @FXML
    private TextField messegeTextField;

    @FXML
    private void sendMessegeButtonAction(ActionEvent actionEvent){

            allMessege.appendText("\n");
            allMessege.appendText("mamkinHatzker: " + messegeTextField.getText());
            if (allMessege.getText().toCharArray().length > 40){
                allMessege.appendText("\nК беседе присоединился новый участник - майор Шевчук А.Б. \"ФСБ-сила\" !");
            }
            messegeTextField.clear();
    };
}