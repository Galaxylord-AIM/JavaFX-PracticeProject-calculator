package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label display;
    private long number1 = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    public void Numbers(ActionEvent event){
        if (start){
            display.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    public void Operator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!value.equals("=")){
            if (!operator.isEmpty())
                return;

            operator = value;
            number1 = Long.parseLong(display.getText());
            display.setText("");
        } else {
            if (operator.isEmpty())
                return;

            Long number2 = Long.parseLong(display.getText());
            float result = operation.operation(number1, number2,operator);
            display.setText(String.valueOf(result));
            operator = "";
            start = true;
        }
    }

}
