package edu.umn.d.mclau448.robynplanner;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setMinHeight(720);
        stage.setMinWidth(1280);


        BorderPane content = new BorderPane();
        content.setStyle("-fx-background-color: #fdf6f0");

        stage.setTitle("BulletJournal App");

        //Styling the welcome text
        Label hello = new Label("Welcome.");
        hello.setStyle("-fx-font-family:'Cambria';" +
                " -fx-font-size: 36px;" +
                " -fx-font-weight: bold;" +
                " -fx-text-fill: linear-gradient(to bottom right, #F765F2, #EDB67B)");

        //Styling the button
        Button newPage = new Button("+");
        newPage.setFont(Font.font("Cambria", FontWeight.BOLD, 20));
        newPage.setPrefSize(25,25);
        newPage.setStyle("-fx-background-color: transparent;" +
                "-fx-text-fill: #F765F2;" +
                " -fx-border-radius: 50;" +
                " -fx-border-width: 5px;" +
                " -fx-border-color: linear-gradient(to bottom right, #EDB67B, #F765F2)");

        RotateTransition rotateNewPage = new RotateTransition(Duration.millis(750), newPage);
        rotateNewPage.setByAngle(360);
        rotateNewPage.setCycleCount(0);

        //Create an animation
        newPage.setOnMouseEntered(e -> {
            newPage.setStyle("-fx-background-color: transparent;" +
                    "-fx-text-fill: #F765F2;" +
                    " -fx-border-radius: 50;" +
                    " -fx-border-width: 5px;" +
                    " -fx-border-color: linear-gradient(to bottom right, #EDB67B, #F765F2);" +
                    "-fx-cursor: hand"
            );
            if(rotateNewPage.getStatus() != Animation.Status.RUNNING){
                rotateNewPage.playFromStart();
            }
        });


        //Creating the header
        VBox header = new VBox(10);
        header.getChildren().addAll(hello, newPage);
        BorderPane.setMargin(header, new Insets(25,0,0,25));
        content.setTop(header);


        //Creating container for pages
        GridPane pageContainer = new GridPane();
        pageContainer.setStyle("-fx-background-color: transparent");
        pageContainer.setHgap(10);
        pageContainer.setVgap(10);
        pageContainer.setPadding(new Insets(50));

        //A Page...to be deleted later as they need to be dynamically added to the interface. But, need this for a proof of concept...
        Pane page = new Pane();
        page.setPrefSize(200, 100);
        page.setStyle("-fx-background-color: linear-gradient(to top left, #EDB67B, #F765F2); -fx-border-radius: 15; -fx-background-radius: 15");

        //I've gone insane in the membrane... create a DropShadow for the Page
        DropShadow pageShadow = new DropShadow();
        pageShadow.setRadius(10);
        pageShadow.setOffsetX(4);
        pageShadow.setOffsetY(4);
        pageShadow.setColor(Color.rgb(0,0,0,0.3));
        page.setEffect(pageShadow);

        Label projectTitle = new Label("Final CS Project");
        projectTitle.setStyle(
                "-fx-font-family:'Cambria';" +
                " -fx-font-size: 24px;" +
                " -fx-font-weight: bold;" +
                " -fx-text-fill: #fdf6f0");
        projectTitle.setLayoutX(20);
        projectTitle.setLayoutY(40);
        page.getChildren().add(projectTitle);

        page.setOnMouseEntered(e -> {
            page.setStyle("-fx-background-color: linear-gradient(to top left, #EDB67B, #F765F2); -fx-border-radius: 15; -fx-background-radius: 15; -fx-cursor: hand");
            DropShadow hoverShadow = new DropShadow();
            hoverShadow.setRadius(10);
            hoverShadow.setOffsetX(7);
            hoverShadow.setOffsetY(7);
            hoverShadow.setColor(Color.rgb(0,0,0,0.4));
            page.setEffect(hoverShadow);
        });

        page.setOnMouseExited(e -> page.setEffect(pageShadow));

        pageContainer.add(page, 0,0);
        content.setCenter(pageContainer);

        Scene scene = new Scene(content,1280,720);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}