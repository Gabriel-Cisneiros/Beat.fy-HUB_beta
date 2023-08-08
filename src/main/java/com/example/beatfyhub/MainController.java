package com.example.beatfyhub;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class MainController implements Initializable{

    @FXML
    private Pane mainBackgroundLabel;
    @FXML
    private Label mediaNameLabel;
    @FXML
    private Button playPauseButton, previousButton, nextButton, shuffleButton, repeatButton;
    @FXML
    private RadioButton likedButton;
    @FXML
    private Slider mediaVolumeSlider;
    @FXML
    private ProgressBar mediaProgressBar;

    public Media media;
    public MediaPlayer mediaPlayer;

    private File directory;
    private File[] files;

    private ArrayList<File> songs;

    private int songNumber;

    private Timer timer;
    private TimerTask task;
    private boolean running;

    public MainController() {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        songs = new ArrayList<File>();

        directory = new File("music");

        files = directory.listFiles();

        if (files != null){

            for (File file : files){
                songs.add(file);
            }
        }

//        media = new Media(songs.get(songNumber).toURI().toString());
//        mediaPlayer = new MediaPlayer(media);
//
//        mediaNameLabel.setText(songs.get(songNumber).getName());

    }

    public void playPauseMedia(){

    }
    public void previousMedia(){

    }
    public void nextMedia(){

    }
    public void shuffleMedia(){

    }
    public void repeatMedia(){

    }
    public void likedMedia(){

    }
    public void beginTimer(){

    }
    public void stopTimer(){

    }

}