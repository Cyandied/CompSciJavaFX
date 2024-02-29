package Main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXApp extends Application {

    private RobotsGame game;
    public void init() {
        this.game = new RobotsGame(10, 10); // Initialize the game with a 5x5 world
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Robot game");
        Pane pane = game.playArea.robotPane;
        Button btn = new Button("step");
        pane.getChildren().add(btn);
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                game.step();
            }
        });
        primaryStage.setScene(new Scene(pane,pane.getWidth(), pane.getHeight()));
        primaryStage.show();


    }

    public void stop(){

    }

    public static void main(String[] args) {
        launch(args);
    }

}
