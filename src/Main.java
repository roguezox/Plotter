import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.File;

public class Main extends Application {
    String dir=System.getProperty("user.home");
    @Override
    public void start(Stage stage) throws Exception {
         FXMLLoader loader = new FXMLLoader(new File(dir+"/Music/thermo/main.fxml").toURI().toURL());

    }
}
