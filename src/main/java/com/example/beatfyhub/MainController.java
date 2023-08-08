package com.example.beatfyhub;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {

    @FXML
    private Button navbarButton1, navbarButton2, navbarButton3, navbarButton4;

    @FXML
    protected void initialize() {
        navbarButton1.setOnAction(this::handleNavbarButton1Click);
    }
    @FXML
    private void handleNavbarButton1Click(ActionEvent event) {
        System.out.println("Botão Navbar 1 clicado!");
    }

    @FXML
    private void handleNavbarButton2Click(ActionEvent event) {
        System.out.println("Botão Navbar 2 clicado!");
    }

    @FXML
    private void handleNavbarButton3Click(ActionEvent event) {
        System.out.println("Botão Navbar 3 clicado!");
    }

    @FXML
    private void handleNavbarButton4Click(ActionEvent event) {
        System.out.println("Botão Navbar 4 clicado!");
    }
}