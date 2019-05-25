package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    private TextField field;

    @FXML
    private Button btn_add;

    @FXML
    private Button btn_sub;

    @FXML
    private Button btn_mul;

    @FXML
    private Button btn_div;

    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_calc;

    private char op;
    private int num, num2, ans;
    public void btnpress (ActionEvent event){
        if(event.getSource() == btn_add){
            op = '+';
        }
        if(event.getSource() == btn_sub){
            op = '-';
        }
        if(event.getSource() == btn_div){
            op = '/';
        }
        if(event.getSource() == btn_mul){
            op = '*';
        }
        num = Integer.parseInt(field.getText());
        field.setText("");
    }
    public void calculate(ActionEvent event){
        num2 = Integer.parseInt(field.getText());
        if(op == '+'){
            ans = num + num2;
        }
        if(op == '-'){
            ans = num - num2;
        }
        if(op == '/'){
            if(num2 != 0)
            ans = num / num2;
        }
        if(op == '*'){
            ans = num * num2;
        }
        field.setText(Integer.toString(ans));
    }
    public void clear(ActionEvent event){
        field.setText("");

    }
}
