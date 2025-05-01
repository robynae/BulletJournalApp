package edu.umn.d.mclau448.robynplanner;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setMinHeight(720);
        stage.setMinWidth(1280);


        BorderPane content = new BorderPane();

        stage.setTitle("BulletJournal App");

        Label hello = new Label("Welcome.");
        hello.setStyle("-fx-font-family:'Cambria'; -fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: linear-gradient(to bottom right, #F765F2, #EDB67B)");

        Button newPage = new Button("+");
        newPage.setFont(Font.font("Cambria", FontWeight.BOLD, 24));
        newPage.setPrefSize(30,30);
        newPage.setStyle("-fx-background-color: transparent;" +
                "-fx-text-fill: #F765F2;" +
                " -fx-border-radius: 50;" +
                " -fx-border-width: 5px;" +
                " -fx-border-color: linear-gradient(to bottom right, #EDB67B, #F765F2)");

        VBox buttonBox = new VBox(10);
        buttonBox.getChildren().addAll(hello, newPage);

        BorderPane.setMargin(buttonBox, new Insets(25,0,0,25));
        content.setTop(buttonBox);


        Scene scene = new Scene(content,1280,720);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}