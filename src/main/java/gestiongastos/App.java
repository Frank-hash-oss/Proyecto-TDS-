package gestiongastos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage ventana) {
		Label mensaje = new Label("Gestión de Gastos");
		StackPane contenido = new StackPane(mensaje);
		Scene escena = new Scene(contenido, 800, 500);

		ventana.setTitle("Proyecto TDS");
		ventana.setScene(escena);
		ventana.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
