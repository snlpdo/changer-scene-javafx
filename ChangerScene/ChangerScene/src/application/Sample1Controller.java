package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Sample1Controller {
	Main main; // référence vers la fenêtre principale

	@FXML
	TextField loginTF; // champ d'identification

	@FXML
	PasswordField passwordTF; // champ de mot de passe

	/**
	 * Définir la fenêtre principale
	 *
	 * @param m
	 */
	void setMainInstance(Main m) {
		main = m;
	}

	@FXML
	void gererConnexion(ActionEvent e) {
		main.chargerScene(2, loginTF.getText());
	}
}
