package registrodeproductos;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ProductoController implements Initializable {

    private static final String ARCHIVO_PRODUCTOS = "productos.dat";
    
    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEliminarSelec;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtPrecio;
    
    @FXML
    private ComboBox<String> cmbCategoria;
    
    @FXML
    private TableView tabla;
    
    @FXML
    private TableColumn colNombre;
    
    @FXML
    private TableColumn colPrecio;
    
    @FXML
    private TableColumn colCategoria;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbCategoria.getItems().addAll("Electrónica", "Alimentos", "Indumentaria");

    
        cmbCategoria.getSelectionModel().selectFirst();
    }    
    
}
