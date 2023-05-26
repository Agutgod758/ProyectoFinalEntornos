package com.example.interfazmbc;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class InterfazCalculadora extends Application {

        private TextField peso;
        private TextField altura;
        private TextField edad;
        private TextField genero;
        private ChoiceBox<String> nivelActividad;
        private RadioButton premium;
        private RadioButton basico;
        private TextField objetivo;

        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Calculadora Nutricional");

            GridPane gridPane = new GridPane();
            gridPane.setPadding(new Insets(20));
            gridPane.setHgap(10);
            gridPane.setVgap(10);

            // Peso
            Label pesoLabel = new Label("Peso (kg):");
            peso = new TextField();
            gridPane.add(pesoLabel, 0, 0);
            gridPane.add(peso, 1, 0);

            // Altura
            Label alturaLabel = new Label("Altura (cm):");
            altura = new TextField();
            gridPane.add(alturaLabel, 0, 1);
            gridPane.add(altura, 1, 1);

            // Edad
            Label edadLabel = new Label("Edad:");
            edad = new TextField();
            gridPane.add(edadLabel, 0, 2);
            gridPane.add(edad, 1, 2);

            // Género
            Label generoLabel = new Label("Género:");
            genero = new TextField();
            gridPane.add(generoLabel, 0, 3);
            gridPane.add(genero, 1, 3);

            // Nivel de Actividad
            Label nivelActividadLabel = new Label("Nivel de Actividad:");
            nivelActividad = new ChoiceBox<>();
            nivelActividad.getItems().addAll("Suave", "Moderado", "Activo", "Muy activo");
            nivelActividad.setValue("Suave");
            gridPane.add(nivelActividadLabel, 0, 4);
            gridPane.add(nivelActividad, 1, 4);

            // Tipo de Usuario (Premium o Básico)
            ToggleGroup tipoUsuarioToggleGroup = new ToggleGroup();
            premium = new RadioButton("Premium");
            basico = new RadioButton("Básico");
            premium.setToggleGroup(tipoUsuarioToggleGroup);
            basico.setToggleGroup(tipoUsuarioToggleGroup);

            // Objetivo (solo para usuarios Premium)
            Label objetivoLabel = new Label("Objetivo:");
            objetivo = new TextField();
            objetivo.setDisable(true);

            VBox objetivoVBox = new VBox();
            objetivoVBox.setSpacing(5);
            objetivoVBox.getChildren().addAll(objetivoLabel, objetivo);

            HBox tipoUsuarioHBox = new HBox(10);
            tipoUsuarioHBox.getChildren().addAll(premium, basico, objetivoVBox);

            gridPane.add(tipoUsuarioHBox, 0, 5, 2, 1);

            // Listener para mostrar/ocultar el campo de objetivo
            tipoUsuarioToggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
                if (newValue == premium) {
                    objetivo.setDisable(false);
                    objetivo.setVisible(true);
                    objetivoLabel.setVisible(true);
                } else if (newValue == basico) {
                    objetivo.setDisable(true);
                    objetivo.setVisible(false);
                    objetivoLabel.setVisible(false);
                }
            });

            // Botón Calcular
            Button calcularButton = new Button("Calcular");
            calcularButton.setOnAction(e -> calcular());

            gridPane.add(calcularButton, 0, 6, 2, 1);

            Scene scene = new Scene(gridPane, 400, 300);
            scene.getStylesheets().add("estilos.css");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        private void calcular() {
            // Obtener los valores de los campos de texto y realizar los cálculos
            int peso = Integer.parseInt(this.peso.getText());
            int altura = Integer.parseInt(this.altura.getText());
            int edad = Integer.parseInt(this.edad.getText());
            String genero = this.genero.getText();
            String nivelActividad = this.nivelActividad.getValue();
            boolean esPremium = premium.isSelected();
            String objetivo = this.objetivo.getText();



            System.out.println("Se realizan cálculos con los siguientes valores:");
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);
            System.out.println("Edad: " + edad);
            System.out.println("Género: " + genero);
            System.out.println("Nivel de Actividad: " + nivelActividad);
            System.out.println("Es Premium: " + esPremium);
            System.out.println("Objetivo: " + objetivo);
        }

        public static void main(String[] args) {
            launch(args);
        }


}
