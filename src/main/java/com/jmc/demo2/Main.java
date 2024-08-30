package com.jmc.demo2;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.beans.binding.ObjectExpression;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.property.ReadOnlyIntegerProperty;

import javax.swing.plaf.basic.BasicTableUI;
import java.lang.reflect.Field;
import java.util.List;

public class Main extends Application {
    public static void main(String args[]){
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        Employee employee = new Employee("John", 44000);

        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);

        Label label = new Label();
        Button button = new Button("Add to list");
        TextField textField = new TextField();

        ObservableList<String> list = FXCollections.observableArrayList("Minh", "Hoang", "Long");
        ListView<String> listview = new ListView<>();
        listview.setItems(list);
        textField.setMaxWidth(180);

        button.setOnAction(e -> {
            if(!textField.textProperty().get().isEmpty()){
                list.add(textField.textProperty().get());
            }
        });

        root.getChildren().addAll(listview, textField, button);
        Scene scene = new Scene(root,350, 350);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception{
        System.out.println("Task Ended");
    }
}