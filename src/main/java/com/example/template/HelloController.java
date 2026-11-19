package com.example.template;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    public Label lblDisplay;
    @FXML
    public TextField txtInput;
    public Button b00,b01,b02,b10,b11,b12,b20,b21,b22;
    public Manager manager = new Manager();


    private Button[][] buttons=new Button[3][3];
    public void handleClick(ActionEvent e) {
        buttons[0][0] = b00;buttons[0][1] = b01;buttons[0][2] = b02;
        buttons[1][0] = b10;buttons[1][1] = b11;buttons[1][2] = b12;
        buttons[2][0] = b20;buttons[2][1] = b21;buttons[2][2] = b22;


    }

    public void handleClickSquare(ActionEvent e) {
        int row = GridPane.getRowIndex((Button) e.getSource());
        int column = GridPane.getColumnIndex((Button) e.getSource());
        System.out.println(row+", "+column);
        manager.setTileC(row,column);
        manager.changeWhoGo();


        updateScreen();
        //((Button) e.getSource()).setStyle("-fx-background-color: #2196F3; -fx-text-fill: #ffffff;");
    }
    public void updateScreen(){
        for (int i = 0 ; i< buttons.length; i++){
            for (int j = 0 ; j< buttons.length; j++){
                buttons[i][j].setStyle(manager.getTile(i,j).getTileColor());
            }

        }
        System.out.println(manager.checkwin());


    }

}