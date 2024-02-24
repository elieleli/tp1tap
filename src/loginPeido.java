import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginPeido {

    @FXML
    private Button botaoEntrar;

    @FXML
    private TextField campoNome;

    @FXML
    void acaoPeidar(ActionEvent event) {
        String nome = campoNome.getText();
        System.out.println(nome+" é peidão HAHAHAHAAHAHAHA");
    }

}