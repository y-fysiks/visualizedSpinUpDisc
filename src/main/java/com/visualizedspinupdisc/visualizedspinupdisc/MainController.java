package com.visualizedspinupdisc.visualizedspinupdisc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.util.ArrayList;

public class MainController {

    public TextField velocity;
    public TextField angle;
    public TextField height;
    public Button calculateButton;
    public LineChart<Number, Number> graph;
    public VBox vbox;

    @FXML
    public void initialize() throws IOException {
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setForceZeroInRange(true);
        xAxis.setTickUnit(1);
        xAxis.setLabel("Distance");
        yAxis.setForceZeroInRange(true);
        yAxis.setLabel("Height");
        yAxis.setTickUnit(0.5);

        graph = new LineChart<>(xAxis, yAxis);
        graph.setMaxWidth(1000);
        vbox.getChildren().add(graph);
        graph.setVisible(false);
    }

    public void calculatePressed(ActionEvent actionEvent) {
        double a, v, h;
        try {
            a = Double.parseDouble(angle.getText());
            v = Double.parseDouble(velocity.getText());
            h = Double.parseDouble(height.getText());
        } catch (Exception e) {
            return;
        }
        //launch angle in degrees: lA
        //total velocity vector in meter per second: vV
        //launchHeight in inches: lH
        calcConstants disc1 = new calcConstants(a, v, h, 0);
        ArrayList<double[]> results = disc1.runSim();

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("disc" + FrisbeeTest.curInstance());
        for (double[] cds : results) {
            series.getData().add(new XYChart.Data<>(cds[0], cds[1]));
        }
        graph.getData().add(series);
        graph.setVisible(true);
    }
}