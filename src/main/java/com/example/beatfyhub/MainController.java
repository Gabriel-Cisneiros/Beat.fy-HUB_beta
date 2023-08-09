package com.example.beatfyhub;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.awt.event.MouseEvent;

public class MainController {

    @FXML
    private Button moreButton, homeButton, exploreButton, recentButton, ftbButton, likedButton, artistsButton, albumsButton, loginButton;
    @FXML
    private void moreButtonClick(ActionEvent event){
        System.out.println("botão more clicado");
    }

    @FXML
    private void homeButtonClick(ActionEvent event){
        System.out.println("botão home clicado");
    }

    @FXML
    private void exploreButtonClick(ActionEvent event){
        System.out.println("botão explore clicado");
    }

    @FXML
    private void recentButtonClick(ActionEvent event){
        System.out.println("botão recent played clicado");
    }

    @FXML
    private void ftbButtonClick(ActionEvent event){
        System.out.println("botão feel the beat clicado");
    }

    @FXML
    private void likedButtonClick(ActionEvent event){
        System.out.println("botão liked clicado");
    }

    @FXML
    private void artistsButtonClick(ActionEvent event){
        System.out.println("botão artists clicado");
    }

    @FXML
    private void albumsButtonClick(ActionEvent event){
        System.out.println("botão albums clicado");
    }

    @FXML
    private void loginButtonClick(ActionEvent event){
        System.out.println("botão login spotify clicado");
    }

    @FXML
    private void favoriteMedia(){
        System.out.println("media favoritada");
    }

    @FXML
    private void shuffleMedia(){
        System.out.println("modo aleatorio");
    }

    @FXML
    private void previousMedia(){
        System.out.println("media anterior");
    }

    @FXML
    private void playMedia(){
        System.out.println("media tocando");
    }

    @FXML
    private void nextMedia(){
        System.out.println("proxima media");
    }

    @FXML
    private void loopMedia(){
        System.out.println("modo loop");
    }
}