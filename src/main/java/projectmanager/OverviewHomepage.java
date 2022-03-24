package projectmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class OverviewHomepage extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        VBox buttonRow = new VBox();
        HBox.setHgrow(buttonRow, Priority.ALWAYS);

        TextArea textArea = new TextArea("Test");
        //textArea.setPrefWidth(100);
        textArea.setMaxWidth(TextArea.USE_PREF_SIZE);
        textArea.setMinWidth(TextArea.USE_PREF_SIZE);

        HBox box = new HBox(10, textArea);

        Scene scene = new Scene(box);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
