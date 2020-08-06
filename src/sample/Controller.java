package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private TableColumn<Valeurs,Float> col_V;

    @FXML
    private TableView<Valeurs> tableauValeurs;

    @FXML
    private MenuItem Help;

    @FXML
    private LineChart<Number, Number> Graphe1;

    @FXML
    private TableColumn<Valeurs, Float> col_P;

    @FXML
    private TextField Text_I;

    @FXML
    private Button Button_Ajouter;

    @FXML
    private TextField text_V;

    @FXML
    private TableColumn<Valeurs,Float> col_I;

    private ObservableList<Valeurs> data=FXCollections.observableArrayList();;

    @FXML
    private TextField Text_temperature;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        col_I.setCellValueFactory(new PropertyValueFactory<>("col_I"));
        col_V.setCellValueFactory(new PropertyValueFactory<>("col_V"));
        col_P.setCellValueFactory(new PropertyValueFactory<>("col_P"));

       tableauValeurs.setItems(data);


       // line chart

        XYChart.Series<Number, Number> series1 = new XYChart.Series<>();
        series1.setName("Series 1");
        series1.getData().add(new XYChart.Data<>(1, 20));
        series1.getData().add(new XYChart.Data<>(2, 100));
        series1.getData().add(new XYChart.Data<>(3, 80));
        series1.getData().add(new XYChart.Data<>(4, 180));
        series1.getData().add(new XYChart.Data<>(5, 20));
        series1.getData().add(new XYChart.Data<>(6, -10));
        Graphe1.getData().add(series1);



    }




    @FXML
    void AjouterValeurs(ActionEvent event) {

        data.add(new Valeurs(Float.parseFloat(text_V.getText()),Float.parseFloat(Text_I.getText()),0, Float.parseFloat(text_V.getText())*Float.parseFloat(Text_I.getText())));
        col_I.setCellValueFactory(new PropertyValueFactory<>("valeur_I"));
        col_V.setCellValueFactory(new PropertyValueFactory<>("val_v"));
        col_P.setCellValueFactory(new PropertyValueFactory<>("P"));

        tableauValeurs.setItems(data);

    }




    @FXML
    void OuvreApropos(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("Apropos.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }


}
