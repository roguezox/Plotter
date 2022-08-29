import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.application.Application;

import java.io.File;

public class Main extends Application {
    String dir=System.getProperty("user.dir");
    @Override
    public void start(Stage stage) throws Exception {
         FXMLLoader loader = new FXMLLoader(new File(dir+"/plotter/ui/main.fxml").toURI().toURL());
        loader.setController(new homepage());
        Parent root = loader.load();
        Stage primaryStage=new Stage();
        primaryStage.setScene(new Scene(root,1298,760));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
