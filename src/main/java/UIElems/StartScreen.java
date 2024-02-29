package UIElems;

import Events.StartButtonClicked;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class StartScreen extends Stage {


    Pane pane;
    Button startBtn;
    Button endBtn;
    Scene scene;

    public StartScreen(){
        pane = new Pane();
        startBtn = new Button("Start game");
        endBtn = new Button("Close");
        scene = new Scene(pane, 300,300);

        startBtn.setOnMouseClicked(event -> fireEvent(new StartButtonClicked()));

        endBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

}
