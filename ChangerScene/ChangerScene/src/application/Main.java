package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	Stage pStage;

	@Override
	public void start(Stage primaryStage) {
		pStage = primaryStage;

		chargerScene(1, "Connexion");

		pStage.setResizable(false);
		pStage.show();
	}

	/**
	 * Charger la scène spécifiée dans la fenêtre principale.
	 *
	 * @param sceneIdx
	 *            Numéro de la scène
	 * @param titre
	 *            Nouveau titre pour la scène
	 */
	void chargerScene(int sceneIdx, String titre) {
		FXMLLoader loader;
		Scene scene = null;

		// Charger le fichier FXML approprié
		try {
			switch (sceneIdx) {
			case 1: // identification
				loader = new FXMLLoader(getClass().getResource("Sample1.fxml"));
				scene = new Scene(loader.load());

				Sample1Controller controleur1 = (Sample1Controller) loader.getController();
				controleur1.setMainInstance(this);
				break;
			case 2: // chat
				loader = new FXMLLoader(getClass().getResource("Sample2.fxml"));
				scene = new Scene(loader.load());

				Sample2Controller controleur2 = (Sample2Controller) loader.getController();
				controleur2.setMainInstance(this);
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		pStage.setScene(scene); // Changer la scène
		pStage.setTitle(titre); // Modifier le titre de la fenêtre

	}

	public static void main(String[] args) {
		launch(args);
	}
}
